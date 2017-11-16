package com.websystique.spring.messaging;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import com.websystique.spring.model.MeerkatParameters;

@Component
public class MessageSenderP3 {

	@Autowired
	JmsTemplate jmsTemplate3;

	public void sendMessage(final MeerkatParameters meerkatParameters) {

		jmsTemplate3.send(new MessageCreator(){
				@Override
				public Message createMessage(Session session) throws JMSException{
					ObjectMessage objectMessage = session.createObjectMessage(meerkatParameters);
					return objectMessage;
				}
			});
	}

}
