package com.async.main.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.async.main.queue.AnimalQueue;
import com.async.main.queue.ColorQueue;

@Component
public class Selector {
	
	
	@Autowired
	private ColorQueue colorQueue;
	
	@Autowired
	private AnimalQueue animalQueue;
	
	int qSelector = 0;
	
	public void selectQueue()
	{
		if( qSelector % 2 == 0) {
			colorQueue.sendMessage();
			qSelector+=1;
			System.out.println("First queue");
		}
		else {
			animalQueue.sendMessage();
			qSelector+=1;
			System.out.println("Second Queue");
		}
		
	}
	

}
