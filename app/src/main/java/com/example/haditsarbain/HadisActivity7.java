package com.example.haditsarbain;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HadisActivity7 extends AppCompatActivity implements View.OnClickListener
{
    MediaPlayer player6;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadis6);

        ImageView btnMoveActivity = findViewById(R.id.next_act7);
        btnMoveActivity.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.next_act7:
                Intent moveIntent = new Intent(this, HadisActivity8.class);
                startActivity(moveIntent);
                break;
        }
    }

    //hadis 7
    public void play7(View view)
    {
        if(player6 == null)
        {
            player6 = MediaPlayer.create(this, R.raw.hadis7);
            player6.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopPlayer6();
                }
            });
        }
        player6.start();
    }

    public void pause7(View view)
    {
        if(player6 != null)
        {
            player6.pause();
        }
    }

    public void stop6(View view)
    {
        stopPlayer6();
    }

    private void stopPlayer6()
    {
        if(player6 != null)
        {
            player6.release();
            player6 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    protected void onStop6()
    {
        super.onStop();
        stopPlayer6();
    }
    //---------

}
