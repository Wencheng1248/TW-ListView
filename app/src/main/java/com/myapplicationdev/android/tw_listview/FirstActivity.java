package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<year> al;
    ArrayAdapter<year> aa;
    TextView tvYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) this.findViewById(R.id.LvYear);
        tvYear = (TextView) findViewById(R.id.tvYear);
        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together

        al = new ArrayList<year>();
        al.add(new year("Year 1"));
        al.add(new year("Year 2"));
        al.add(new year("Year 3"));

        aa = new yearAdapter(this, R.layout.rowyear,al);
        lv.setAdapter(aa);

        Intent i = new Intent (FirstActivity.this,SecondActivity.class);
        i.putExtra("year", al);
        //start the new activity
        startActivity(i);


    }
}
