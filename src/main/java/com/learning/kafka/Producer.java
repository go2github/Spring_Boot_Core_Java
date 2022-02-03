package com.learning.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	public static final String topic="my-topic";
	@Autowired
	private KafkaTemplate<String, String> kafkaTemp;

	public void publishMsgTopic(String name) {
		System.out.println("publishing.............");
		kafkaTemp.send(topic,name);

	}

}
