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

public class HadisActivity3 extends AppCompatActivity implements View.OnClickListener
{
    MediaPlayer player2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadis2);

        ImageView btnMoveActivity = findViewById(R.id.next_act3);
        btnMoveActivity.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.next_act3:
                Intent moveIntent = new Intent(this, HadisActivity4.class);
                startActivity(moveIntent);
                break;
        }
    }

    //hadis 3
    public void play3(View view)
    {
        if(player2 == null)
        {
            player2 = MediaPlayer.create(this, R.raw.hadis3);
            player2.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopPlayer2();
                }
            });
        }
        player2.start();
    }

    public void pause3(View view)
    {
        if(player2 != null)
        {
            player2.pause();
        }
    }

    public void stop2(View view)
    {
        stopPlayer2();
    }

    private void stopPlayer2()
    {
        if(player2 != null)
        {
            player2.release();
            player2 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    protected void onStop2()
    {
        super.onStop();
        stopPlayer2();
    }
    //---------
}
