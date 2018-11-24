package com.example.anujyadav.resfolderki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1= (TextView)findViewById(R.id.numbers);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1= new Intent(getApplicationContext(),Numbers.class);
                startActivity(i1);
            }
        });

        TextView t2= (TextView)findViewById(R.id.family);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1= new Intent(getApplicationContext(),Family.class);
                startActivity(i1);
            }
        });
        TextView t3= (TextView)findViewById(R.id.colors);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1= new Intent(getApplicationContext(),Colors.class);
                startActivity(i1);
            }
        });
        TextView t4= (TextView)findViewById(R.id.phrases);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1= new Intent(getApplicationContext(),Phrases.class);
                startActivity(i1);
            }
        });


    }
}
