package com.demo;

import com.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;


/**
 * Created by momor3n on 22/4/2017.
 */
@Component
public class JmsProducer {
    @Autowired
    public JmsTemplate jmsTemplate;

    @Value("${jms.queue.destination}")
    //@Value("${jms.queue.topic.destination}")
    public String destinationQueue;

    public void send(String msg){
        jmsTemplate.convertAndSend(destinationQueue, msg);
    }
    public void sendObject(User user) {
        jmsTemplate.convertAndSend(destinationQueue, user);
    }
}
