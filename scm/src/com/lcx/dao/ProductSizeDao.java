package com.lcx.dao;

import java.util.List;

import com.lcx.entity.ProductSize;

public interface ProductSizeDao extends BaseDao<ProductSize> {
	public List<ProductSize> finbypid(String pid);
}
