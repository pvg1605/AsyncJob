package async.main.logic;

import java.util.LinkedList;
import java.util.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practo.commons.queue.QueueTemplate;

@Component
public class QueueHandler  {
	
	@Autowired
	private QueueTemplate queueTemplate;
	
	public void sendJob() {
		Job msg = new Job();
		msg.setMessage("red");
		Queue<String> colorQueue = new LinkedList<>();
		colorQueue.add("msg.getMessage()");
		queueTemplate.sendAsync("colorQueue", msg);
		
	}
	
}