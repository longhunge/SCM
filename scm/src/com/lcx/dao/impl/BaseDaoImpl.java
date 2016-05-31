package com.lcx.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference;
import org.hibernate.Query;
import org.junit.Test;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lcx.dao.BaseDao;
import com.lcx.entity.User;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {

	Class<T> clazz;
	public BaseDaoImpl(){
		ParameterizedType pt=(ParameterizedType) this.getClass().getGenericSuperclass();
		clazz=(Class<T>) pt.getActualTypeArguments()[0];
	}
	@Override
	public void save(T entity) {
		getHibernateTemplate().save(entity);		
	}

	@Override
	public void update(T entity) {
		getHibernateTemplate().update(entity);		
	}

	@Override
	public void delete(Serializable id) {
		getHibernateTemplate().delete(findbyid(id));
		
	}

	@Override
	public T findbyid(Serializable id) {
		
		return getHibernateTemplate().get(clazz, id);
	}
	
	@Override
	public List<T> findall() {
		Query query=getSession().createQuery(" From "+ clazz.getName());
		return query.list();
	}
	
	
//	public PageResult getPageResult(QueryHelper queryHelper, int pageNo, int pageSize) {
//		Query query = getSession().createQuery(queryHelper.getQueryListHql());
//		List<Object> parameters = queryHelper.getParameters();
//		if(parameters != null){
//			for(int i = 0; i < parameters.size(); i++){
//				query.setParameter(i, parameters.get(i));
//			}
//		}
//		if(pageNo < 1) pageNo = 1;
//		
//		query.setFirstResult((pageNo-1)*pageSize);//设置数据起始索引号
//		query.setMaxResults(pageSize);
//		List items = query.list();
//		//获取总记录数
//		Query queryCount = getSession().createQuery(queryHelper.getQueryCountHql());
//		if(parameters != null){
//			for(int i = 0; i < parameters.size(); i++){
//				queryCount.setParameter(i, parameters.get(i));
//			}
//		}
//		long totalCount = (Long)queryCount.uniqueResult();
//		
//		return new PageResult(totalCount, pageNo, pageSize, items);
//	}

}
