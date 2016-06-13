package com.lcx.dao;

import java.util.List;

import com.lcx.entity.Orders;

public interface OrdersDao extends BaseDao<Orders> {
	public List<Orders> finbyuid(String uid);
}
