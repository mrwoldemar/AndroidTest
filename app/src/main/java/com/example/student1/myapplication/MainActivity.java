package com.example.student1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v){
        Log.e("Заголовок", "Привет");
        Toast.makeText( MainActivity.this,
                        R.string.message,
                        Toast.LENGTH_SHORT).show();
    }
    public void onClick2(View v){
        Log.e("Заголовок", "Привет");
        Toast.makeText( MainActivity.this,
                R.string.message2,
                Toast.LENGTH_SHORT).show();
    }

}
