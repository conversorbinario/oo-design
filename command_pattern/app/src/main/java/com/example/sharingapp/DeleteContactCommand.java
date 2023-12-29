package com.example.sharingapp;

import android.content.Context;

public class DeleteContactCommand extends Command {

    ContactList contactList;
    Contact contact;
    Context context;

    public DeleteContactCommand(ContactList contactList, Contact contact, Context context) {
        this.contactList = contactList;
        this.contact = contact;
        this.context = context;
    }

    @Override
    public void execute() {
        this.contactList.deleteContact(contact);
        setIsExecuted(contactList.saveContacts(context));
    }
}
