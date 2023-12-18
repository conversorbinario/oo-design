package com.example.sharingapp;

import java.util.UUID;

public class Contact {

    private String id;
    private String email;
    private String username;

    public Contact(){

    }

    public Contact(String username, String email, String id) {
        this.username = username;
        this.email = email;


        if (id == null){
            setId();
        } else {
            updateId(id);
        }
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
    }


    public void updateId(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
