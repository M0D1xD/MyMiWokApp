
package com.example.m0d1x.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    ArrayList<dictionary> Colors = new ArrayList<>();
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        listview = (ListView) findViewById(R.id.ListView_colors);
        Colors.add(new dictionary("Red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        Colors.add(new dictionary("Green", "chokokki", R.drawable.color_green, R.raw.color_green));
        Colors.add(new dictionary("Brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        Colors.add(new dictionary("Grey", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        Colors.add(new dictionary("Blac", "kululli", R.drawable.color_black, R.raw.color_black));
        Colors.add(new dictionary("Dusty Yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        Colors.add(new dictionary("Mustard Yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        DictionaryAdapter dictionary = new DictionaryAdapter(this, R.layout.costom_layout, Colors);
        listview.setAdapter(dictionary);
    }
}
