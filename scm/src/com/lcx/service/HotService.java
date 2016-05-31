package com.lcx.service;

import java.io.Serializable;
import java.util.List;

import com.lcx.entity.Hot;

public interface HotService {
			
			//新增
			public void save(Hot entity);	
			//更新
			public void update(Hot entity); 
			//删除 根据id删除
			public void delete(Serializable id);
			//根据id查找一个对象
			public Hot findbyid(Serializable id);
			//查找列表
			public List<Hot> findall();
}
