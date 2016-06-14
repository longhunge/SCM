package com.lcx.service;

import java.io.Serializable;
import java.util.List;

import com.lcx.entity.WuliuUpdate;

public interface WuliuUpdateService {
	
	public void save(WuliuUpdate entity) ;

	public void update(WuliuUpdate entity) ;
	
	public void delete(Serializable id) ;

	public WuliuUpdate findbyid(Serializable id) ;

	public List<WuliuUpdate> findall();
}
