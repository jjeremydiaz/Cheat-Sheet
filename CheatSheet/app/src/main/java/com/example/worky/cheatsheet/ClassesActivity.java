package com.example.worky.cheatsheet;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ClassesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton addclassbutton = (FloatingActionButton) findViewById(R.id.addclassbutton);
        addclassbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddClasses.class);
                startActivity(intent);
            }
        });
        GlobalFunctions globalFunctions = new GlobalFunctions(this.getBaseContext(), this);
        globalFunctions.changeTaskBarColor(R.color.register);
    }
}

