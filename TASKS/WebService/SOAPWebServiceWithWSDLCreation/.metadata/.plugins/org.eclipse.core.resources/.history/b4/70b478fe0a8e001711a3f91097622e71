package com.websystique.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websystique.spring.messaging.MessageSenderP1;
import com.websystique.spring.messaging.MessageSenderP2;
import com.websystique.spring.messaging.MessageSenderP3;
import com.websystique.spring.messaging.MessageSenderP4;
import com.websystique.spring.model.MeerkatParameters;

@Service("meerkatParametersService")
public class MeerkatParametersServiceImpl implements MeerkatParametersService{

	static final Logger LOG = LoggerFactory.getLogger(MeerkatParametersServiceImpl.class);
	
	@Autowired
	MessageSenderP1 MessageSenderP1;
	
	@Autowired
	MessageSenderP2 MessageSenderP2;
	
	@Autowired
	MessageSenderP3 MessageSenderP3;
	
	@Autowired
	MessageSenderP4 MessageSenderP4;
	
	@Override
	public void sendParameters(MeerkatParameters meerkatParameters) {
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		LOG.info("Application : sending order request {}", meerkatParameters);
		MessageSenderP1.sendMessage(meerkatParameters);
		MessageSenderP2.sendMessage(meerkatParameters);
		MessageSenderP3.sendMessage(meerkatParameters);
		MessageSenderP4.sendMessage(meerkatParameters);
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	
}
