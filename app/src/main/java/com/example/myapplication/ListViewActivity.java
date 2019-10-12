package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    private ListView listview;
    private ArrayList<String> names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listview = findViewById(R.id.listView);

        names.add("John");
        names.add("Joe");
        names.add("Avicili");
        names.add("Rich Chigga");
        names.add("Avicili");
        names.add("Avicili");
        names.add("Avicili");
        names.add("Avicili");


        ArrayAdapter<String> nameAdapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);

        listview.setAdapter(nameAdapter);
    }
}
