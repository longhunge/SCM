package test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class Testlog {
	@Test
	public void test(){
		Log log=LogFactory.getLog(getClass());
		log.error("cuowuxinxi");
		log.debug("debug");
		log.info("info");
		
	}
}
