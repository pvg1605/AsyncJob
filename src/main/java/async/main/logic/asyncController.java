package async.main.logic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class asyncController {

	private QueueHandler queueHandler;

	
	@GetMapping("/example")
	public String Hello() {
		return queueHandler.sendJob();
	}
}
