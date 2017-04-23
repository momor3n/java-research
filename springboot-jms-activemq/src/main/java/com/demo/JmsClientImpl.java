package com.demo;

import com.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by momor3n on 22/4/2017.
 */
@Service
public class JmsClientImpl implements JmsClient{
    @Autowired
    public JmsConsumer jmsConsumer;

    @Autowired
    public JmsProducer jmsProducer;

    @Override
    public void send(String msg){
        jmsProducer.send(msg);
    }

    @Override
    public String receive(){
        return jmsConsumer.receive();
    }

    @Override
    public void sendObject(User user) {
        jmsProducer.sendObject(user);
    }

    @Override
    public User receiveObject() {
        return jmsConsumer.receiveObject();
    }


}
