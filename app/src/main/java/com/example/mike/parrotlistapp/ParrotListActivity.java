package com.example.mike.parrotlistapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ExpandedMenuView;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ParrotListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parrot_list);

        ParrotList parrotList = new ParrotList();
        ArrayList<Parrot> list = parrotList.getList();

        ParrotListAdapter parrotAdapter = new ParrotListAdapter(this, list);

        ListView listView = (((ListView) findViewById(R.id.list)));
        listView.setAdapter(parrotAdapter);
    }
}
