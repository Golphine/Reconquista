package com.example.reconquista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button_start = (Button) findViewById(R.id.button_start);
        button_start.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(MainActivity.this, One_level.class); startActivity(intent);finish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}