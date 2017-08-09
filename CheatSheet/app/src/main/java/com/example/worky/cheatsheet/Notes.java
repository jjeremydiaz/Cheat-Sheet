package com.example.worky.cheatsheet;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Notes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        GlobalFunctions globalFunctions = new GlobalFunctions(this.getBaseContext(), this);
        globalFunctions.changeTaskBarColor(R.color.homework);

        android.support.v7.app.ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#03A9F4")));

        Button Note = (Button) findViewById(R.id.Notebutton);
        Note.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent intent = new Intent(getApplicationContext(), Note2.class);
                startActivity(intent);


            }
        });

    }
}


