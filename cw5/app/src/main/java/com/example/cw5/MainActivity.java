package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edit1 = findViewById(R.id.name);
       final EditText edit2 = findViewById(R.id.age);
        Button but = findViewById(R.id.nextPage);


        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(MainActivity.this , MainActivity2.class);
                v.putExtra("name",edit1.getText().toString());
                v.putExtra("Age",edit2.getText().toString());
                startActivity(v);
            }
        });

    }
}