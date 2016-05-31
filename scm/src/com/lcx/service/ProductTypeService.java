package com.lcx.service;

import java.io.Serializable;
import java.util.List;

import com.lcx.entity.ProductSize;
import com.lcx.entity.ProductType;

public interface ProductTypeService {
	public void save(ProductType type);

	// 更新
	public void update(ProductType entity);

	// 删除 根据id删除
	public void delete(Serializable id);

	// 根据id查找
	public ProductType findbyid(Serializable id);

	// 查找列表
	public List<ProductType> findall();
	
}
