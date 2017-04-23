package com.demo;

import com.demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;

/**
 * Created by momor3n on 22/4/2017.
 */
@Component
public class MessageReceiver {
    static final Logger LOG = LoggerFactory.getLogger(MessageReceiver.class);
    final static public String destinationQueue = "Inbound";
    //final static public String destinationQueue = "UserTopic";

    /*@JmsListener(destination = destinationQueue)
    public void getNewMessage(final Message<String> message) throws JMSException {
        MessageHeaders headers = message.getHeaders();
        LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        LOG.info("Application : headers received : {}", headers);
        String response = message.getPayload();
        LOG.info("Application : response received : {}",response);
        LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }*/

    @JmsListener(destination = destinationQueue)
    public void getNewMessage(final Message<User> message) throws JMSException {
        MessageHeaders headers = message.getHeaders();
        LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        LOG.info("Application : headers received : {}", headers);
        User response = message.getPayload();
        LOG.info("Application : response received : {}",response.toString());
        LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }


}
