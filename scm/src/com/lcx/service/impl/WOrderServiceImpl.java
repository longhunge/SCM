package com.lcx.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lcx.dao.WOrderDao;
import com.lcx.entity.WOrder;
import com.lcx.service.WOrderService;
@Service("wOrderService")
public class WOrderServiceImpl implements WOrderService {

	@Resource
	WOrderDao worderDao;
	@Override
	public void save(WOrder entity) {
		worderDao.save(entity);
	}

	@Override
	public void update(WOrder entity) {
		worderDao.update(entity);
	}

	@Override
	public void delete(Serializable id) {
		worderDao.delete(id);
	}

	@Override
	public WOrder findbyid(Serializable id) {
		
		return worderDao.findbyid(id);
	}

	@Override
	public List<WOrder> findall() {
		
		return worderDao.findall();
	}

	@Override
	public List<WOrder> findbylid(String id) {
		// TODO Auto-generated method stub
		return worderDao.findbylid(id);
	}

}
