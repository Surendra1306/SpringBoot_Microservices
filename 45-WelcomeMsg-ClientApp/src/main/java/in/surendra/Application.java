package in.surendra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient			//acts as client to the service registry
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
