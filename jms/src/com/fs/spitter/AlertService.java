package com.fs.spitter;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class AlertService implements IAlertService {

	@Override
	public void sendSpittleAlert(Destination destination,final String message) {
		MessageCreator messageCreator = new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}
		};
		jmsTemplate.send(destination, messageCreator);
	}


	private JmsTemplate jmsTemplate;
	public JmsTemplate getJmsTemplate() {  
        return jmsTemplate;  
    }   
  
    @Resource  
    public void setJmsTemplate(JmsTemplate jmsTemplate) {  
        this.jmsTemplate = jmsTemplate;  
    }  
}
