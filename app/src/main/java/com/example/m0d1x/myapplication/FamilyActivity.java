
package com.example.m0d1x.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    ListView listview;
    ArrayList<dictionary> family = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        listview = (ListView) findViewById(R.id.ListView_family);
        family.add(new dictionary("Father", "әpә", R.drawable.family_father, R.raw.family_father));
        family.add(new dictionary("Mother", "әṭa", R.drawable.family_mother, R.raw.family_mother));
        family.add(new dictionary("Son", "angsi", R.drawable.family_son, R.raw.family_son));
        family.add(new dictionary("Daughter", "tune", R.drawable.family_daughter, R.raw.family_daughter));
        family.add(new dictionary("Older Brother", "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        family.add(new dictionary("Younger Brother", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        family.add(new dictionary("Older Sister", "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        family.add(new dictionary("Younger Sister", "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        family.add(new dictionary("Grandmother", "ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        family.add(new dictionary("Grandfather", "paapa", R.drawable.family_grandfather, R.raw.family_father));


        DictionaryAdapter dictionary = new DictionaryAdapter(this, R.layout.costom_layout, family);
        listview.setAdapter(dictionary);
    }
}
