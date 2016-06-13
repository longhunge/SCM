package com.lcx.service;

import java.io.Serializable;
import java.util.List;

import com.lcx.entity.Cart;

public interface CartService {
	//新增
	public void save(Cart entity);	
	//更新
	public void update(Cart entity); 
	//删除 根据id删除
	public void delete(Serializable id);
	//根据id查找一个对象
	public Cart findbyid(Serializable id);
	//查找列表
	public List<Cart> findall();
	
	public Cart findbypid(String pid);
	
	public List<Cart> finbyuid(String uid);
}
