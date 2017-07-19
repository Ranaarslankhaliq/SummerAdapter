package com.example.abdul_wahab.summeradapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.abdul_wahab.summeradapter.models.Bus;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Bus> busList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        busList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            busList.add(new Bus(i, "modelno" + i));
        }

        ArrayAdapter<Bus> busAdapter = new ArrayAdapter<Bus>(this,android.R.layout.simple_list_item_1,busList);

        ListView lvBusList =  (ListView) findViewById(R.id.lvBusList);

        lvBusList.setAdapter(busAdapter);

    }
}
