package com.example.haditsarbain;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HadisActivity8 extends AppCompatActivity implements View.OnClickListener
{
    MediaPlayer player7;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadis7);

        ImageView btnMoveActivity = findViewById(R.id.next_act8);
        btnMoveActivity.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.next_act8:
                Intent moveIntent = new Intent(this, HadisActivity9.class);
                startActivity(moveIntent);
                break;
        }
    }

    //hadis 8
    public void play8(View view)
    {
        if(player7 == null)
        {
            player7 = MediaPlayer.create(this, R.raw.hadis8);
            player7.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopPlayer7();
                }
            });
        }
        player7.start();
    }

    public void pause8(View view)
    {
        if(player7 != null)
        {
            player7.pause();
        }
    }

    public void stop7(View view)
    {
        stopPlayer7();
    }

    private void stopPlayer7()
    {
        if(player7 != null)
        {
            player7.release();
            player7 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    protected void onStop7()
    {
        super.onStop();
        stopPlayer7();
    }
    //---------

}
