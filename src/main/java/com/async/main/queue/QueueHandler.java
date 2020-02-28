package com.async.main.queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.async.main.logic.Job;
import com.practo.commons.queue.QueueTemplate;

@Component
public class QueueHandler  {
	
	@Autowired
	private QueueTemplate queueTemplate;
	
	public void sendJob(String queueName,String message) {
		Job msg = new Job();
		msg.setMessage(message);
		queueTemplate.sendAsync(queueName, msg);
		
	}
}
	
