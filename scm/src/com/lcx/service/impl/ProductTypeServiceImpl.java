package com.lcx.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lcx.dao.ProductTypeDao;
import com.lcx.entity.ProductSize;
import com.lcx.entity.ProductType;
import com.lcx.service.ProductTypeService;
@Service("productTypeService")
public class ProductTypeServiceImpl implements ProductTypeService{
	@Resource
	ProductTypeDao productTypeDao;
	
	@Override
	public void save(ProductType type) {
		productTypeDao.save(type);
		
	}

	@Override
	public void update(ProductType entity) {
		productTypeDao.update(entity);
		
	}

	@Override
	public void delete(Serializable id) {
		productTypeDao.delete(id);
	}

	@Override
	public ProductType findbyid(Serializable id) {
		
		return productTypeDao.findbyid(id);
	}

	@Override
	public List<ProductType> findall() {
		
		return productTypeDao.findall();
	}
	
	
}
