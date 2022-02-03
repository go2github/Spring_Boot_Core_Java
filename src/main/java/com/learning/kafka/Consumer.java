package com.learning.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = "my-topic",groupId = "mygroup")
	public void consumeTopicMessage(String str) {
		System.out.println("consumed message ++++++++ "+str);
		try {
			Thread.sleep(10000);
			System.out.println("consumed message ++++++++ "+str);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
