package com.example.prithviraj.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        final ArrayList<Word> Words = new ArrayList<Word>();

        Word w = new Word("father","әpә",R.drawable.family_father,R.raw.family_father);
        Words.add(w);
        Word w1 = new Word("mother","әṭa",R.drawable.family_mother,R.raw.family_mother);
        Words.add(w1);
        Word w2 = new Word("son","angsi",R.drawable.family_son,R.raw.family_son);
        Words.add(w2);
        Word w3 = new Word("daughter","tune",R.drawable.family_daughter,R.raw.family_daughter);
        Words.add(w3);
        Word w4 = new Word("older brother","taachi",R.drawable.family_older_brother,R.raw.family_older_brother);
        Words.add(w4);
        Word w5 = new Word("younger brother","chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother);
        Words.add(w5);
        Word w6 = new Word("older sister","teṭe",R.drawable.family_older_sister,R.raw.family_older_sister);
        Words.add(w6);
        Word w7 = new Word("younger sister","kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister);
        Words.add(w7);
        Word w8 = new Word("grandmother","ama",R.drawable.family_grandfather,R.raw.family_grandmother);
        Words.add(w8);
        Word w9 = new Word("grandfather","paapa",R.drawable.family_grandmother,R.raw.family_grandfather);
        Words.add(w9);

        //Display list of Words
        WordAdapter itemsAdapter  = new WordAdapter(this, Words);
        ListView listview = (ListView)findViewById(R.id.activity_family);
        listview.setAdapter(itemsAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = Words.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(FamilyActivity.this,word.getSoundResourceId());
                mediaPlayer.start();

            }
        });
    }

}
