package com.mucsc2450.fatema.rxc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calendar extends AppCompatActivity {
    Button mbutton, mbutton2, mbutton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);


        mbutton = (Button) findViewById(R.id.b1);
        mbutton2 = (Button) findViewById(R.id.b2);
        mbutton3 = (Button) findViewById(R.id.b3);


        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Calendar.this, webview.class);
                startActivity(i);


            }
        });

        mbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Calendar.this, webview.class);
                startActivity(i);


            }
        });

        mbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Calendar.this, webview.class);
                startActivity(i);


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
            Intent i = new Intent(Calendar.this, HomeActivity.class);
            startActivity(i);

        }else if (id==R.id.calendar){
            Intent i = new Intent(Calendar.this, Calendar.class);
            startActivity(i);
        }else if (id==R.id.pictures){
            Intent i = new Intent(Calendar.this, Pictures.class);
            startActivity(i);
        }else if (id==R.id.contact){
            Intent i = new Intent(Calendar.this, Contact.class);
            startActivity(i);

        }

        return super.onOptionsItemSelected(item);
    }
}


