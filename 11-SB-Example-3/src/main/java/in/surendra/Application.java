package in.surendra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt1 = SpringApplication.run(Application.class, args);
		
		System.out.println(ctxt1.getClass().getName());
		
	//	AnnotationConfigServletWebServerApplicationContext ctxt2 = SpringApplication.run(Application.class, args);
		// for web MVC
		
		//AnnotationConfigReactiveWebApplicationContext ctxt3 = SpringBootApplication.run(Application.class, args);
		// for reactive webflux
	}

}
