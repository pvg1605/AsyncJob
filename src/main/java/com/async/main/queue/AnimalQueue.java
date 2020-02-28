package com.async.main.queue;

import java.util.LinkedList;
import java.util.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalQueue  {
	
	 @Autowired
	 private QueueHandler queueHandler;
	 
	 public void sendMessage() {
		 @SuppressWarnings("unused")
		Queue<String> animalQueue = new LinkedList<>();
		queueHandler.sendJob("animalQueue","red");
	}
	
}