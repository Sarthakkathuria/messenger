package com.example.sarthakkathuria.messenger;

/**
 * Created by Sarthak kathuria on 17-02-2018.
 */

public class Message {
    private String content;

    public Message(){

    }
    public Message (String content){
        this.content= content;

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
