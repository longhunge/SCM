package com.lcx.dao;

import com.lcx.entity.Product;

public interface ProductDao extends BaseDao<Product> {
	public Product findbyproduct(Product product);
}
