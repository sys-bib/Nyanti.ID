package com.example.haditsarbain;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HadisActivity4 extends AppCompatActivity implements View.OnClickListener
{
    MediaPlayer player3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadis3);

        ImageView btnMoveActivity = findViewById(R.id.next_act4);
        btnMoveActivity.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.next_act4:
                Intent moveIntent = new Intent(this, HadisActivity5.class);
                startActivity(moveIntent);
                break;
        }
    }

    //hadis 4
    public void play4(View view)
    {
        if(player3 == null)
        {
            player3 = MediaPlayer.create(this, R.raw.hadis4);
            player3.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopPlayer3();
                }
            });
        }
        player3.start();
    }

    public void pause4(View view)
    {
        if(player3 != null)
        {
            player3.pause();
        }
    }

    public void stop3(View view)
    {
        stopPlayer3();
    }

    private void stopPlayer3()
    {
        if(player3 != null)
        {
            player3.release();
            player3 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    protected void onStop3()
    {
        super.onStop();
        stopPlayer3();
    }
    //---------

}
