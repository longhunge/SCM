package com.lcx.dao;

import java.util.List;

import com.lcx.entity.Address;

public interface AddressDao extends BaseDao<Address> {
	public List<Address> findbyuid(String uid);
}
