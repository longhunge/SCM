package com.lcx.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;

import com.lcx.dao.ProductSizeDao;
import com.lcx.entity.ProductSize;

public class ProductSizeDaoImpl extends BaseDaoImpl<ProductSize> implements
		ProductSizeDao {

	@Resource
	SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductSize> finbypid(String pid) {
		// TODO Auto-generated method stub
		return (List<ProductSize>) sessionFactory.getCurrentSession()//
				.createQuery("from ProductSize p where p.pid=? ")//
				.setString(0, pid).list();//
	}
	
}
