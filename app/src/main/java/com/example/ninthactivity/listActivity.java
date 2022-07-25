package com.example.ninthactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listActivity extends AppCompatActivity  {

    ListView lv;
    String items[];
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        lv=(ListView) findViewById(R.id.list1);
        int num=getIntent().getIntExtra("num", 0);
        items=new String[num];
        for(int i=0;i<num;i++)
        {
            items[i]="item "+(i+1);
        }
        ArrayAdapter<String> arr=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items);
        lv.setAdapter(arr);

    }

}