package com.example.loginregisterrelative;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class list_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);


        ListView listview = findViewById(R.id.listview);

        List<String>list = new ArrayList<>();
        list.add("Bagas Pramono");
        list.add("Grupsekawansejoli");
        list.add("Aril Noah");
        list.add("Indah Kusuma");
        list.add("Yoana Silalahi");



        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){

                    startActivity(new Intent(list_view.this,Bagas.class));

                }else if(position==1){

                    startActivity(new Intent(list_view.this,grup.class));

                }else if(position==2){

                    startActivity(new Intent(list_view.this,Aril.class));

                }else if(position==3){

                    startActivity(new Intent(list_view.this, indah.class));

                }else if(position==4){

                    startActivity(new Intent(list_view.this,Yoana.class));

                }else{

                }



            }
        });



    }
}