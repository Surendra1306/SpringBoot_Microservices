package in.surendra.test;

 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
import in.surendra.service.BookService;
 

public class TestBook {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean8.xml");
		
		BookService bookService = context.getBean(BookService.class);
		
		bookService.saveBookDetails();
		 
	}

}
