package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.entity.TestService;
import test.entity.dao.TestDao;

public class TestSpring {
	TestDao testDao;
	ClassPathXmlApplicationContext cl;
	@Before
	public void load() {
		cl=new ClassPathXmlApplicationContext("applicationContext.xml");
		TestService ts=(TestService) cl.getBean("testService");
		ts.say();
		// TODO Auto-generated method stub

	}
	
	public void tests(){
		ClassPathXmlApplicationContext cl=new ClassPathXmlApplicationContext("applicationContext.xml");
		TestService ts=(TestService) cl.getBean("testService");
		ts.say();
	}
	
	public void testh() {
		SessionFactory sf=(SessionFactory) cl.getBean("sessionFactory");
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		se.save(new TestUser("laowang","123124231"));
		tx.commit();
		se.close();
	}
	@Test
	public void testd(){
		TestService ts=(TestService) cl.getBean("testService");
		ts.save(new TestUser("老李22312","341123"));
		
		//System.out.println(ts.finduser("8a82a99254a8ecda0154a8ecdb9f0000").getName());
	}
}
