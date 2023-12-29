package com.example.sharingapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Add a new contact
 */
public class AddContactActivity extends AppCompatActivity {

    private ContactList contact_list = new ContactList();
    private Context context;

    private EditText username;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        username = (EditText) findViewById(R.id.username);
        email = (EditText) findViewById(R.id.email);

        context = getApplicationContext();
        contact_list.loadContacts(context);
    }

    public void saveContact(View view) {

        String username_str = username.getText().toString();
        String email_str = email.getText().toString();

        if (username_str.equals("")) {
            username.setError("Empty field!");
            return;
        }

        if (email_str.equals("")) {
            email.setError("Empty field!");
            return;
        }

        if (!email_str.contains("@")){
            email.setError("Must be an email address!");
            return;
        }

        if (!contact_list.isUsernameAvailable(username_str)){
            username.setError("Username already taken!");
            return;
        }

        Contact contact = new Contact(username_str, email_str, null);
        AddContactCommand contactCommand = new AddContactCommand(this.contact_list, contact, this.context);
        contactCommand.execute();
        boolean isExecuted = contactCommand.isExecuted();

        if (!isExecuted){
            return;
        }

        // End AddItemActivity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        finish();
    }
}
