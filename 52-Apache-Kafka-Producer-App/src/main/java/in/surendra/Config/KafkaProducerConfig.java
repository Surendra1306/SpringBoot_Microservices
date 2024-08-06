package in.surendra.Config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;

import in.surendra.Bindings.Order;
import in.surendra.Constants.AppConstants;

@Configuration
public class KafkaProducerConfig {

	public ProducerFactory<String, Order> producerFactory(){	//represent connection properties with the kafka server
		Map<String, Object> configProps = new HashMap<>();
		configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConstants.HOST);//represents url of the kafka server
		configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);//key = topic ,means what is the key we are passing,here key is string type
		configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonValueSerializer.class);//value=msg from order data,to represent messsage in json format,here value is object
		return new DefaultKafkaProducerFactory<>(configProps);
	}
	
	//to publish message to the kafka topic we need a predefined class called kafkatemplate which is used to communicate with kafka topic
	@Bean
	public KafkaTemplate<String, Order> kafkaTemplate(){
		return new KafkaTemplate<>(producerFactory());//in kafkatemplate we are injecting producerfactory using constr injuction
	}//by using kafkatemplate we send message to the topic in key-value format

}
