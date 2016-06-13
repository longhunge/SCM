package com.lcx.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lcx.dao.OrdersDao;
import com.lcx.entity.Orders;
import com.lcx.service.OrdersService;
@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {

	@Resource
	OrdersDao ordersDao;
	
	@Override
	public void save(Orders entity) {
		ordersDao.save(entity);
	}

	@Override
	public void update(Orders entity) {
		ordersDao.update(entity);
	}

	@Override
	public void delete(Serializable id) {
		ordersDao.delete(id);
	}

	@Override
	public Orders findbyid(Serializable id) {
		// TODO Auto-generated method stub
		return ordersDao.findbyid(id);
	}

	@Override
	public List<Orders> findall() {
		// TODO Auto-generated method stub
		return ordersDao.findall();
	}

	@Override
	public List<Orders> finbyuid(String uid) {
		// TODO Auto-generated method stub
		return ordersDao.finbyuid(uid);
	}

}
