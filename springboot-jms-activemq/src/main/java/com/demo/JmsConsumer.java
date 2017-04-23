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
public class JmsConsumer {
    @Autowired
    public JmsTemplate jmsTemplate;

    @Value("${jms.queue.destination}")
    public String destinationQueue;

    public String receive(){
        return (String)jmsTemplate.receiveAndConvert(destinationQueue);
    }

    public User receiveObject(){
        return (User) jmsTemplate.receiveAndConvert(destinationQueue);
    }
}
