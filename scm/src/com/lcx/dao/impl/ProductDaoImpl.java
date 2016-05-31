package com.lcx.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;

import com.lcx.dao.ProductDao;
import com.lcx.entity.Product;

public class ProductDaoImpl extends BaseDaoImpl<Product> implements ProductDao {

	@Resource
	SessionFactory sessionFactory;
	@Override
	public Product findbyproduct(Product product) {
		// TODO Auto-generated method stub
		 product=(Product) sessionFactory.getCurrentSession()//
				.createQuery("from Product where pname=? and price=?")//
				.setString(0, product.getPname())//
				.setDouble(1, product.getPrice())//
				.uniqueResult();
		 return product;
	}


}
 