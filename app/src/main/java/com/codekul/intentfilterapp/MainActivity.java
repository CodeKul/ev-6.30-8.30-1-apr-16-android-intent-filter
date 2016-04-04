package com.codekul.intentfilterapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnOkay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent intent = new Intent("com.codekul.news");

                //Intent intent = new Intent("com.codekul.news");
                //intent.setData(Uri.parse("uity://5454"));
                //startActivity(intent); // implicit intent


                Intent intent1 = new Intent(Intent.ACTION_CALL);
                intent1.setData(Uri.parse("tel://9762548833"));

                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                     ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.CALL_PHONE},123);
                }
                else {

                    startActivity(intent1);
                }
            }
        });
    }
}
