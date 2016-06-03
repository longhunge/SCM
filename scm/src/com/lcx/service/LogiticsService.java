package com.lcx.service;

import java.io.Serializable;
import java.util.List;

import com.lcx.entity.Logitics;

public interface LogiticsService {
	 
	public void save(Logitics entity);

	public void update(Logitics entity);

	public void delete(Serializable id);

	public Logitics findbyid(Serializable id) ;

	public List<Logitics> findall() ;
}
