package com.mucsc2450.fatema.rxc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Contact extends AppCompatActivity {
    private Button msendbutton;
    private EditText mname, memail, msubject, mmessage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        msendbutton = (Button)findViewById(R.id.sendbutton);
        mname = (EditText) findViewById(R.id.name);
        msubject = (EditText) findViewById(R.id.subject);
        mmessage = (EditText) findViewById(R.id.message);
        memail = (EditText) findViewById(R.id.email);
       msendbutton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(Intent.ACTION_SEND);
               i.setType("message/html");
               i.putExtra(Intent.EXTRA_EMAIL, new String[]{"fatemafakih1@gmail.com"});
               i.putExtra(Intent.EXTRA_SUBJECT, "Feedback from App");
               i.putExtra(Intent.EXTRA_TEXT, "Name : "+mname.getText()+"\nMessage : "+mmessage.getText()+"\nSubject : "+msubject.getText()+"\nEmail : "+memail.getText());
               try {
                   startActivity(Intent.createChooser(i, "Send feedback..."));
               } catch (android.content.ActivityNotFoundException ex) {
                   Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
               }
           }
       });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.home){
            Intent i = new Intent(Contact.this, HomeActivity.class);
            startActivity(i);

        }else if (id==R.id.calendar){
            Intent i = new Intent(Contact.this, Calendar.class);
            startActivity(i);
        }else if (id==R.id.pictures){
            Intent i = new Intent(Contact.this, Pictures.class);
            startActivity(i);
        }else if (id==R.id.contact){
            Intent i = new Intent(Contact.this, Contact.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}

