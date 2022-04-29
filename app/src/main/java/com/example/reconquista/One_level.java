package com.example.reconquista;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class One_level extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_level);
        final Button button_start_the_game = (Button) findViewById(R.id.button_start_the_game);
        button_start_the_game.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(One_level.this,Begining_the_game.class);startActivity(intent);finish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}