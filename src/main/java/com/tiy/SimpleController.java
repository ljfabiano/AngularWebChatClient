package com.tiy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.net.Socket;

/**
 * Created by jfabiano on 9/27/2016.
 */
//Build a simple controller and HTML page that will be your "home" page DONE!
@Controller
public class SimpleController {
    int port = 8005;
    String ipAddress = "localhost";
    Socket clientSocket;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model, HttpSession session) throws Exception{//notice NOT an integer(int), but an Integer so it can be null rather than 0 initially. Using the Boxed type vs the primitive type

//        ChatClient myChatClient = new ChatClient();
//        myChatClient.connectToServer();
        //model.addAttribute("user", session.getAttribute("user"));

        return "home";
    }
}
