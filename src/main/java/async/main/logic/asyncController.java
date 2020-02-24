package async.main.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {
	
	@Autowired
	private QueueHandler queueHandler;
	@Autowired
	private WorkHandler workHandler;
	
	@GetMapping("/example")
	public String Hello() throws Exception {
		queueHandler.sendJob();
		workHandler.execute();
		return "Successfull";
	}
}
