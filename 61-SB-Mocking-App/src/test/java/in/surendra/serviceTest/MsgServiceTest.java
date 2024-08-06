package in.surendra.serviceTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.surendra.service.MsgService;

@SpringBootTest
public class MsgServiceTest {

	@Autowired
	private MsgService msgService;
	
	@Test
	public void printWelcomeMsgTest() {
		String welcomeMsg = msgService.printWelcomeMsg();
		
		assertNotNull(welcomeMsg);
	}
	
	@Test
	public void printGreetMsgTest() {
		String printGreetMsg = msgService.printGreetMsg();
		
		assertNotNull(printGreetMsg);
	}
}
