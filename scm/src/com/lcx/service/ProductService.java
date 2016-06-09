package com.lcx.service;

import java.io.Serializable;
import java.util.List;

import com.lcx.entity.Product;

public interface ProductService {
		//新增
		public void save(Product entity);	
		//更新
		public void update(Product entity); 
		//删除 根据id删除
		public void delete(Serializable id);
		//根据id查找一个对象
		public Product findbyid(Serializable id);
		//查找列表
		public List<Product> findall();
		
		public Product findbyproduct(Product product);
}
