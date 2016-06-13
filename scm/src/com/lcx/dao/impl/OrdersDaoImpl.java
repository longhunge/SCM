package com.lcx.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;

import com.lcx.dao.OrdersDao;
import com.lcx.entity.Orders;

public class OrdersDaoImpl extends BaseDaoImpl<Orders> implements OrdersDao {

	@Resource
	SessionFactory sessionFactory;
	@Override
	public List<Orders> finbyuid(String uid) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("From Orders o where o.uid=?").setString(0, uid).list();
	}

	
}
