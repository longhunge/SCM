package com.lcx.service;

import java.io.Serializable;
import java.util.List;




import org.springframework.stereotype.Service;

import com.lcx.entity.ProductSize;

public interface ProductSizeService {
			//新增
			public void save(ProductSize entity);	
			//更新
			public void update(ProductSize entity); 
			//删除 根据id删除
			public void delete(Serializable id);
			//根据id查找一个对象
			public ProductSize findbyid(Serializable id);
			//查找列表
			public List<ProductSize> findall();
			//根据商品id查找
			public List<ProductSize> finbypid(String pid);
}
