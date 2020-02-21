package async.main.logic;

import org.springframework.beans.factory.annotation.Autowired;

import com.practo.commons.queue.templates.BeanstalkQueueTemplate;

public class QueueHandler  {

	@Autowired
	private BeanstalkQueueTemplate template;
	
	public String sendJob() {
		template = new BeanstalkQueueTemplate(0,1,300);
		Job msg = new Job();
	    msg.setMessage("red");
	String queueName = template.createQueue("colorQueue");
	String id = template.send(queueName,msg);
	return id;
	}
}