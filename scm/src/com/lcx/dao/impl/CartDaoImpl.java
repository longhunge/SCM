package com.lcx.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;

import com.lcx.dao.CartDao;
import com.lcx.entity.Cart;
import com.lcx.entity.Product;

public class CartDaoImpl extends BaseDaoImpl<Cart> implements CartDao {

	@Resource
	SessionFactory sessionFactory;
	public List<Cart> finbypid(String pid) {
		
		return (List<Cart>) sessionFactory.getCurrentSession()//
			  .createQuery("from Cart c where c.pid = ? ")//
			  .setString(0, pid);
	}

}
