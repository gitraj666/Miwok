package com.example.prithviraj.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        final ArrayList<Word> Words = new ArrayList<Word>();

        Word w = new Word("Where are you going?","minto wuksus",R.drawable.number_one,R.raw.phrase_where_are_you_going);
        Words.add(w);
        Word w1 = new Word("What is your name?","tinnә oyaase'nә",R.drawable.number_two,R.raw.phrase_what_is_your_name);
        Words.add(w1);
        Word w2 = new Word("My name is...","oyaaset...",R.drawable.number_three,R.raw.phrase_my_name_is);
        Words.add(w2);
        Word w3 = new Word("How are you feeling?","michәksәs?",R.drawable.number_four,R.raw.phrase_how_are_you_feeling);
        Words.add(w3);
        Word w4 = new Word("I’m feeling good.","kuchi achit",R.drawable.number_five,R.raw.phrase_im_feeling_good);
        Words.add(w4);
        Word w5 = new Word("Are you coming?","әәnәs'aa?",R.drawable.number_six,R.raw.phrase_are_you_coming);
        Words.add(w5);
        Word w6 = new Word("Yes, I’m coming.","hәә’ әәnәm",R.drawable.number_seven,R.raw.phrase_yes_im_coming);
        Words.add(w6);
        Word w7 = new Word("I’m coming.","әәnәm",R.drawable.number_eight,R.raw.phrase_im_coming);
        Words.add(w7);
        Word w8 = new Word("Let’s go.","yoowutis",R.drawable.number_nine,R.raw.phrase_lets_go);
        Words.add(w8);
        Word w9 = new Word("Come here.","әnni'nem",R.drawable.number_ten,R.raw.phrase_come_here);
        Words.add(w9);

        //Display list of Words
        WordAdapter itemsAdapter  = new WordAdapter(this, Words);
        ListView listview = (ListView)findViewById(R.id.activity_phrases);
        listview.setAdapter(itemsAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = Words.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(PhrasesActivity.this,word.getSoundResourceId());
                mediaPlayer.start();

            }
        });
    }

}
