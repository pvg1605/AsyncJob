package com.async.main.worker;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.async.main.logic.Job;
import com.practo.commons.queue.QueueTemplate;
import com.practo.commons.worker.scheduler.SchedulingStrategy;


@Component
public class WorkerHandler{

	@Autowired
	private QueueTemplate queueTemplate;
	
	public void retrieveJobs(String queueName) {
		List<Message<Job>> msgs=queueTemplate.receive(queueName);
		for (Message<Job> msg : msgs) {
			try {
				System.out.println(msg);
		      } catch (Exception e) {
		    	  e.printStackTrace();
		      } finally {
		    	  queueTemplate.delete(queueName, msg);
		      }		
		}
	}
	public SchedulingStrategy getSchedulingStrategy() {
		return SchedulingStrategy.fixedDelay(2000);
	}

	
	

}
