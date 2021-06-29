package com.example.webproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText urltype;
    Button Go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Go=findViewById()
        urltype=findViewById(R.id.urltype);
    }

    public void gotoweb(View view) {
        String url = urltype.getText().toString();
        if (url.isEmpty()) {
            Toast.makeText(MainActivity.this, "Please Enter URL!", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(MainActivity.this, WebActivity.class);
            intent.putExtra("url", url);
            startActivity(intent);
        }
    }

    public void gotogoogle(View view) {
        Intent intent = new Intent(MainActivity.this, WebActivity.class);
        intent.putExtra("url","www.google.com");
        startActivity(intent);
    }

    public void gotofb(View view) {
        Intent intent=new Intent(MainActivity.this, WebActivity.class);
        intent.putExtra("url","www.facebook.com");
        startActivity(intent);
    }

    public void quitapp(View view) {
     this.finish();
    }
}

//Made By Sameer Kumar
//        Gmail-->mesameerkumar@gmail.com
//Made on May 2021
// Simple Web Browser which takes string input(url) from user