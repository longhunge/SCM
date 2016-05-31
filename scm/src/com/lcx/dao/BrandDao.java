package com.lcx.dao;

import java.io.Serializable;
import java.util.List;

import com.lcx.entity.Brand;

public interface BrandDao extends BaseDao<Brand>{
	public List<Brand> findlistbytid(Serializable id);
}
