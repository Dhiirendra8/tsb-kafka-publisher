package com.example.tsb.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import io.confluent.kafka.serializers.KafkaAvroSerializer;

@Configuration
public class KafkaProducerConfig {

	@Bean
	public KafkaTemplate<String, Object> kafkaTemplate() {

		return new KafkaTemplate<String, Object>(producerFactory());
	}

	@Bean
	public ProducerFactory<String, Object> producerFactory() {

		Map<String, Object> configs = new HashMap<String, Object>();

		configs.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		configs.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		configs.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class.getName());
//		configs.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class.getName());
		configs.put("key.separator", ":");
		configs.put("parse.key", "true");

		configs.put("schema.registry.url", "http://localhost:8081");

		return new DefaultKafkaProducerFactory<>(configs);

	}

}
