package com.lcx.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;

import com.lcx.dao.WOrderDao;
import com.lcx.entity.WOrder;

public class WOrderDaoImpl extends BaseDaoImpl<WOrder> implements WOrderDao {

	@Resource
	SessionFactory sessionFactory;
	@Override
	public List<WOrder> findbylid(String id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("From WOrder wo where wo.lid = ?").setString(0, id).list();
	}

}
