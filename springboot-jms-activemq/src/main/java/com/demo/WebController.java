package com.demo;

import com.demo.model.User;
import com.demo.repo.UserRepository;
import com.demo.repo.UserTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by momor3n on 22/4/2017.
 */
@RestController
public class WebController {
    @Autowired
    public JmsClient jmsClient;

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/produce")
    public String product(@RequestParam("msg") String msg) {
        jmsClient.send(msg);
        return "Done";
    }

    @RequestMapping(value = "/receive")
    public String receive() {
        return jmsClient.receive();
    }

    @RequestMapping(value = "/user")
    public @ResponseBody String sendUser(){
        jmsClient.sendObject(userRepository.findByLoginId("momor3n"));
        //List<User> result = userRepository.findByLoginId("momor3n");
        return "Done";
    }


}
