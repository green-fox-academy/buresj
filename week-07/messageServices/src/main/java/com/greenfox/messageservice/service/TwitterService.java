package com.greenfox.messageservice.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("twitter")
public class TwitterService implements MessageService {
    @Override
    public void send(String message, String type) {
        String result = "Tweeted to" + type + " with message: " + message;
        System.out.println(result);
    }
}
