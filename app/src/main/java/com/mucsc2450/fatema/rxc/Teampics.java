package com.mucsc2450.fatema.rxc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Teampics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teampics);
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
            Intent i = new Intent(Teampics.this, HomeActivity.class);
            startActivity(i);

        }else if (id==R.id.calendar){
            Intent i = new Intent(Teampics.this, Calendar.class);
            startActivity(i);
        }else if (id==R.id.pictures){
            Intent i = new Intent(Teampics.this, Pictures.class);
            startActivity(i);
        }else if (id==R.id.contact){
            Intent i = new Intent(Teampics.this, Contact.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
