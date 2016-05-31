package test.entity.action;

import javax.annotation.Resource;

import test.entity.TestService;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	@Resource
	TestService testservice;
//	@Resource
//	public void setTestservice(TestService testservice) {
//		this.testservice = testservice;
//	}

	public String execute(){
		testservice.say();
		return SUCCESS;
		
	}
}
