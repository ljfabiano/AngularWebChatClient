package com.tiy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import static org.junit.Assert.*;

/**
 * Created by jfabiano on 9/23/2016.
 */
//Have a unit test that validates that your chat client works properly DONE!
public class ChatClientTest {
    @Before
    public void setUp() throws Exception {
//        ChatServer myServer = new ChatServer();
//        myServer.setConnection();
//        ServerRunner myServerRunner = new ServerRunner();
//        myServerRunner.startServer();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testClientServerInteraction() throws Exception {

        ChatClient myChatClient = new ChatClient();
        //myChatClient.runChatClient();
        Socket mySocket = myChatClient.connectToServer("127.0.0.1", 8005);
        assertEquals("/127.0.0.1", mySocket.getLocalAddress().toString());
        PrintWriter out = new PrintWriter(mySocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(mySocket.getInputStream()));

        String response = myChatClient.dialogWithServer("name=Test", out, in);
        System.out.println("Response from server = " + response);
        assertEquals("name=Test", response);
//        String responseTwo = myChatClient.dialogWithServer("Test Dialog", out, in);
//        System.out.println("Response from server = " + responseTwo);
//        assertEquals("Test Dialog", responseTwo);
//        myChatClient.dialogWithServer("exit", out, in);

    }

}