package com.lcx.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lcx.dao.CartDao;
import com.lcx.entity.Cart;
import com.lcx.service.CartService;
@Service("cartService")
public class CartSeviceImpl implements CartService {

	@Resource
	CartDao cartDao;
	@Override
	public void save(Cart entity) {
		 cartDao.save(entity);

	}

	@Override
	public void update(Cart entity) {
		cartDao.update(entity);
	}

	@Override
	public void delete(Serializable id) {
		cartDao.delete(id);
	}

	@Override
	public Cart findbyid(Serializable id) {
		
		return cartDao.findbyid(id);
	}

	@Override
	public List<Cart> findall() {
		// TODO Auto-generated method stub
		return cartDao.findall();
	}

	public Cart findbypid(String pid) {
		// TODO Auto-generated method stub
		return (Cart) cartDao.finbypid(pid);
	}

	@Override
	public List<Cart> finbyuid(String uid) {
		// TODO Auto-generated method stub
		return cartDao.findbyuid(uid);
	}

}
