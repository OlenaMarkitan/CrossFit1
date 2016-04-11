package com.example.android.crossfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick1(View v){
    if(v.getId() == R.id.Button1)
    {
        Intent i = new Intent(MainActivity.this,first.class);
        startActivity(i);
    }
}
    public void onButtonClick2(View v){
        if(v.getId() == R.id.Button2)
        {
            Intent d = new Intent(MainActivity.this,second.class);
            startActivity(d);
        }
    }
    public void onButtonClick3(View v){
        if(v.getId() == R.id.Button3)
        {
            Intent t = new Intent(MainActivity.this,third.class);
            startActivity(t);
        }
    }
    public void onButtonClick4(View v){
        if(v.getId() == R.id.Button4)
        {
            Intent h = new Intent(MainActivity.this,fourth.class);
            startActivity(h);
        }
    }
    public void onButtonClick5(View v){
        if(v.getId() == R.id.Button5)
        {
            Intent k = new Intent(MainActivity.this,fifth.class);
            startActivity(k);
        }
    }
}
