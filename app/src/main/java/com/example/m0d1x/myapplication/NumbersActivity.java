/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.m0d1x.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    ArrayList<dictionary> NumberItems = new ArrayList<>();
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        listview = (ListView) findViewById(R.id.ListView_numbers);

        NumberItems.add(new dictionary("one", "lutti", R.drawable.number_one, R.raw.number_one));
        NumberItems.add(new dictionary("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        NumberItems.add(new dictionary("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        NumberItems.add(new dictionary("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        NumberItems.add(new dictionary("five", "massokka", R.drawable.number_five, R.raw.number_five));
        NumberItems.add(new dictionary("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        NumberItems.add(new dictionary("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        NumberItems.add(new dictionary("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        NumberItems.add(new dictionary("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
        NumberItems.add(new dictionary("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));

        DictionaryAdapter dictionary = new DictionaryAdapter(this, R.layout.costom_layout, NumberItems);
        listview.setAdapter(dictionary);


    }

}
