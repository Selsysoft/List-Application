package com.example.list;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    String sehirler[] = {"İzmir","Şanlıurfa","Ankara","İstanbul","Ağrı"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, sehirler));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        if(position==0){
            Toast.makeText(getApplicationContext(), "İzmir", Toast.LENGTH_SHORT).show();
        }
        if(position==1){
            Toast.makeText(getApplicationContext(), "Şanlıurfa", Toast.LENGTH_SHORT).show();
        }
        if(position==2){
            Toast.makeText(getApplicationContext(), "Ankara", Toast.LENGTH_SHORT).show();
        }
        if(position==3){
            Toast.makeText(getApplicationContext(), "İstanbul", Toast.LENGTH_SHORT).show();
        }
        if(position==4){
            Toast.makeText(getApplicationContext(), "Ağrı", Toast.LENGTH_SHORT).show();
        }

    }

}

