package com.lcx.dao;

import java.io.Serializable;
import java.util.List;

import com.lcx.entity.Cart;

public interface CartDao extends BaseDao<Cart> {

	public Cart finbypid(String pid);
	public List<Cart> findbyuid(String uid);
}
