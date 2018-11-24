package com.example.anujyadav.resfolderki;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {
 private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        setTitle("Numbers");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        final ArrayList<word> words=new ArrayList<word>();
        words.add(new word("lulli","one",R.drawable.number_one,R.drawable.baseline_play_arrow_black_18dp,R.raw.number_one));
        words.add(new word("lulli","one",R.drawable.number_two,R.drawable.baseline_play_arrow_black_18dp,R.raw.number_two));
        words.add(new word("lulli","one",R.drawable.number_three,R.drawable.baseline_play_arrow_black_18dp,R.raw.number_three));
        words.add(new word("lulli","one",R.drawable.number_four,R.drawable.baseline_play_arrow_black_18dp,R.raw.number_four));
        words.add(new word("lulli","one",R.drawable.number_five,R.drawable.baseline_play_arrow_black_18dp,R.raw.number_five));
        words.add(new word("lulli","one",R.drawable.number_six,R.drawable.baseline_play_arrow_black_18dp,R.raw.number_six));
        words.add(new word("lulli","one",R.drawable.number_seven,R.drawable.baseline_play_arrow_black_18dp,R.raw.number_seven));
        words.add(new word("lulli","one",R.drawable.number_eight,R.drawable.baseline_play_arrow_black_18dp,R.raw.number_eight));
        words.add(new word("lulli","one",R.drawable.number_nine,R.drawable.baseline_play_arrow_black_18dp,R.raw.number_nine));
        words.add(new word("lulli","one",R.drawable.number_ten,R.drawable.baseline_play_arrow_black_18dp,R.raw.number_ten));




        wordAdapter Adapter = new wordAdapter(this,words,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                word w=words.get(i);
                mp=MediaPlayer.create(getApplicationContext(),w.getSound());
                if(mp.isPlaying()){
                    mp.stop();
                }
                else
                    mp.start();

            }
        });

    }
}
