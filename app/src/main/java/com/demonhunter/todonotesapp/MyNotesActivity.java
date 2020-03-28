package com.demonhunter.todonotesapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MyNotesActivity extends AppCompatActivity {
    String fullName ;
    FloatingActionButton fabAddNotes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_notes);
        fabAddNotes=findViewById(R.id.fabAddNotes);
        Intent i =getIntent();
        fullName = i.getStringExtra("full name");
        Log.d("my notes",i.getStringExtra("full name"));
        getSupportActionBar().setTitle(fullName);

        fabAddNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Fab", "Fab Pressed");
            }
        });
    }
}
