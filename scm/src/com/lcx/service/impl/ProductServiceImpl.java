package com.lcx.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lcx.dao.ProductDao;
import com.lcx.entity.Product;
import com.lcx.service.ProductService;
@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Resource
	ProductDao productDao;
	
	@Override
	public void save(Product entity) {
		productDao.save(entity);
	}

	@Override
	public void update(Product entity) {
		productDao.update(entity);
	}

	@Override
	public void delete(Serializable id) {
		productDao.delete(id);

	}

	@Override
	public Product findbyid(Serializable id) {

		return productDao.findbyid(id);
	}

	@Override
	public List<Product> findall() {
		
		return productDao.findall();
	}

	@Override
	public Product findbyproduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.findbyproduct(product);
	}

}
