package com.lcx.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lcx.dao.ProductSizeDao;
import com.lcx.entity.ProductSize;
import com.lcx.service.ProductSizeService;
@Service("productSizeService")
public class ProductSizeServiceImpl implements ProductSizeService {

	@Resource
	ProductSizeDao productSizeDao;
	@Override
	public void save(ProductSize entity) {
		productSizeDao.save(entity);

	}

	@Override
	public void update(ProductSize entity) {
		productSizeDao.update(entity);

	}

	@Override
	public void delete(Serializable id) {
		productSizeDao.delete(id);

	}

	@Override
	public ProductSize findbyid(Serializable id) {
		// TODO Auto-generated method stub
		return productSizeDao.findbyid(id);
	}

	@Override
	public List<ProductSize> findall() {
		// TODO Auto-generated method stub
		return productSizeDao.findall();
	}

	@Override
	public List<ProductSize> finbypid(String pid) {
		
		return productSizeDao.finbypid(pid);
	}

}
