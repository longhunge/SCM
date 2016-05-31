package com.lcx.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lcx.dao.HotDao;
import com.lcx.dao.impl.HotDaoImpl;
import com.lcx.entity.Hot;
import com.lcx.service.HotService;
@Service("hotService")
public class HotServiceImpl implements HotService {

	@Resource
	HotDao hotDao;
	@Override
	public void save(Hot entity) {
		hotDao.save(entity);
	}

	@Override
	public void update(Hot entity) {

		hotDao.update(entity);

	}

	@Override
	public void delete(Serializable id) {
		hotDao.delete(id);
	}

	@Override
	public Hot findbyid(Serializable id) {
		// TODO Auto-generated method stub
		return hotDao.findbyid(id);
	}

	@Override
	public List<Hot> findall() {
		return hotDao.findall();
	}

}
