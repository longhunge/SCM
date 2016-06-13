package com.lcx.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;

import com.lcx.dao.AddressDao;
import com.lcx.entity.Address;

public class AddressDaoImpl extends BaseDaoImpl<Address> implements AddressDao {

	@Resource
	SessionFactory sessionFactory;
	

	@Override
	public List<Address> findbyuid(String uid) {
		// TODO Auto-generated method stub
		return (List<Address>) sessionFactory.getCurrentSession().createQuery("From Address a where a.uid = ? ").setString(0, uid).list();
	}

}
