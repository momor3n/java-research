package com.demo;

import com.demo.model.User;

/**
 * Created by momor3n on 22/4/2017.
 */
public interface JmsClient {
    public void send(String msg);
    public String receive();
    public void sendObject(User user);
    public User receiveObject();
}
