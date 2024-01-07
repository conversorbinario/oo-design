package com.example.sharingapp;

import android.content.Context;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ContactListController {

    private ContactList contact_list;


    public ContactListController(ContactList contactList){
        this.contact_list = contactList;
    }

    public void setContactList(ArrayList<Contact> contactList){
        this.contact_list.setContacts(contactList);
    }

    public ArrayList<Contact> getContactList(){
        return this.contact_list.getContacts();
    }

    public boolean addContact(Contact contact, Context context){
        AddContactCommand add_contact_command = new AddContactCommand(this.contact_list, contact, context);
        add_contact_command.execute();
        return add_contact_command.isExecuted();
    }

    public boolean deleteContact(Contact contact, Context context){
        DeleteContactCommand delete_contact_command = new DeleteContactCommand(this.contact_list, contact, context);
        delete_contact_command.execute();
        return delete_contact_command.isExecuted();
    }

    public boolean editContact(Contact existing, Contact updated, Context context){
        EditContactCommand edit_contact_command = new EditContactCommand(this.contact_list, existing, updated, context);
        edit_contact_command.execute();
        return edit_contact_command.isExecuted();

    }

    public Contact getItem(int index) {
        return contact_list.getContact(index);
    }


    public int getIndex(Contact contact) {
        return contact_list.getIndex(contact);
    }


    public int getSize() {
        return contact_list.getSize();
    }


    public void loadItems(Context context) {
        contact_list.loadContacts(context);
    }





    public Contact getContactByUsername(String username) {
        return contact_list.getContactByUsername(username);
    }

    public void addObserver(Observer observer){
        this.contact_list.addObserver(observer);

    }

    public void removeObserver(Observer observer){
        this.contact_list.removeObserver(observer);
    }



}
