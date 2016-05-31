package com.lcx.service;

import java.io.File;
import java.io.Serializable;
import java.util.List;

import javax.servlet.ServletOutputStream;

import com.lcx.entity.User;


public interface UserService {
	//登录
	public User findUser(User user);
	// 新增
	public void save(User entity);

	// 更新
	public void update(User entity);

	// 删除 根据id删除
	public void delete(Serializable id);

	// 根据id查找
	public User findbyid(Serializable id);

	// 查找列表
	public List<User> findall();

	public void exportExcel(List<User> list, ServletOutputStream out);

	public void importExcel(File importExcel, String importExcelFileName);
}
