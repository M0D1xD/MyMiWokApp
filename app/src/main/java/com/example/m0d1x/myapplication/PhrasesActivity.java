
package com.example.m0d1x.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    ListView listview;
    ArrayList<dictionary> Phrases = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        listview = (ListView) findViewById(R.id.ListView_phrases);

        Phrases.add(new dictionary("Where are you going?", "minto wuksus", R.drawable.question, R.raw.phrase_where_are_you_going));
        Phrases.add(new dictionary("What is your name?", "tinnә oyaase'nә", R.drawable.question, R.raw.phrase_what_is_your_name));
        Phrases.add(new dictionary("My name is..", "oyaaset", R.drawable.question, R.raw.phrase_my_name_is));
        Phrases.add(new dictionary("How are you feeling؟", "michәksәs", R.drawable.question, R.raw.phrase_how_are_you_feeling));
        Phrases.add(new dictionary("I’m feeling good", "kuchi achit", R.drawable.question, R.raw.phrase_im_feeling_good));
        Phrases.add(new dictionary("Are you coming?", "әәnәs'aa?", R.drawable.question, R.raw.phrase_are_you_coming));
        Phrases.add(new dictionary("Yes, I’m coming", "hәә’ әәnәm", R.drawable.question, R.raw.phrase_yes_im_coming));
        Phrases.add(new dictionary("I’m coming.", "әәnәm", R.drawable.question, R.raw.phrase_im_coming));
        Phrases.add(new dictionary("Let’s go.", "", R.drawable.question, R.raw.phrase_lets_go));
        Phrases.add(new dictionary("Come here.", "әnni'nem", R.drawable.question, R.raw.phrase_come_here));


        DictionaryAdapter dictionary = new DictionaryAdapter(this, R.layout.costom_layout, Phrases);
        listview.setAdapter(dictionary);
    }
}
