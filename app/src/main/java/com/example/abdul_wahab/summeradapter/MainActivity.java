package com.example.abdul_wahab.summeradapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.abdul_wahab.summeradapter.adapters.BusAdapter;
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
        ListView lvBusList =  (ListView) findViewById(R.id.lvBusList);

        //ArrayAdapter<Bus> busAdapter = new ArrayAdapter<Bus>(this,android.R.layout.simple_list_item_1,busList);

        BusAdapter busAdapter1 = new BusAdapter(this, busList);


             lvBusList.setAdapter(busAdapter1);

    }
}
