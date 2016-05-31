package test.entity;

import java.io.Serializable;

import test.TestUser;

public interface TestService {
	public void say();
	public void save(TestUser tuser);//有返回值则是uuid
	public TestUser finduser(Serializable id);
}
