package com.example.haditsarbain;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HadisActivity5 extends AppCompatActivity implements View.OnClickListener
{
    MediaPlayer player4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadis4);

        ImageView btnMoveActivity = findViewById(R.id.next_act5);
        btnMoveActivity.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.next_act5:
                Intent moveIntent = new Intent(this, HadisActivity6.class);
                startActivity(moveIntent);
                break;
        }
    }

    //hadis 5
    public void play5(View view)
    {
        if(player4 == null)
        {
            player4 = MediaPlayer.create(this, R.raw.hadis5);
            player4.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopPlayer4();
                }
            });
        }
        player4.start();
    }

    public void pause5(View view)
    {
        if(player4 != null)
        {
            player4.pause();
        }
    }

    public void stop4(View view)
    {
        stopPlayer4();
    }

    private void stopPlayer4()
    {
        if(player4 != null)
        {
            player4.release();
            player4 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    protected void onStop4()
    {
        super.onStop();
        stopPlayer4();
    }
    //---------

}
