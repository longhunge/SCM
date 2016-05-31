package com.lcx.dao;

import java.io.File;
import java.util.List;

import javax.servlet.ServletOutputStream;

import com.lcx.entity.User;

public interface UserDao extends BaseDao<User> {
	public void exportExcel(List<User> list, ServletOutputStream out) ;
	
	public void importExcel(File importExcel, String importExcelFileName) throws Exception;

	public User findUser(User user);
}
