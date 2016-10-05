package com.tiy;

/**
 * Created by jfabiano on 9/23/2016.
 */
public class ServerRunner {
    public static void main(String[] args) {
        ChatServer myServer = new ChatServer();
        myServer.setConnection();
    }
    public void startServer() {
        ChatServer myServer = new ChatServer();
        myServer.setConnection();
    }
}
