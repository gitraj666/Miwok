package com.example.prithviraj.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        final ArrayList<Word> Words = new ArrayList<Word>();

        Word w = new Word("black","weṭeṭṭi",R.drawable.color_black,R.raw.color_gray);
        Words.add(w);
        Word w1 = new Word("brown","chokokki",R.drawable.color_brown,R.raw.color_brown);
        Words.add(w1);
        Word w2 = new Word("dusty_yellow","ṭakaakki",R.drawable.color_dusty_yellow,R.raw.color_brown);
        Words.add(w2);
        Word w3 = new Word("gray","ṭopoppi",R.drawable.color_gray,R.raw.color_red);
        Words.add(w3);
        Word w4 = new Word("green","kululli",R.drawable.color_green,R.raw.color_white);
        Words.add(w4);
        Word w5 = new Word("mustard yellow","kelelli",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow);
        Words.add(w5);
        Word w6 = new Word("red","ṭopiisә",R.drawable.color_red,R.raw.color_black);
        Words.add(w6);
        Word w7 = new Word("white","chiwiiṭә",R.drawable.color_white,R.raw.color_black);
        Words.add(w7);

        WordAdapter itemsAdapter  = new WordAdapter(this, Words);
        ListView listview = (ListView)findViewById(R.id.activity_colors);
        listview.setAdapter(itemsAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = Words.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(ColorsActivity.this,word.getSoundResourceId());
                mediaPlayer.start();

            }
        });
    }
}
