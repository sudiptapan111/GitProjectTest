package com.example.gitprojecttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttontest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttontest=findViewById(R.id.buttontest);
        buttontest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"button click",Toast.LENGTH_LONG).show();
            }
        });

     //
        buttontest.setText("new code");

        //

        buttontest.setText("new code myself test");

        //




    }
}