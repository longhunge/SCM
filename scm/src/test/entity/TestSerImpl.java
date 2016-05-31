package test.entity;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import test.TestUser;
import test.entity.dao.TestDao;

@Service("testService")//注解的方式
public class TestSerImpl implements TestService {
	@Resource
	TestDao testDao;
	@Override
	public void say() {
		System.out.println("hello world!");
	}

	@Override
	public void save(TestUser tuser) {
		testDao.save(tuser);
	}

	@Override
	public TestUser finduser(Serializable id) {
		return testDao.finduser(id);
	}

}
