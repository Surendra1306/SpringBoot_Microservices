package in.surendra.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppConfigAuth {
	
	@Bean
	public InMemoryUserDetailsManager inMemUser() { //if you want to configure miultiple user credentials remove username&pwd in app.prop
		UserDetails u1 = org.springframework.security.core.userdetails
							.User.withDefaultPasswordEncoder()
							.username("vikram")
							.password("vick@123")
							.build();
		
		UserDetails u2 = org.springframework.security.core.userdetails
				.User.withDefaultPasswordEncoder()
				.username("devid")
				.password("devid@123")
				.build();
return new InMemoryUserDetailsManager();//both users can access our application 		
		
	}
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((req) -> req
											.requestMatchers("/about","/contact") //.antMatchers("/deposit").hashRole("Admin")  we can specify that who can access which method
											.permitAll()//security is not added
											.anyRequest()
											.authenticated())
											.formLogin();
		return http.build();
	}

}