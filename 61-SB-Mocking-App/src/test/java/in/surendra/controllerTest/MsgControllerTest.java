package in.surendra.controllerTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import in.surendra.controller.MsgController;
import in.surendra.service.MsgService;

@WebMvcTest(controllers=MsgController.class)
public class MsgControllerTest {
	
	@MockBean  //our rest controller class dependent on this service so we use this annotation .if its not dependent we directly use @autowired
	private MsgService msgServiceTest;

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void getWelcomeMsgTest() throws Exception {
		
		//define mock obj behaviour
		when(msgServiceTest.printWelcomeMsg()).thenReturn("Dummy Text");
		
		//prepare request - create http req to access our rest controller method
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/welcome");
		
		//send request -  sending http request
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
		
		//get response
		MockHttpServletResponse response = mvcResult.getResponse();
		
		int actualStatus = response.getStatus();
		int expectedStatus = 200;
		
		assertEquals(expectedStatus, actualStatus);
	}
	
	
	@Test
	public void getGreetMsgTest() throws Exception {
		
		when(msgServiceTest.printGreetMsg()).thenReturn("Dummy Greetings...");
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/greet");
		
		MvcResult andReturn = mockMvc.perform(requestBuilder).andReturn();
		
		MockHttpServletResponse servletResponse = andReturn.getResponse();
		
		String asString = servletResponse.getContentAsString();
		
		
		assertEquals("dummy greetings...", asString); //it will return what (line 53) above string when that controller method called
	}
		
}
























