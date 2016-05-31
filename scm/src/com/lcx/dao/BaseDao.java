package com.lcx.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {
	//新增
	public void save(T entity);	
	//更新
	public void update(T entity); 
	//删除 根据id删除
	public void delete(Serializable id);
	//根据id查找一个对象
	public T findbyid(Serializable id);
	//查找列表
	public List<T> findall();
	//分页chaxun
	//public PageResult getPageResult(QueryHelper queryHelper, int pageNo, int pageSize);
	//根据id查询一组对象
	//public List<T> findlistbyid(Serializable id);
}
