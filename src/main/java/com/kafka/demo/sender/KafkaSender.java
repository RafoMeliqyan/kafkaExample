package com.kafka.demo.sender;

import com.kafka.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    private static final String kafkaTopic = "java_in_use_topic";

    public void send(String name) {
        kafkaTemplate.send(kafkaTopic, new User(name,"Programmer", 10000L));
    }

}
