package com.lcx.service;

import java.io.Serializable;
import java.util.List;

import com.lcx.entity.WOrder;

public interface WOrderService {
	
	public void save(WOrder entity) ;

	public void update(WOrder entity) ;
	
	public void delete(Serializable id) ;

	public WOrder findbyid(Serializable id) ;

	public List<WOrder> findall();
	
	public List<WOrder> findbylid(String id);
}
