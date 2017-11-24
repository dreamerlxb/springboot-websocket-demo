package com.lxb.websocket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import com.lxb.websocket.msg.RequestMessage;

@Controller
public class WsController {
	
	@Autowired
    private SimpMessagingTemplate template;
	
	//@SendTo("/topic/getResponse")
	@MessageMapping("/welcome")
    public void say(@Header("user") String user, RequestMessage message) {
        System.out.println(message.getName() + " ====== " + user);
        
        template.convertAndSendToUser("lxb", "/msg", message);
        template.convertAndSend("/topic/getResponse", message);
        template.convertAndSend("/user/lxb/msg", message);
       // return new ResponseMessage("welcome," + message.getName() + " !");
    }
}
