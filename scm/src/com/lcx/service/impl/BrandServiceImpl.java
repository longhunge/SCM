package com.lcx.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lcx.dao.BrandDao;
import com.lcx.entity.Brand;
import com.lcx.service.BrandService;
@Service("brandService")
public class BrandServiceImpl implements BrandService {

	@Resource
	BrandDao brandDao;
	
	@Override
	public void save(Brand entity) {
		brandDao.save(entity);

	}

	@Override
	public void update(Brand entity) {
		brandDao.update(entity);

	}

	@Override
	public void delete(Serializable id) {
		brandDao.delete(id);

	}

	@Override
	public Brand findbyid(Serializable id) {
		
		return brandDao.findbyid(id);
	}

	@Override
	public List<Brand> findall() {
		// TODO Auto-generated method stub
		return brandDao.findall();
	}

	@Override
	public List<Brand> findlistbytid(Serializable id) {	
		
		return brandDao.findlistbytid(id);
	}

}
