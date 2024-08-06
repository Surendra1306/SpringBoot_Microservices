package in.surendra.serviceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import in.surendra.dao.UserDao;
import in.surendra.service.UserService;

@SpringBootTest
@ExtendWith(value = {MockitoExtension.class})
public class UserServiceTest {
	
	
	@MockBean
	private UserDao doa;
	
	@InjectMocks
	private UserService serviceTest;
	
	@Test
	public void getNameTest () {
		
		when(doa.findNameById(101)).thenReturn("Hardik");
		
		String actualName = serviceTest.findName(101);
		
		assertEquals("Hardik", actualName);
		
		
	}

}














