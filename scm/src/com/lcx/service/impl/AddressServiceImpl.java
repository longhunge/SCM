package com.lcx.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lcx.dao.AddressDao;
import com.lcx.entity.Address;
import com.lcx.service.AddressService;
@Service("addressService")
public class AddressServiceImpl implements AddressService {

	@Resource
	AddressDao addressDao;
	@Override
	public void save(Address entity) {
		addressDao.save(entity);
	}

	@Override
	public void update(Address entity) {
		addressDao.update(entity);
	}

	@Override
	public void delete(Serializable id) {
		addressDao.delete(id);
	}

	@Override
	public Address findbyid(Serializable id) {
		return addressDao.findbyid(id);
	}

	@Override
	public List<Address> findall() {
		return addressDao.findall();
	}

	@Override
	public List<Address> findbyuid(String uid) {
		return addressDao.findbyuid(uid);
	}

}
