package com.example.haditsarbain;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TajwidActivity extends AppCompatActivity
{
    MediaPlayer huruf1,huruf2,huruf3,huruf4,huruf5,huruf6,huruf7,huruf8,huruf9,huruf10,huruf11,huruf12,
            huruf13,huruf14,huruf15,huruf16,huruf17,huruf18,huruf19,huruf20,huruf21,huruf22,huruf23,
            huruf24,huruf25,huruf26,huruf27,huruf28;
    MediaPlayer tanda1,tanda2,tanda3,tanda4,tanda5,tanda6,tanda7,tanda8,tanda9,tanda10,tanda11,tanda12,
            tanda13,tanda14,tanda15,tanda16,tanda17,tanda18,tanda19,tanda20,tanda21,tanda22,tanda23,
            tanda24,tanda25,tanda26,tanda27,tanda28;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tajwid);
    }

    //tajwid 1
    public void huruf1(View view)
    {
        if(huruf1 == null)
        {
            huruf1 = MediaPlayer.create(this, R.raw.tajwid1);
            huruf1.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf1();
                }
            });
        }
        huruf1.start();
    }

    private void stopHuruf1()
    {
        if(huruf1 != null)
        {
            huruf1.release();
            huruf1 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda1(View view)
    {
        if(tanda1 == null)
        {
            tanda1 = MediaPlayer.create(this, R.raw.tanda1);
            tanda1.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda1();
                }
            });
        }
        tanda1.start();
    }

    private void stoptanda1()
    {
        if(tanda1 != null)
        {
            tanda1.release();
            tanda1 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }
    //---------

    //tajwid 2
    public void huruf2(View view)
    {
        if(huruf2 == null)
        {
            huruf2 = MediaPlayer.create(this, R.raw.tajwid2);
            huruf2.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf2();
                }
            });
        }
        huruf2.start();
    }

    private void stopHuruf2()
    {
        if(huruf2 != null)
        {
            huruf2.release();
            huruf2 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda2(View view)
    {
        if(tanda2 == null)
        {
            tanda2 = MediaPlayer.create(this, R.raw.tanda2);
            tanda2.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda2();
                }
            });
        }
        tanda2.start();
    }

    private void stoptanda2()
    {
        if(tanda2 != null)
        {
            tanda2.release();
            tanda2 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 3
    public void huruf3(View view)
    {
        if(huruf3 == null)
        {
            huruf3 = MediaPlayer.create(this, R.raw.tajwid3);
            huruf3.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf3();
                }
            });
        }
        huruf3.start();
    }

    private void stopHuruf3()
    {
        if(huruf3 != null)
        {
            huruf3.release();
            huruf3 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda3(View view)
    {
        if(tanda3 == null)
        {
            tanda3 = MediaPlayer.create(this, R.raw.tanda3);
            tanda3.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda3();
                }
            });
        }
        tanda3.start();
    }

    private void stoptanda3()
    {
        if(tanda3 != null)
        {
            tanda3.release();
            tanda3 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 4
    public void huruf4(View view)
    {
        if(huruf4 == null)
        {
            huruf4 = MediaPlayer.create(this, R.raw.tajwid4);
            huruf4.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf4();
                }
            });
        }
        huruf4.start();
    }

    private void stopHuruf4()
    {
        if(huruf4 != null)
        {
            huruf4.release();
            huruf4 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda4(View view)
    {
        if(tanda4 == null)
        {
            tanda4 = MediaPlayer.create(this, R.raw.tanda4);
            tanda4.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda4();
                }
            });
        }
        tanda4.start();
    }

    private void stoptanda4()
    {
        if(tanda4 != null)
        {
            tanda4.release();
            tanda4 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 5
    public void huruf5(View view)
    {
        if(huruf5 == null)
        {
            huruf5 = MediaPlayer.create(this, R.raw.tajwid5);
            huruf5.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf5();
                }
            });
        }
        huruf5.start();
    }

    private void stopHuruf5()
    {
        if(huruf5 != null)
        {
            huruf5.release();
            huruf5 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda5(View view)
    {
        if(tanda5 == null)
        {
            tanda5 = MediaPlayer.create(this, R.raw.tanda5);
            tanda5.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda5();
                }
            });
        }
        tanda5.start();
    }

    private void stoptanda5()
    {
        if(tanda5 != null)
        {
            tanda5.release();
            tanda5 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 6
    public void huruf6(View view)
    {
        if(huruf6 == null)
        {
            huruf6 = MediaPlayer.create(this, R.raw.tajwid6);
            huruf6.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf6();
                }
            });
        }
        huruf6.start();
    }

    private void stopHuruf6()
    {
        if(huruf6 != null)
        {
            huruf6.release();
            huruf6 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda6(View view)
    {
        if(tanda6 == null)
        {
            tanda6 = MediaPlayer.create(this, R.raw.tanda6);
            tanda6.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda6();
                }
            });
        }
        tanda6.start();
    }

    private void stoptanda6()
    {
        if(tanda6 != null)
        {
            tanda6.release();
            tanda6 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 7
    public void huruf7(View view)
    {
        if(huruf7 == null)
        {
            huruf7 = MediaPlayer.create(this, R.raw.tajwid7);
            huruf7.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf7();
                }
            });
        }
        huruf7.start();
    }

    private void stopHuruf7()
    {
        if(huruf7 != null)
        {
            huruf7.release();
            huruf7 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda7(View view)
    {
        if(tanda7 == null)
        {
            tanda7 = MediaPlayer.create(this, R.raw.tanda7);
            tanda7.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda7();
                }
            });
        }
        tanda7.start();
    }

    private void stoptanda7()
    {
        if(tanda7 != null)
        {
            tanda7.release();
            tanda7 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 8
    public void huruf8(View view)
    {
        if(huruf8 == null)
        {
            huruf8 = MediaPlayer.create(this, R.raw.tajwid8);
            huruf8.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf8();
                }
            });
        }
        huruf8.start();
    }

    private void stopHuruf8()
    {
        if(huruf8 != null)
        {
            huruf8.release();
            huruf8 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda8(View view)
    {
        if(tanda8 == null)
        {
            tanda8 = MediaPlayer.create(this, R.raw.tanda8);
            tanda8.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda8();
                }
            });
        }
        tanda8.start();
    }

    private void stoptanda8()
    {
        if(tanda8 != null)
        {
            tanda8.release();
            tanda8 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 9
    public void huruf9(View view)
    {
        if(huruf9 == null)
        {
            huruf9 = MediaPlayer.create(this, R.raw.tajwid9);
            huruf9.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf9();
                }
            });
        }
        huruf9.start();
    }

    private void stopHuruf9()
    {
        if(huruf9 != null)
        {
            huruf9.release();
            huruf9 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda9(View view)
    {
        if(tanda9 == null)
        {
            tanda9 = MediaPlayer.create(this, R.raw.tanda9);
            tanda9.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda9();
                }
            });
        }
        tanda9.start();
    }

    private void stoptanda9()
    {
        if(tanda9 != null)
        {
            tanda9.release();
            tanda9 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 10
    public void huruf10(View view)
    {
        if(huruf10 == null)
        {
            huruf10 = MediaPlayer.create(this, R.raw.tajwid10);
            huruf10.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf10();
                }
            });
        }
        huruf10.start();
    }

    private void stopHuruf10()
    {
        if(huruf10 != null)
        {
            huruf10.release();
            huruf10 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda10(View view)
    {
        if(tanda10 == null)
        {
            tanda10 = MediaPlayer.create(this, R.raw.tanda10);
            tanda10.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda10();
                }
            });
        }
        tanda10.start();
    }

    private void stoptanda10()
    {
        if(tanda10 != null)
        {
            tanda10.release();
            tanda10 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 11
    public void huruf11(View view)
    {
        if(huruf11 == null)
        {
            huruf11 = MediaPlayer.create(this, R.raw.tajwid11);
            huruf11.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf11();
                }
            });
        }
        huruf11.start();
    }

    private void stopHuruf11()
    {
        if(huruf11 != null)
        {
            huruf11.release();
            huruf11 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda11(View view)
    {
        if(tanda11 == null)
        {
            tanda11 = MediaPlayer.create(this, R.raw.tanda11);
            tanda11.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda11();
                }
            });
        }
        tanda11.start();
    }

    private void stoptanda11()
    {
        if(tanda11 != null)
        {
            tanda11.release();
            tanda11 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 12
    public void huruf12(View view)
    {
        if(huruf12 == null)
        {
            huruf12 = MediaPlayer.create(this, R.raw.tajwid12);
            huruf12.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf12();
                }
            });
        }
        huruf12.start();
    }

    private void stopHuruf12()
    {
        if(huruf12 != null)
        {
            huruf12.release();
            huruf12 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda12(View view)
    {
        if(tanda12 == null)
        {
            tanda12 = MediaPlayer.create(this, R.raw.tanda12);
            tanda12.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda12();
                }
            });
        }
        tanda12.start();
    }

    private void stoptanda12()
    {
        if(tanda12 != null)
        {
            tanda12.release();
            tanda12 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 13
    public void huruf13(View view)
    {
        if(huruf13 == null)
        {
            huruf13 = MediaPlayer.create(this, R.raw.tajwid13);
            huruf13.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf13();
                }
            });
        }
        huruf13.start();
    }

    private void stopHuruf13()
    {
        if(huruf13 != null)
        {
            huruf13.release();
            huruf13 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda13(View view)
    {
        if(tanda13 == null)
        {
            tanda13 = MediaPlayer.create(this, R.raw.tanda13);
            tanda13.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda13();
                }
            });
        }
        tanda13.start();
    }

    private void stoptanda13()
    {
        if(tanda13 != null)
        {
            tanda13.release();
            tanda13 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 14
    public void huruf14(View view)
    {
        if(huruf14 == null)
        {
            huruf14 = MediaPlayer.create(this, R.raw.tajwid14);
            huruf14.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf14();
                }
            });
        }
        huruf14.start();
    }

    private void stopHuruf14()
    {
        if(huruf14 != null)
        {
            huruf14.release();
            huruf14 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda14(View view)
    {
        if(tanda14 == null)
        {
            tanda14 = MediaPlayer.create(this, R.raw.tanda14);
            tanda14.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda14();
                }
            });
        }
        tanda14.start();
    }

    private void stoptanda14()
    {
        if(tanda14 != null)
        {
            tanda14.release();
            tanda14 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 15
    public void huruf15(View view)
    {
        if(huruf15 == null)
        {
            huruf15 = MediaPlayer.create(this, R.raw.tajwid15);
            huruf15.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf15();
                }
            });
        }
        huruf15.start();
    }

    private void stopHuruf15()
    {
        if(huruf15 != null)
        {
            huruf15.release();
            huruf15 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda15(View view)
    {
        if(tanda15 == null)
        {
            tanda15 = MediaPlayer.create(this, R.raw.tanda15);
            tanda15.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda15();
                }
            });
        }
        tanda15.start();
    }

    private void stoptanda15()
    {
        if(tanda15 != null)
        {
            tanda15.release();
            tanda15 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 16
    public void huruf16(View view)
    {
        if(huruf16 == null)
        {
            huruf16 = MediaPlayer.create(this, R.raw.tajwid16);
            huruf16.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf16();
                }
            });
        }
        huruf16.start();
    }

    private void stopHuruf16()
    {
        if(huruf16 != null)
        {
            huruf16.release();
            huruf16 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda16(View view)
    {
        if(tanda16 == null)
        {
            tanda16 = MediaPlayer.create(this, R.raw.tanda16);
            tanda16.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda16();
                }
            });
        }
        tanda16.start();
    }

    private void stoptanda16()
    {
        if(tanda16 != null)
        {
            tanda16.release();
            tanda16 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 17
    public void huruf17(View view)
    {
        if(huruf17 == null)
        {
            huruf17 = MediaPlayer.create(this, R.raw.tajwid17);
            huruf17.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf17();
                }
            });
        }
        huruf17.start();
    }

    private void stopHuruf17()
    {
        if(huruf17 != null)
        {
            huruf17.release();
            huruf17 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda17(View view)
    {
        if(tanda17 == null)
        {
            tanda17 = MediaPlayer.create(this, R.raw.tanda17);
            tanda17.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda17();
                }
            });
        }
        tanda17.start();
    }

    private void stoptanda17()
    {
        if(tanda17 != null)
        {
            tanda17.release();
            tanda17 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 18
    public void huruf18(View view)
    {
        if(huruf18 == null)
        {
            huruf18 = MediaPlayer.create(this, R.raw.tajwid18);
            huruf18.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf18();
                }
            });
        }
        huruf18.start();
    }

    private void stopHuruf18()
    {
        if(huruf18 != null)
        {
            huruf18.release();
            huruf18 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda18(View view)
    {
        if(tanda18 == null)
        {
            tanda18 = MediaPlayer.create(this, R.raw.tanda18);
            tanda18.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda18();
                }
            });
        }
        tanda18.start();
    }

    private void stoptanda18()
    {
        if(tanda18 != null)
        {
            tanda18.release();
            tanda18 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 19
    public void huruf19(View view)
    {
        if(huruf19 == null)
        {
            huruf19 = MediaPlayer.create(this, R.raw.tajwid19);
            huruf19.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf19();
                }
            });
        }
        huruf19.start();
    }

    private void stopHuruf19()
    {
        if(huruf19 != null)
        {
            huruf19.release();
            huruf19 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda19(View view)
    {
        if(tanda19 == null)
        {
            tanda19 = MediaPlayer.create(this, R.raw.tanda19);
            tanda19.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda19();
                }
            });
        }
        tanda19.start();
    }

    private void stoptanda19()
    {
        if(tanda19 != null)
        {
            tanda19.release();
            tanda19 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 20
    public void huruf20(View view)
    {
        if(huruf20 == null)
        {
            huruf20 = MediaPlayer.create(this, R.raw.tajwid20);
            huruf20.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf20();
                }
            });
        }
        huruf20.start();
    }

    private void stopHuruf20()
    {
        if(huruf20 != null)
        {
            huruf20.release();
            huruf20 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda20(View view)
    {
        if(tanda20 == null)
        {
            tanda20 = MediaPlayer.create(this, R.raw.tanda20);
            tanda20.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda20();
                }
            });
        }
        tanda20.start();
    }

    private void stoptanda20()
    {
        if(tanda20 != null)
        {
            tanda20.release();
            tanda20 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 21
    public void huruf21(View view)
    {
        if(huruf21 == null)
        {
            huruf21 = MediaPlayer.create(this, R.raw.tajwid21);
            huruf21.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf21();
                }
            });
        }
        huruf21.start();
    }

    private void stopHuruf21()
    {
        if(huruf21 != null)
        {
            huruf21.release();
            huruf21 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda21(View view)
    {
        if(tanda21 == null)
        {
            tanda21 = MediaPlayer.create(this, R.raw.tanda21);
            tanda21.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda21();
                }
            });
        }
        tanda21.start();
    }

    private void stoptanda21()
    {
        if(tanda21 != null)
        {
            tanda21.release();
            tanda21 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 22
    public void huruf22(View view)
    {
        if(huruf22 == null)
        {
            huruf22 = MediaPlayer.create(this, R.raw.tajwid22);
            huruf22.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf22();
                }
            });
        }
        huruf22.start();
    }

    private void stopHuruf22()
    {
        if(huruf22 != null)
        {
            huruf22.release();
            huruf22 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda22(View view)
    {
        if(tanda22 == null)
        {
            tanda22 = MediaPlayer.create(this, R.raw.tanda22);
            tanda22.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda22();
                }
            });
        }
        tanda22.start();
    }

    private void stoptanda22()
    {
        if(tanda22 != null)
        {
            tanda22.release();
            tanda22 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 23
    public void huruf23(View view)
    {
        if(huruf23 == null)
        {
            huruf23 = MediaPlayer.create(this, R.raw.tajwid23);
            huruf23.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf23();
                }
            });
        }
        huruf23.start();
    }

    private void stopHuruf23()
    {
        if(huruf23 != null)
        {
            huruf23.release();
            huruf23 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda23(View view)
    {
        if(tanda23 == null)
        {
            tanda23 = MediaPlayer.create(this, R.raw.tanda23);
            tanda23.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda23();
                }
            });
        }
        tanda23.start();
    }

    private void stoptanda23()
    {
        if(tanda23 != null)
        {
            tanda23.release();
            tanda23 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 24
    public void huruf24(View view)
    {
        if(huruf24 == null)
        {
            huruf24 = MediaPlayer.create(this, R.raw.tajwid24);
            huruf24.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf24();
                }
            });
        }
        huruf24.start();
    }

    private void stopHuruf24()
    {
        if(huruf24 != null)
        {
            huruf24.release();
            huruf24 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda24(View view)
    {
        if(tanda24 == null)
        {
            tanda24 = MediaPlayer.create(this, R.raw.tanda24);
            tanda24.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda24();
                }
            });
        }
        tanda24.start();
    }

    private void stoptanda24()
    {
        if(tanda24 != null)
        {
            tanda24.release();
            tanda24 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 25
    public void huruf25(View view)
    {
        if(huruf25 == null)
        {
            huruf25 = MediaPlayer.create(this, R.raw.tajwid25);
            huruf25.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf25();
                }
            });
        }
        huruf25.start();
    }

    private void stopHuruf25()
    {
        if(huruf25 != null)
        {
            huruf25.release();
            huruf25 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda25(View view)
    {
        if(tanda25 == null)
        {
            tanda25 = MediaPlayer.create(this, R.raw.tanda25);
            tanda25.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda25();
                }
            });
        }
        tanda25.start();
    }

    private void stoptanda25()
    {
        if(tanda25 != null)
        {
            tanda25.release();
            tanda25 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 26
    public void huruf26(View view)
    {
        if(huruf26 == null)
        {
            huruf26 = MediaPlayer.create(this, R.raw.tajwid26);
            huruf26.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf26();
                }
            });
        }
        huruf26.start();
    }

    private void stopHuruf26()
    {
        if(huruf26 != null)
        {
            huruf26.release();
            huruf26 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda26(View view)
    {
        if(tanda26 == null)
        {
            tanda26 = MediaPlayer.create(this, R.raw.tanda26);
            tanda26.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda26();
                }
            });
        }
        tanda26.start();
    }

    private void stoptanda26()
    {
        if(tanda26 != null)
        {
            tanda26.release();
            tanda26 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 27
    public void huruf27(View view)
    {
        if(huruf27 == null)
        {
            huruf27 = MediaPlayer.create(this, R.raw.tajwid27);
            huruf27.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf27();
                }
            });
        }
        huruf27.start();
    }

    private void stopHuruf27()
    {
        if(huruf27 != null)
        {
            huruf27.release();
            huruf27 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda27(View view)
    {
        if(tanda27 == null)
        {
            tanda27 = MediaPlayer.create(this, R.raw.tanda27);
            tanda27.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda27();
                }
            });
        }
        tanda27.start();
    }

    private void stoptanda27()
    {
        if(tanda27 != null)
        {
            tanda27.release();
            tanda27 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //tajwid 28
    public void huruf28(View view)
    {
        if(huruf28 == null)
        {
            huruf28 = MediaPlayer.create(this, R.raw.tajwid28);
            huruf28.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stopHuruf28();
                }
            });
        }
        huruf28.start();
    }

    private void stopHuruf28()
    {
        if(huruf28 != null)
        {
            huruf28.release();
            huruf28 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

    //Tanda
    public void tanda28(View view)
    {
        if(tanda28 == null)
        {
            tanda28 = MediaPlayer.create(this, R.raw.tanda28);
            tanda28.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer)
                {
                    stoptanda28();
                }
            });
        }
        tanda28.start();
    }

    private void stoptanda28()
    {
        if(tanda28 != null)
        {
            tanda28.release();
            tanda28 = null;
            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
        }
    }

}
