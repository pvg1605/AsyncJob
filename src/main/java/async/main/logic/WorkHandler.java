package async.main.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;

import com.practo.commons.queue.templates.BeanstalkQueueTemplate;
import com.practo.commons.worker.scheduler.SchedulingStrategy;
import com.practo.commons.worker.task.SimpleTask;

public class WorkHandler extends SimpleTask{

	@Autowired
	BeanstalkQueueTemplate template;
	
	@Override
	public void execute() throws Exception {
		List<Message<Job>> msgs=template.receive("colorQueue");
		for (Message<Job> msg : msgs) {
				template.delete("colorQueue", msg);
	}
	}

	@Override
	public SchedulingStrategy getSchedulingStrategy() {
		return SchedulingStrategy.fixedDelay(2000);
	}
	
	

}
