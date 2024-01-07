package com.example.sharingapp;

import java.util.UUID;


public class ContactController {

    private Contact contact;

    public String getUsername() {
        return contact.getUsername();
    }

    public void setUsername(String username) {
        this.contact.setUsername(username);
    }

    public String getEmail() {
        return contact.getEmail();
    }

    public void setEmail(String email) {
        this.contact.setEmail(email);
    }

    public String getId() {
        return contact.getId();
    }


    public void setId() {
        this.contact.setId();
    }

    public void updateId(String id){
        this.contact.updateId(id);
    }

    public Contact getContact(){
        return this.contact;
    }

    public void addObserver(Observer observer){
        this.contact.addObserver(observer);
    }

    public void removeObserver(Observer observer){
        this.contact.removeObserver(observer);
    }


}