package com.lcx.dao;

import java.io.Serializable;
import java.util.List;

import com.lcx.entity.WOrder;

public interface WOrderDao extends BaseDao<WOrder> {

	public List<WOrder> findbylid(String id);
}
