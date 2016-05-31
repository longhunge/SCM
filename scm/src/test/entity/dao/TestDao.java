package test.entity.dao;

import java.io.Serializable;

import test.TestUser;

public interface TestDao {
	
	public void save(TestUser tuser);//有返回值则是uuid
	public TestUser finduser(Serializable id);
}
