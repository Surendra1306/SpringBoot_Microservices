package in.surendra.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {
	
	@Bean
	public JedisConnectionFactory jedisFactory() {
		JedisConnectionFactory jfactory = new JedisConnectionFactory();
		return jfactory;
	}
	
	@Bean
	public RedisTemplate<String, String> redisTemplate(){
		RedisTemplate<String, String> rtemplate= new RedisTemplate<>();
		rtemplate.setConnectionFactory(jedisFactory());
		return rtemplate;
	}
}
//jedisconnection -> redistemplate -> Opsforhash -> [get(),put(),delete()] 