package com.lcx.service;

import java.io.Serializable;
import java.util.List;

import com.lcx.entity.Orders;

public interface OrdersService {
	public void save(Orders entity);
	public void update(Orders entity);
	public void delete(Serializable id) ; 
	Orders findbyid(Serializable id) ;
	public List<Orders> findall();
}
