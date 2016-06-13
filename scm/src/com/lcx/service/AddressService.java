package com.lcx.service;

import java.io.Serializable;
import java.util.List;

import com.lcx.entity.Address;

public interface AddressService {
	
	public void save(Address entity);

	public void update(Address entity);

	public void delete(Serializable id);

	public Address findbyid(Serializable id);

	public List<Address> findall();

	public List<Address> findbyuid(String uid);
}
