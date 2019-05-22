package com.greenfox.messageservice.configuration;

import com.greenfox.messageservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MessageProceeder {

    private MessageService service1;
    private MessageService service2;

    @Autowired
    public MessageProceeder(@Qualifier("email") MessageService service1,
                            @Qualifier("twitter") MessageService service2){
        this.service1 = service1;
        this.service2 = service2;
    }

    public void processMessage (String message, String type) {

        if(type.contains("@")) {
            service1.send(message, type);
        } else {
            service2.send(message, type);
        }
    }
}
