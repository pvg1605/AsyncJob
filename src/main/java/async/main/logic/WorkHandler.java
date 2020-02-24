package async.main.logic;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.practo.commons.queue.QueueTemplate;
import com.practo.commons.worker.scheduler.SchedulingStrategy;
import com.practo.commons.worker.task.SimpleTask;

@Component
public class WorkHandler extends SimpleTask{

	@Autowired
	QueueTemplate template;
	
	@Override
	public void execute() throws Exception {
		
		List<Message<Job>> msgs=template.receive("colorQueue");
		System.out.println(msgs.size());
		for (Message<Job> msg : msgs) {
			try {
				System.out.println(msg);
		      } catch (Exception e) {
		    	  e.printStackTrace();
		      } finally {
		    	  template.delete("colorQueue", msg);
		      }		
		}
	}

	@Override
	public SchedulingStrategy getSchedulingStrategy() {
		return SchedulingStrategy.fixedDelay(2000);
	}
	
	

}
