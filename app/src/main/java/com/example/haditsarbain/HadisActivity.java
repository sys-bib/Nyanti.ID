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

public class HadisActivity extends AppCompatActivity implements View.OnClickListener
{
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadis);

        ImageView btnMoveActivity = findViewById(R.id.next_act);
        btnMoveActivity.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.next_act:
                Intent moveIntent = new Intent(this, HadisActivity2.class);
                startActivity(moveIntent);
                break;
        }
    }
    //hadis 1
    public void play1(View view)
    {
        if(player == null)
        {
            player = MediaPlayer.create(this, R.raw.hadis1);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopPlayer();
                }
            });
        }
        player.start();
    }

    public void pause1(View view)
    {
        if(player != null)
        {
            player.pause();
        }
    }

    public void stop(View view)
    {
        stopPlayer();
    }

    private void stopPlayer()
    {
        if(player != null)
        {
            player.release();
            player = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    protected void onStop()
    {
        super.onStop();
        stopPlayer();
    }
    //---------
}
