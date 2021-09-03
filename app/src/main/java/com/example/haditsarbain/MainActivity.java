package com.example.haditsarbain;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView btnhadis = findViewById(R.id.hadis);
        btnhadis.setOnClickListener(this);

        ImageView btntajwid = findViewById(R.id.tajwid);
        btntajwid.setOnClickListener(this);

        ImageView btninfo = findViewById(R.id.infoponpes);
        btninfo.setOnClickListener(this);

        ImageView btnakun = findViewById(R.id.akun);
        btnakun.setOnClickListener(this);

    }


    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.hadis:
                Intent w = new Intent(MainActivity.this, HadisActivity.class);
                startActivity(w);
                break;
            case R.id.tajwid:
                Intent moveIntent2 = new Intent(MainActivity.this, TajwidActivity.class);
                startActivity(moveIntent2);
                break;
            case R.id.infoponpes:
                Intent moveIntent3 = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(moveIntent3);
                break;
            case R.id.akun:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Account");
                builder.setMessage("Welcome, User!");
                builder.setPositiveButton("OK",
                        new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Log.e("info", "OK");
                            }
                        });
                builder.show();
        }
    }


}
