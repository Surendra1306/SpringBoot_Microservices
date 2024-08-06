package in.surendra.testController;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.surendra.entity.Product;
import in.surendra.rest.ProductController;

@WebMvcTest(controllers =ProductController.class)
public class ProductControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	public void saveProductTest() throws Exception {
		
		Product p = new Product();
		p.setPid(1);
		p.setPname("Laptop");
		p.setPrice(30000);
		
		ObjectMapper obj = new ObjectMapper();
		String valueAsString = obj.writeValueAsString(p);
		
		MockHttpServletRequestBuilder post = MockMvcRequestBuilders.post("/product")
																   .contentType("application/json")
																   .content(valueAsString);
		
		MvcResult andReturn = mockMvc.perform(post).andReturn();
		
		MockHttpServletResponse response = andReturn.getResponse();
		
		int actualResponse = response.getStatus();

		assertEquals(201, actualResponse);
		
 
		
	}

}
