package com.example.haditsarbain;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HadisActivity6 extends AppCompatActivity implements View.OnClickListener
{
    MediaPlayer player5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadis5);

        ImageView btnMoveActivity = findViewById(R.id.next_act6);
        btnMoveActivity.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.next_act6:
                Intent moveIntent = new Intent(this, HadisActivity7.class);
                startActivity(moveIntent);
                break;
        }
    }

    //hadis 6
    public void play6(View view)
    {
        if(player5 == null)
        {
            player5 = MediaPlayer.create(this, R.raw.hadis6);
            player5.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopPlayer5();
                }
            });
        }
        player5.start();
    }

    public void pause6(View view)
    {
        if(player5 != null)
        {
            player5.pause();
        }
    }

    public void stop5(View view)
    {
        stopPlayer5();
    }

    private void stopPlayer5()
    {
        if(player5 != null)
        {
            player5.release();
            player5 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    protected void onStop5()
    {
        super.onStop();
        stopPlayer5();
    }
    //---------

}
