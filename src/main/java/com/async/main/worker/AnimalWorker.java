package com.async.main.worker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practo.commons.worker.scheduler.SchedulingStrategy;
import com.practo.commons.worker.task.SimpleTask;

@Component
public class AnimalWorker extends SimpleTask{
	
	@Autowired
	private WorkerHandler workerHandler;
	
	@Override
	public void execute() throws Exception {
		workerHandler.retrieveJobs("animalQueue");
	}
	@Override
	public SchedulingStrategy getSchedulingStrategy() {
		return workerHandler.getSchedulingStrategy();
	}
}
