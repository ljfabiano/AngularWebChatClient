package com.tiy;

/**
 * Created by jfabiano on 9/27/2016.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
//Create a simple JSON endpoint that takes in a message as a query string parameter and returns the history of all
//      messages that have been sent to the server thus far
//this tells spring this controller is going to have end points that are going to take json, and return json
//      specifically
public class JSONController {

    ArrayList<String> myHistoryList = new ArrayList<String>();

    //@Autowired//says take the interface, create a concrete implementation that can speak to this repository
    //TodoRepository todos;//postgress db


    //    receives a request object with the number of smalls and bigs in the factory as well as the desired amount of chocolate in kilos,
//    and returns an object (this could be your solution container) with the number of bigs and smalls required to make the amount of chocolate indicated.
    //a post is when the user is entering info(things that we don't yet know, or that the user has to get them)
    @RequestMapping(path = "/message.json", method = RequestMethod.POST)//was POST
    public ArrayList<String> sendMessage(@RequestBody String message) {
        //System.out.println("asking chocolateQuestion with: " + chocolateQuestion);
        //myHistoryList.add(message);
        //ArrayList<Integer> answerList = new ArrayList<>();
        ChatClient myChatClient = new ChatClient();
        myChatClient.connectToServer();
        myHistoryList.add(myChatClient.dialogWithServer(message));
        //MakeChocolate myMaker = new MakeChocolate();

        //NeededChocolate neededChocolate = myMaker.makeChocolate(smalls, bigs, kilos);

        return myHistoryList;

    }
    @RequestMapping(path = "/history.json", method = RequestMethod.GET)
    public ArrayList<String> historyRequest(String message) {
        //System.out.println("asking chocolateQuestion with: " + chocolateQuestion);
        //myHistoryList.add(message);
        //ArrayList<Integer> answerList = new ArrayList<>();

        //MakeChocolate myMaker = new MakeChocolate();

        //NeededChocolate neededChocolate = myMaker.makeChocolate(smalls, bigs, kilos);

        return myHistoryList;

    }
}