package com.example.haditsarbain;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class HadisActivity10 extends AppCompatActivity implements View.OnClickListener
{

    MediaPlayer player9;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadis9);

        ImageView btnMoveActivity = findViewById(R.id.next_act10);
        btnMoveActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.next_act10:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Hadits Arbain");
                builder.setMessage("Coming Soon");
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



    //hadis 10
    public void play10(View view)
    {
        if(player9 == null)
        {
            player9 = MediaPlayer.create(this, R.raw.hadis10);
            player9.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopPlayer9();
                }
            });
        }
        player9.start();
    }

    public void pause10(View view)
    {
        if(player9 != null)
        {
            player9.pause();
        }
    }

    public void stop9(View view)
    {
        stopPlayer9();
    }

    private void stopPlayer9()
    {
        if(player9 != null)
        {
            player9.release();
            player9 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    protected void onStop9()
    {
        super.onStop();
        stopPlayer9();
    }


    //---------

}
