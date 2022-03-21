package com.kafka.demo.controller;

import com.kafka.demo.sender.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApacheKafkaWebController {

    @Autowired
    private KafkaSender kafkaSender;

    @GetMapping(value = "/producer")
    public String producer(@RequestParam("name") String name) {
        kafkaSender.send(name);
        return "Message sent to the Kafka Topic java_in_use_topic Successfully";
    }

}
