package com.lcx.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;

import com.lcx.dao.BrandDao;
import com.lcx.entity.Brand;

public class BrandDaoImpl extends BaseDaoImpl<Brand> implements BrandDao {
	@Resource
	SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	public List<Brand> findlistbytid(Serializable id){		
		return sessionFactory.getCurrentSession().createQuery("From Brand  b where b.tid = ?").setParameter(0, id).list();		
	}
	
}
