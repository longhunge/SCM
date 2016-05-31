package com.lcx.dao.impl;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.hibernate.SessionFactory;

import com.lcx.dao.UserDao;
import com.lcx.entity.User;

public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@Resource
	SessionFactory sessionFactory;
	@Override
	public void exportExcel(List<User> list, ServletOutputStream out) {
		// 1、创建工作簿
		HSSFWorkbook work = new HSSFWorkbook();
		// 1.1、创建合并单元格对象
		CellRangeAddress cra = new CellRangeAddress(0, 0, 0, 7);
		// 1.3、列标题样式
		HSSFCellStyle style1 = creatStyle(work, (short) 16);
		HSSFCellStyle style2 = creatStyle(work, (short) 13);
		// 2、创建工作表
		HSSFSheet sheet = work.createSheet("用户表");
		// 2.1、加载合并单元格对象
		sheet.addMergedRegion(cra);
		// 3、创建行
		HSSFRow row1 = sheet.createRow(0);
		HSSFRow row2 = sheet.createRow(1);
		// 3.1、创建头标题行；并且设置头标题
		String[] cellName = { "帐号", "密码", "姓名", "性别", "权限", "手机", "邮箱", "生日",
				"状态", "等级" };
		HSSFCell cell = row1.createCell(0);
		for (int i = 0; i < cellName.length; i++) {
			HSSFCell cell10 = row2.createCell(i);
			// 加载单元格样式
			cell10.setCellStyle(style2);
			cell10.setCellValue(cellName[i]);
		}
		cell.setCellStyle(style1);
		cell.setCellValue("用户列表");
		// 3.2、创建列标题行；并且设置列标题
		// 4、操作单元格；将用户列表写入excel
		if (list != null) {
			for (int j = 0; j < list.size(); j++) {
				HSSFRow row3 = sheet.createRow(j+2);	
				HSSFCell cell0=row3.createCell(0);
				cell0.setCellValue(list.get(j).getU_account());
				HSSFCell cell1=row3.createCell(1);
				cell1.setCellValue(list.get(j).getU_pwd());
				HSSFCell cell2=row3.createCell(2);
				cell2.setCellValue(list.get(j).getU_name());
				HSSFCell cell3=row3.createCell(3);
				cell3.setCellValue(list.get(j).getU_sex());
				HSSFCell cell4=row3.createCell(4);
				cell4.setCellValue(list.get(j).getU_privilege());
				HSSFCell cell5=row3.createCell(5);
				cell5.setCellValue(list.get(j).getU_phone());
				HSSFCell cell6=row3.createCell(6);
				cell6.setCellValue(list.get(j).getU_email());
				HSSFCell cell7=row3.createCell(7);
				cell7.setCellValue(list.get(j).getU_birthday());
				HSSFCell cell8=row3.createCell(8);
				cell8.setCellValue(list.get(j).getU_status());
				HSSFCell cell9=row3.createCell(9);
				cell9.setCellValue(list.get(j).getU_rank());

			}

		}
		try {
			work.write(out);
			work.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 5、输出
		//
		
		
		// TODO Auto-generated method stub
		
	}
	public HSSFCellStyle creatStyle(HSSFWorkbook work,short fontsize){
		// 1.2、头标题样式
		HSSFCellStyle style = work.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		// 1.2.1 创建字体
		HSSFFont font = work.createFont();
		// 1.2.2设置字体
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		font.setFontHeightInPoints(fontsize);
		// 1.2.3 加载字体
		style.setFont(font);
		return style;
	}
	
	public void importExcel(File importExcel, String importExcelFileName) throws Exception{
		// 可以使用正则表达式来判断
		if (importExcelFileName.matches("^.+\\.(?i)((xls)|(xlsx))$")) {
			boolean Excel03 = importExcelFileName.matches("^.+\\.(?i)(xls)$");
			FileInputStream fis = new FileInputStream(importExcel);
			// 读取工作簿
			Workbook hfw = Excel03 ? new HSSFWorkbook(fis) : new HSSFWorkbook(
					fis);
			// 2.读取工作表,由工作表创建
			Sheet sh = hfw.getSheetAt(0);
			// 判断是否为空
			if (sh.getPhysicalNumberOfRows() > 2) {
				// 3.读取行,从0开始的
				User user = null;
				for (int i = 2; i < sh.getPhysicalNumberOfRows(); i++) {
					Row hr = sh.getRow(i);
					user = new User();
					Cell hc0 = hr.getCell(0);
					user.setU_account(hc0.getStringCellValue());
					Cell hc1 = hr.getCell(1);
					user.setU_pwd(hc1.getStringCellValue());
					Cell hc2 = hr.getCell(2);
					user.setU_name(hc2.getStringCellValue());
					Cell hc3 = hr.getCell(3);
					Cell hc4 = hr.getCell(4);;
					try {
						user.setU_sex(hc3.getStringCellValue());
						
					} catch (Exception e1) {	
						user.setU_sex(String.valueOf((int)hc3.getNumericCellValue()));
					}
					try {
						user.setU_privilege(hc4.getStringCellValue());
					} catch (Exception e1) {	
						user.setU_privilege(String.valueOf((int)hc4.getNumericCellValue()));
					}
					
					Cell hc5 = hr.getCell(5);
					try {
						user.setU_phone(hc5.getStringCellValue());
					} catch (Exception e) {
						double dphone = hc5.getNumericCellValue();
						user.setU_phone(BigDecimal.valueOf(dphone).toString());
					}
					Cell hc6 = hr.getCell(6);
					user.setU_email(hc6.getStringCellValue());
					Cell hc7 = hr.getCell(7);
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
					user.setU_birthday(hc7.getDateCellValue());
					Cell hc8 = hr.getCell(8);
					
					try {
						user.setU_status(hc8.getStringCellValue());
					} catch (Exception e1) {	
						user.setU_status(String.valueOf((int)hc8.getNumericCellValue()));
					}
					
					save(user);
				}
			}
			// 4.读取单元格，从0开始的
			fis.close();
			hfw.close();
		}
	}
	@Override
	public User findUser(User user) {
		user = (User) sessionFactory.getCurrentSession()//
				.createQuery("from User where u_account=? and u_pwd=?")//
				.setString(0, user.getU_account())//
				.setString(1, user.getU_pwd())//
				.uniqueResult();
		return user;
	}
	
}
