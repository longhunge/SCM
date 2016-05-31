package test.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.junit.Test;

public class Testpio {
	//@Test
	public void testpiotwrite(){
		//1.创建工作簿
		HSSFWorkbook hfw=new HSSFWorkbook();
		//2.创建工作表,由工作表创建
		HSSFSheet   hs=hfw.createSheet();
		//3.创建行,从0开始的
		HSSFRow hr= hs.createRow(4);
		//4.创建单元格，从0开始的
		HSSFCell hc=hr.createCell(3);
		hc.setCellValue("你好啊！");
		
		try {
			//输出到硬盘
			FileOutputStream fos=new FileOutputStream("D:\\测试1.xlsx");
			//把excel输出到文件中
			hfw.write(fos);
			hfw.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	@Test
	public void readExcel() {
		// 1.读取工作簿
		HSSFWorkbook hfw = null;
		
		try {
			FileInputStream in=new FileInputStream("d:\\测试.xlsx");
			CellRangeAddress cra=new CellRangeAddress(2,2,5,5);
			
			hfw = new HSSFWorkbook(in);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// 2.读取工作表,由工作表创建
		HSSFSheet hs = hfw.getSheetAt(0);
		// 3.读取行,从0开始的
		HSSFRow hr = hs.getRow(4);
		// 4.读取单元格，从0开始的
		HSSFCell hc = hr.getCell(3);
		System.out.println(hc.getStringCellValue());

		try {
			// 输出到硬盘
			FileOutputStream fos = new FileOutputStream("D:\\测试.xls");
			// 把excel输出到文件中
			hfw.write(fos);
			
			hfw.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	@Test
	public void Read03and07Excel () throws Exception{
		String fileName="D:\\测试.xlsx";
		//可以使用正则表达式来判断
		if(fileName.matches("^.+\\.(?i)((xls)|(xlsx))$")){
			boolean Excel03=fileName.matches("^.+\\.(?i)(xls)$");
			FileInputStream fis=new FileInputStream(fileName);	
			//读取工作簿
			Workbook hfw = Excel03 ? new HSSFWorkbook(fis) : new HSSFWorkbook(fis);
			// 2.读取工作表,由工作表创建
			Sheet hs = hfw.getSheetAt(0);
			// 3.读取行,从0开始的
			Row hr = hs.getRow(4);
			// 4.读取单元格，从0开始的
			Cell hc = hr.getCell(3);
			System.out.println(hc.getStringCellValue());
			fis.close();
			hfw.close();
		}
	}
	@Test
	public void ExcelStyle() {
				//1.创建工作簿
				HSSFWorkbook hfw=new HSSFWorkbook();
				//创建合并单元格对象
				CellRangeAddress sc = new CellRangeAddress(0, 0, 0, 5);
				//创建单元格样式
				HSSFCellStyle style = hfw.createCellStyle();
				//设置单元格样式//水平居中
				style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
				//垂直居中
				style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
				//创建字体
				HSSFFont font = hfw.createFont();
				//设置字体样式
				font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
				font.setFontHeightInPoints((short)16);
				//加载字体
				style.setFont(font);
				//单元格背景设置
				//设置背景填充模式
				//style.setFillPattern(HSSFCellStyle.DIAMONDS);//钻石模型
				style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);//以前景色为准
				//设置背景色
				style.setFillBackgroundColor(HSSFColor.RED.index);
				//设置前景色
				style.setFillForegroundColor(HSSFColor.BLUE.index);
				//2.创建工作表,由工作表创建
				HSSFSheet   hs=hfw.createSheet("你好啊");				
				//3.创建行,从0开始的
				hs.addMergedRegion(sc);
				HSSFRow hr= hs.createRow(0);
				//4.创建单元格，从0开始的
				HSSFCell hc=hr.createCell(0);
				hc.setCellValue("你好啊！");
				//加载样式到单元格
				hc.setCellStyle(style);
				
				try {
					//输出到硬盘
					FileOutputStream fos=new FileOutputStream("D:\\测试231.xls");
					//把excel输出到文件中
					hfw.write(fos);
					hfw.close();
					fos.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
