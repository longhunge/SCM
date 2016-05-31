package com.lcx.service;

import java.io.Serializable;
import java.util.List;

import com.lcx.entity.Brand;

public interface BrandService {
	
	public void save(Brand entity);

	public void update(Brand entity);

	public void delete(Serializable id);

	public Brand findbyid(Serializable id);

	public List<Brand> findall();
	
	public List<Brand> findlistbytid(Serializable id);
}
