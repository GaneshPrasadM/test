package com.websystique.spring.messaging;

import java.io.Serializable;

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
public class MessageSenderP1 {

	@Autowired
	JmsTemplate jmsTemplate1;

	public void sendMessage(final MeerkatParameters meerkatParameters) {

		jmsTemplate1.send(new MessageCreator(){
				@Override
				public Message createMessage(Session session) throws JMSException{
					ObjectMessage objectMessage = session.createObjectMessage(meerkatParameters);
					return objectMessage;
				}
			});
	}

}
