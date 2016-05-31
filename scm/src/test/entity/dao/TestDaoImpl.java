package test.entity.dao;

import java.io.Serializable;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import test.TestUser;

public class TestDaoImpl extends HibernateDaoSupport implements TestDao {	
	
	
	@Override
	public void save(TestUser tuser) {
		getHibernateTemplate().save(tuser);
	}

	@Override
	public TestUser finduser(Serializable id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(TestUser.class, id);
	}

}
