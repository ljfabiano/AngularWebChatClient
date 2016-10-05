package com.tiy;

import javax.persistence.*;

/**
 * Created by jfabiano on 9/28/2016.
 */
@Entity//the Message class is an entity connected to the games name value in the DB
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)//was previously false
        String message;

    @Column(nullable = false)
        String userName;

    public Message() {
    }

    public Message(String message, String userName) {
        this.message = message;
        this.userName = userName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
