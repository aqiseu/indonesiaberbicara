package com.indonesiaberbicara.discussionapp.model;

import java.util.UUID;
import java.util.Date;



public class Message extends Model {

    String content;
    UUID userID;

    public Message(String content, UUID userID, UUID id, Date created, Date modified) {
        super(id, created, modified);
        this.content = content;
        this.userID = userID;
    }

}
