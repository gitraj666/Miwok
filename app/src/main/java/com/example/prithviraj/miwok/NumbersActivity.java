package com.example.prithviraj.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        final ArrayList<Word> Words = new ArrayList<Word>();

        Word w = new Word("one","lutti",R.drawable.number_one,R.raw.number_one);
        Words.add(w);
        Word w1 = new Word("two","otiiko",R.drawable.number_two,R.raw.number_two);
        Words.add(w1);
        Word w2 = new Word("three","tolookosu",R.drawable.number_three,R.raw.number_three);
        Words.add(w2);
        Word w3 = new Word("four","oyyisa",R.drawable.number_four,R.raw.number_four);
        Words.add(w3);
        Word w4 = new Word("five","massokka",R.drawable.number_five,R.raw.number_five);
        Words.add(w4);
        Word w5 = new Word("six","temmokka",R.drawable.number_six,R.raw.number_six);
        Words.add(w5);
        Word w6 = new Word("seven","kenekaku",R.drawable.number_seven,R.raw.number_seven);
        Words.add(w6);
        Word w7 = new Word("eight","kawinta",R.drawable.number_eight,R.raw.number_eight);
        Words.add(w7);
        Word w8 = new Word("nine","wo'e",R.drawable.number_nine,R.raw.number_nine);
        Words.add(w8);
        Word w9 = new Word("ten","na'accha",R.drawable.number_ten,R.raw.number_ten);
        Words.add(w9);

        //Display list of Words
        WordAdapter itemsAdapter  = new WordAdapter(this, Words);
        ListView listview = (ListView)findViewById(R.id.activity_numbers);
        listview.setAdapter(itemsAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = Words.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(NumbersActivity.this,word.getSoundResourceId());
                mediaPlayer.start();

            }
        });
        }

}
