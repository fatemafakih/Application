package com.mucsc2450.fatema.rxc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Pictures extends AppCompatActivity {
    private ListView mList;
    ArrayAdapter<String> adapter;
    String[] Listitems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pictures);

        mList = (ListView)findViewById(R.id.List);
        Listitems =new String[]{"Team Pictures","Girls Race Pictures","Boys Race Pictures"};

        adapter = new ArrayAdapter(Pictures.this, R.layout.activity_listview,Listitems);
        mList.setAdapter(adapter);



        mList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i;
                switch (position){
                    case 0:
                        i = new Intent(Pictures.this,Teampics.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(Pictures.this,Girls.class);
                        startActivity(i);
                        break;
                    case 2:
                        i = new Intent(Pictures.this,boys.class);
                        startActivity(i);
                        break;

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
            Intent i = new Intent(Pictures.this, HomeActivity.class);
            startActivity(i);

        }else if (id==R.id.calendar){
            Intent i = new Intent(Pictures.this, Calendar.class);
            startActivity(i);
        }else if (id==R.id.pictures){
            Intent i = new Intent(Pictures.this, Pictures.class);
            startActivity(i);
        }else if (id==R.id.contact){
            Intent i = new Intent(Pictures.this, Contact.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}

