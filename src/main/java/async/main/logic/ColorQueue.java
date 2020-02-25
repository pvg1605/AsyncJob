package async.main.logic;

import java.util.LinkedList;
import java.util.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ColorQueue  {
	
	 @Autowired
	 private QueueHandler queueHandler;
	 
	 public void sendMessage() {
		 @SuppressWarnings("unused")
		Queue<String> colorQueue = new LinkedList<>();
		queueHandler.sendJob("colorQueue","red");
	}
	
}