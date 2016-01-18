package com.fs.spitter.test;

import javax.jms.Destination;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fs.spitter.AlertService;
//@ContextConfiguration("/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = "applicationContext.xml")
public class AlertServiceTest{
	@Autowired
	private AlertService alertService ;
	 @Autowired  
	    @Qualifier("queue")  
	private Destination destination; 
	
	@Test
	public void testSendSpittleAlert() {
		for(int i=0;i<2;i++){
		alertService.sendSpittleAlert(destination,"send message"+i+1);
		}
	}

}
