package com.example.haditsarbain;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HadisActivity9 extends AppCompatActivity implements View.OnClickListener
{
    MediaPlayer player8;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadis8);

        ImageView btnMoveActivity = findViewById(R.id.next_act9);
        btnMoveActivity.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.next_act9:
                Intent moveIntent = new Intent(this, HadisActivity10.class);
                startActivity(moveIntent);
                break;
        }
    }

    //hadis 9
    public void play9(View view)
    {
        if(player8 == null)
        {
            player8 = MediaPlayer.create(this, R.raw.hadis9);
            player8.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopPlayer8();
                }
            });
        }
        player8.start();
    }

    public void pause9(View view)
    {
        if(player8 != null)
        {
            player8.pause();
        }
    }

    public void stop8(View view)
    {
        stopPlayer8();
    }

    private void stopPlayer8()
    {
        if(player8 != null)
        {
            player8.release();
            player8 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    protected void onStop8()
    {
        super.onStop();
        stopPlayer8();
    }
    //---------

}
