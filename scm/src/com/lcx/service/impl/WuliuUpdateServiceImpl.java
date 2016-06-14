package com.lcx.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lcx.dao.WuliuUpdatedao;
import com.lcx.entity.WuliuUpdate;
import com.lcx.service.WuliuUpdateService;
@Service("wuliuUpdateService")
public class WuliuUpdateServiceImpl implements WuliuUpdateService {

	@Resource
	WuliuUpdatedao wuliuUpdatedao; 
	@Override
	public void save(WuliuUpdate entity) {
		wuliuUpdatedao.save(entity);
	}

	@Override
	public void update(WuliuUpdate entity) {
		wuliuUpdatedao.update(entity);
	}

	@Override
	public void delete(Serializable id) {
		wuliuUpdatedao.delete(id);
	}

	@Override
	public WuliuUpdate findbyid(Serializable id) {
		
		return wuliuUpdatedao.findbyid(id);
	}

	@Override
	public List<WuliuUpdate> findall() {
		
		return wuliuUpdatedao.findall();
	}

}
