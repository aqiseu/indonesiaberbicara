package com.indonesiaberbicara.discussionapp.model;

import java.util.Date;
import java.util.UUID;

public class Conclusion extends Content {

    public Conclusion(UUID id, Date created, Date modifed, String title, String photoURL, String contentURL) {
        super(id, created, modifed, title, photoURL, contentURL);
    }
}