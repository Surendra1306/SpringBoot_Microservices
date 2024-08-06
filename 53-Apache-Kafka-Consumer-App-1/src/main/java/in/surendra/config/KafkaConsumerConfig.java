package in.surendra.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;

import in.surendra.bindings.Order;
import in.surendra.constants.AppConstants;

@Configuration
public class KafkaConsumerConfig {

	@Bean
	public ConsumerFactory<String, Order> consumerFactory(){
		Map<String, Object> configProp = new HashMap<>();
		configProp.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConstants.HOST);
		configProp.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		configProp.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonValueSerializer.class);
		return new DefaultKafkaConsumerFactory<>(configProp);
	}
	
	public ConcurrentKafkaListenerContainerFactory<String, Order> kafkaListenerFactory(){
		ConcurrentKafkaListenerContainerFactory<String, Order> factory=new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory());
		return factory;
	}
}
