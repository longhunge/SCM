package com.lcx.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import com.lcx.dao.LogiticsDao;
import com.lcx.entity.Logitics;
import com.lcx.service.LogiticsService;

public class LogiticsServiceImpl implements LogiticsService {

	@Resource
	LogiticsDao logiticsDao;
	public void save(Logitics entity) {
		
		logiticsDao.save(entity);
	}

	@Override
	public void update(Logitics entity) {
		
		logiticsDao.update(entity);
	}

	@Override
	public void delete(Serializable id) {
		
		logiticsDao.delete(id);
	}

	@Override
	public Logitics findbyid(Serializable id) {
		
		return logiticsDao.findbyid(id);
	}

	@Override
	public List<Logitics> findall() {
		
		return logiticsDao.findall();
	}

}
