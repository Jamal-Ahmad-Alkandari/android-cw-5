package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final TextView name = findViewById(R.id.name);
        final TextView age = findViewById(R.id.age);
        Button back = findViewById(R.id.back);

        Bundle s = getIntent().getExtras();
        String b = s.getString("name");
        String d = s.getString("Age");
        name.setText("اسمك: " + b );
        age.setText("عمرك: " + d);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(MainActivity2.this , MainActivity.class);
                startActivity(v);
            }
        });
    }
}