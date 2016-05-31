package com.lcx.service.impl;

import java.io.File;
import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;

import org.springframework.stereotype.Service;

import com.lcx.dao.UserDao;
import com.lcx.entity.User;
import com.lcx.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource 
	private UserDao userDao;
	@Override
	public void save(User entity) {
		userDao.save(entity);

	}

	@Override
	public void update(User entity) {
		userDao.update(entity);

	}

	@Override
	public void delete(Serializable id) {
		userDao.delete(id);

	}

	@Override
	public User findbyid(Serializable id) {
		
		return userDao.findbyid(id);
	}

	@Override
	public List<User> findall() {
		// TODO Auto-generated method stub
		return userDao.findall();
	}

	@Override
	public void exportExcel(List<User> list, ServletOutputStream out) {
		userDao.exportExcel(list, out);
		
	}

	public void importExcel(File importExcel, String importExcelFileName){
		try {
			userDao.importExcel(importExcel, importExcelFileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public User findUser(User user) {
		// TODO Auto-generated method stub
		return userDao.findUser(user);
	}

}
