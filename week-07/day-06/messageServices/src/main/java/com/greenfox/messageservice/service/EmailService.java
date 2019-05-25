package com.greenfox.messageservice.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("email")
public class EmailService implements MessageService {
    @Override
    public void send(String message, String type) {
        String result = "Email sent to " + type + " with message: " + message;
        System.out.println(result);
    }
}
