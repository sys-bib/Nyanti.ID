package com.example.haditsarbain;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class HadisActivity2 extends AppCompatActivity implements View.OnClickListener
{
    MediaPlayer player1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadis1);

        ImageView btnMoveActivity = findViewById(R.id.next_act2);
        btnMoveActivity.setOnClickListener(this);
    }

    //hadis 2
    public void play2(View view)
    {
        if(player1 == null)
        {
            player1 = MediaPlayer.create(this, R.raw.hadis2);
            player1.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopPlayer1();
                }
            });
        }
        player1.start();
    }

    public void pause2(View view)
    {
        if(player1 != null)
        {
            player1.pause();
        }
    }

    public void stop1(View view)
    {
        stopPlayer1();
    }

    private void stopPlayer1()
    {
        if(player1 != null)
        {
            player1.release();
            player1 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    protected void onStop1()
    {
        super.onStop();
        stopPlayer1();
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.next_act2:
                Intent moveIntent = new Intent(this, HadisActivity3.class);
                startActivity(moveIntent);
                break;
        }
    }
    //---------

}
