//package com.example.haditsarbain;
//
//import android.media.Image;
//import android.media.MediaPlayer;
//import android.os.Bundle;
//import android.view.View;
//
//import android.widget.ImageView;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class TandaActivity extends AppCompatActivity
//{
//    MediaPlayer huruf1,huruf2,huruf3,huruf4,huruf5,huruf6,huruf7,huruf8,huruf9,huruf10,huruf11,huruf12,
//            huruf13,huruf14,huruf15,huruf16,huruf17,huruf18,huruf19,huruf20,huruf21,huruf22,huruf23,
//            huruf24,huruf25,huruf26,huruf27,huruf28;
//    @Override
//    protected void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_tanda);
//
//        ImageView t1 = findViewById(R.id.huruf1);
//
//        t1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                h1();
//            }
//        });
//
//    }
//
//
//    //tajwid 1
//    public void h1()
//    {
//        if(huruf1 == null)
//        {
//            huruf1 = MediaPlayer.create(this, R.raw.tajwid1);
//            huruf1.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stopHuruf1();
//                }
//            });
//        }
//        huruf1.start();
//    }
//
//    public void pause1(View view)
//    {
//        if(huruf1 != null)
//        {
//            huruf1.pause();
//        }
//    }
//
//    public void stop1(View view)
//    {
//        stopHuruf1();
//    }
//
//    private void stopHuruf1()
//    {
//        if(huruf1 != null)
//        {
//            huruf1.release();
//            huruf1 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop()
//    {
//        super.onStop();
//        stopHuruf1();
//    }
//    //---------
//
//    //tajwid 2
//    public void huruf2(View view)
//    {
//        if(huruf2 == null)
//        {
//            huruf2 = MediaPlayer.create(this, R.raw.tajwid2);
//            huruf2.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stopHuruf2();
//                }
//            });
//        }
//        huruf2.start();
//    }
//
//    public void pause2(View view)
//    {
//        if(huruf2 != null)
//        {
//            huruf2.pause();
//        }
//    }
//
//    public void stop2(View view)
//    {
//        stopHuruf2();
//    }
//
//    private void stopHuruf2()
//    {
//        if(huruf2 != null)
//        {
//            huruf2.release();
//            huruf2 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop2()
//    {
//        super.onStop();
//        stopHuruf2();
//    }
//    //---------
//
//    //tajwid 3
//    public void huruf3(View view)
//    {
//        if(huruf3 == null)
//        {
//            huruf3 = MediaPlayer.create(this, R.raw.tajwid3);
//            huruf3.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stopHuruf3();
//                }
//            });
//        }
//        huruf3.start();
//    }
//
//    public void pause3(View view)
//    {
//        if(huruf3 != null)
//        {
//            huruf3.pause();
//        }
//    }
//
//    public void stop3(View view)
//    {
//        stopHuruf3();
//    }
//
//    private void stopHuruf3()
//    {
//        if(huruf3 != null)
//        {
//            huruf3.release();
//            huruf3 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop3()
//    {
//        super.onStop();
//        stopHuruf3();
//    }
//    //---------
//
//    //tajwid 4
//    public void huruf4(View view)
//    {
//        if(huruf4 == null)
//        {
//            huruf4 = MediaPlayer.create(this, R.raw.tajwid4);
//            huruf4.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stopHuruf4();
//                }
//            });
//        }
//        huruf4.start();
//    }
//
//    public void pause4(View view)
//    {
//        if(huruf4 != null)
//        {
//            huruf4.pause();
//        }
//    }
//
//    public void stop4(View view)
//    {
//        stopHuruf4();
//    }
//
//    private void stopHuruf4()
//    {
//        if(huruf4 != null)
//        {
//            huruf4.release();
//            huruf4 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop4()
//    {
//        super.onStop();
//        stopHuruf4();
//    }
//    //---------
//
//    //tajwid 5
//    public void huruf5(View view)
//    {
//        if(huruf5 == null)
//        {
//            huruf5 = MediaPlayer.create(this, R.raw.tajwid5);
//            huruf5.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf5();
//                }
//            });
//        }
//        huruf5.start();
//    }
//
//    public void pause5(View view)
//    {
//        if(huruf5 != null)
//        {
//            huruf5.pause();
//        }
//    }
//
//    public void stop5(View view)
//    {
//        stophuruf5();
//    }
//
//    private void stophuruf5()
//    {
//        if(huruf5 != null)
//        {
//            huruf5.release();
//            huruf5 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop5()
//    {
//        super.onStop();
//        stophuruf5();
//    }
//    //---------
//
//    //tajwid 6
//    public void huruf6(View view)
//    {
//        if(huruf6 == null)
//        {
//            huruf6 = MediaPlayer.create(this, R.raw.tajwid6);
//            huruf6.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf6();
//                }
//            });
//        }
//        huruf6.start();
//    }
//
//    public void pause6(View view)
//    {
//        if(huruf6 != null)
//        {
//            huruf6.pause();
//        }
//    }
//
//    public void stop6(View view)
//    {
//        stophuruf6();
//    }
//
//    private void stophuruf6()
//    {
//        if(huruf6 != null)
//        {
//            huruf6.release();
//            huruf6 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop6()
//    {
//        super.onStop();
//        stophuruf6();
//    }
//    //---------
//
//    //tajwid 7
//    public void huruf7(View view)
//    {
//        if(huruf7 == null)
//        {
//            huruf7 = MediaPlayer.create(this, R.raw.tajwid7);
//            huruf7.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf7();
//                }
//            });
//        }
//        huruf7.start();
//    }
//
//    public void pause7(View view)
//    {
//        if(huruf7 != null)
//        {
//            huruf7.pause();
//        }
//    }
//
//    public void stop7(View view)
//    {
//        stophuruf7();
//    }
//
//    private void stophuruf7()
//    {
//        if(huruf7 != null)
//        {
//            huruf7.release();
//            huruf7 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop7()
//    {
//        super.onStop();
//        stophuruf7();
//    }
//    //---------
//
//    //tajwid 8
//    public void huruf8(View view)
//    {
//        if(huruf8 == null)
//        {
//            huruf8 = MediaPlayer.create(this, R.raw.tajwid8);
//            huruf8.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf8();
//                }
//            });
//        }
//        huruf8.start();
//    }
//
//    public void pause8(View view)
//    {
//        if(huruf8 != null)
//        {
//            huruf8.pause();
//        }
//    }
//
//    public void stop8(View view)
//    {
//        stophuruf8();
//    }
//
//    private void stophuruf8()
//    {
//        if(huruf8 != null)
//        {
//            huruf8.release();
//            huruf8 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop8()
//    {
//        super.onStop();
//        stophuruf8();
//    }
//    //---------
//
//    //tajwid 9
//    public void huruf9(View view)
//    {
//        if(huruf9 == null)
//        {
//            huruf9 = MediaPlayer.create(this, R.raw.tajwid9);
//            huruf9.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf9();
//                }
//            });
//        }
//        huruf9.start();
//    }
//
//    public void pause9(View view)
//    {
//        if(huruf9 != null)
//        {
//            huruf9.pause();
//        }
//    }
//
//    public void stop9(View view)
//    {
//        stophuruf9();
//    }
//
//    private void stophuruf9()
//    {
//        if(huruf9 != null)
//        {
//            huruf9.release();
//            huruf9 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop9()
//    {
//        super.onStop();
//        stophuruf9();
//    }
//    //---------
//
//    //tajwid 10
//    public void huruf10(View view)
//    {
//        if(huruf10 == null)
//        {
//            huruf10 = MediaPlayer.create(this, R.raw.tajwid10);
//            huruf10.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf10();
//                }
//            });
//        }
//        huruf10.start();
//    }
//
//    public void pause10(View view)
//    {
//        if(huruf10 != null)
//        {
//            huruf10.pause();
//        }
//    }
//
//    public void stop10(View view)
//    {
//        stophuruf10();
//    }
//
//    private void stophuruf10()
//    {
//        if(huruf10 != null)
//        {
//            huruf10.release();
//            huruf10 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop10()
//    {
//        super.onStop();
//        stophuruf10();
//    }
//    //---------
//
//    //tajwid 11
//    public void huruf11(View view)
//    {
//        if(huruf11 == null)
//        {
//            huruf11 = MediaPlayer.create(this, R.raw.tajwid11);
//            huruf11.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf11();
//                }
//            });
//        }
//        huruf11.start();
//    }
//
//    public void pause11(View view)
//    {
//        if(huruf11 != null)
//        {
//            huruf11.pause();
//        }
//    }
//
//    public void stop11(View view)
//    {
//        stophuruf11();
//    }
//
//    private void stophuruf11()
//    {
//        if(huruf11 != null)
//        {
//            huruf11.release();
//            huruf11 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop11()
//    {
//        super.onStop();
//        stophuruf11();
//    }
//    //---------
//
//    //tajwid 12
//    public void huruf12(View view)
//    {
//        if(huruf12 == null)
//        {
//            huruf12 = MediaPlayer.create(this, R.raw.tajwid12);
//            huruf12.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf12();
//                }
//            });
//        }
//        huruf12.start();
//    }
//
//    public void pause12(View view)
//    {
//        if(huruf12 != null)
//        {
//            huruf12.pause();
//        }
//    }
//
//    public void stop12(View view)
//    {
//        stophuruf12();
//    }
//
//    private void stophuruf12()
//    {
//        if(huruf12 != null)
//        {
//            huruf12.release();
//            huruf12 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop12()
//    {
//        super.onStop();
//        stophuruf12();
//    }
//    //---------
//
//    //tajwid 13
//    public void huruf13(View view)
//    {
//        if(huruf13 == null)
//        {
//            huruf13 = MediaPlayer.create(this, R.raw.tajwid13);
//            huruf13.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf13();
//                }
//            });
//        }
//        huruf13.start();
//    }
//
//    public void pause13(View view)
//    {
//        if(huruf13 != null)
//        {
//            huruf13.pause();
//        }
//    }
//
//    public void stop13(View view)
//    {
//        stophuruf13();
//    }
//
//    private void stophuruf13()
//    {
//        if(huruf13 != null)
//        {
//            huruf13.release();
//            huruf13 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop13()
//    {
//        super.onStop();
//        stophuruf13();
//    }
//    //---------
//
//    //tajwid 14
//    public void huruf14(View view)
//    {
//        if(huruf14 == null)
//        {
//            huruf14 = MediaPlayer.create(this, R.raw.tajwid14);
//            huruf14.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf14();
//                }
//            });
//        }
//        huruf14.start();
//    }
//
//    public void pause14(View view)
//    {
//        if(huruf14 != null)
//        {
//            huruf14.pause();
//        }
//    }
//
//    public void stop14(View view)
//    {
//        stophuruf14();
//    }
//
//    private void stophuruf14()
//    {
//        if(huruf14 != null)
//        {
//            huruf14.release();
//            huruf14 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop14()
//    {
//        super.onStop();
//        stophuruf14();
//    }
//    //---------
//
//    //tajwid 15
//    public void huruf15(View view)
//    {
//        if(huruf15 == null)
//        {
//            huruf15 = MediaPlayer.create(this, R.raw.tajwid15);
//            huruf15.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf15();
//                }
//            });
//        }
//        huruf15.start();
//    }
//
//    public void pause15(View view)
//    {
//        if(huruf15 != null)
//        {
//            huruf15.pause();
//        }
//    }
//
//    public void stop15(View view)
//    {
//        stophuruf15();
//    }
//
//    private void stophuruf15()
//    {
//        if(huruf15 != null)
//        {
//            huruf15.release();
//            huruf15 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop15()
//    {
//        super.onStop();
//        stophuruf15();
//    }
//    //---------
//
//    //tajwid 16
//    public void huruf16(View view)
//    {
//        if(huruf16 == null)
//        {
//            huruf16 = MediaPlayer.create(this, R.raw.tajwid16);
//            huruf16.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf16();
//                }
//            });
//        }
//        huruf16.start();
//    }
//
//    public void pause16(View view)
//    {
//        if(huruf16 != null)
//        {
//            huruf16.pause();
//        }
//    }
//
//    public void stop16(View view)
//    {
//        stophuruf16();
//    }
//
//    private void stophuruf16()
//    {
//        if(huruf16 != null)
//        {
//            huruf16.release();
//            huruf16 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop16()
//    {
//        super.onStop();
//        stophuruf16();
//    }
//    //---------
//
//    //tajwid 17
//    public void huruf17(View view)
//    {
//        if(huruf17 == null)
//        {
//            huruf17 = MediaPlayer.create(this, R.raw.tajwid17);
//            huruf17.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf17();
//                }
//            });
//        }
//        huruf17.start();
//    }
//
//    public void pause17(View view)
//    {
//        if(huruf17 != null)
//        {
//            huruf17.pause();
//        }
//    }
//
//    public void stop17(View view)
//    {
//        stophuruf17();
//    }
//
//    private void stophuruf17()
//    {
//        if(huruf17 != null)
//        {
//            huruf17.release();
//            huruf17 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop17()
//    {
//        super.onStop();
//        stophuruf17();
//    }
//    //---------
//
//    //tajwid 18
//    public void huruf18(View view)
//    {
//        if(huruf18 == null)
//        {
//            huruf18 = MediaPlayer.create(this, R.raw.tajwid18);
//            huruf18.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf18();
//                }
//            });
//        }
//        huruf18.start();
//    }
//
//    public void pause18(View view)
//    {
//        if(huruf18 != null)
//        {
//            huruf18.pause();
//        }
//    }
//
//    public void stop18(View view)
//    {
//        stophuruf18();
//    }
//
//    private void stophuruf18()
//    {
//        if(huruf18 != null)
//        {
//            huruf18.release();
//            huruf18 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop18()
//    {
//        super.onStop();
//        stophuruf18();
//    }
//    //---------
//
//    //tajwid 19
//    public void huruf19(View view)
//    {
//        if(huruf19 == null)
//        {
//            huruf19 = MediaPlayer.create(this, R.raw.tajwid19);
//            huruf19.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf19();
//                }
//            });
//        }
//        huruf19.start();
//    }
//
//    public void pause19(View view)
//    {
//        if(huruf19 != null)
//        {
//            huruf19.pause();
//        }
//    }
//
//    public void stop19(View view)
//    {
//        stophuruf19();
//    }
//
//    private void stophuruf19()
//    {
//        if(huruf19 != null)
//        {
//            huruf19.release();
//            huruf19 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop19()
//    {
//        super.onStop();
//        stophuruf19();
//    }
//    //---------
//
//    //tajwid 20
//    public void huruf20(View view)
//    {
//        if(huruf20 == null)
//        {
//            huruf20 = MediaPlayer.create(this, R.raw.tajwid20);
//            huruf20.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf20();
//                }
//            });
//        }
//        huruf20.start();
//    }
//
//    public void pause20(View view)
//    {
//        if(huruf20 != null)
//        {
//            huruf20.pause();
//        }
//    }
//
//    public void stop20(View view)
//    {
//        stophuruf20();
//    }
//
//    private void stophuruf20()
//    {
//        if(huruf20 != null)
//        {
//            huruf20.release();
//            huruf20 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop20()
//    {
//        super.onStop();
//        stophuruf20();
//    }
//    //---------
//
//    //tajwid 21
//    public void huruf21(View view)
//    {
//        if(huruf21 == null)
//        {
//            huruf21 = MediaPlayer.create(this, R.raw.tajwid21);
//            huruf21.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf21();
//                }
//            });
//        }
//        huruf21.start();
//    }
//
//    public void pause21(View view)
//    {
//        if(huruf21 != null)
//        {
//            huruf21.pause();
//        }
//    }
//
//    public void stop21(View view)
//    {
//        stophuruf21();
//    }
//
//    private void stophuruf21()
//    {
//        if(huruf21 != null)
//        {
//            huruf21.release();
//            huruf21 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop21()
//    {
//        super.onStop();
//        stophuruf21();
//    }
//    //---------
//
//    //tajwid 22
//    public void huruf22(View view)
//    {
//        if(huruf22 == null)
//        {
//            huruf22 = MediaPlayer.create(this, R.raw.tajwid22);
//            huruf22.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf22();
//                }
//            });
//        }
//        huruf22.start();
//    }
//
//    public void pause22(View view)
//    {
//        if(huruf22 != null)
//        {
//            huruf22.pause();
//        }
//    }
//
//    public void stop22(View view)
//    {
//        stophuruf22();
//    }
//
//    private void stophuruf22()
//    {
//        if(huruf22 != null)
//        {
//            huruf22.release();
//            huruf22 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop22()
//    {
//        super.onStop();
//        stophuruf22();
//    }
//    //---------
//
//    //tajwid 23
//    public void huruf23(View view)
//    {
//        if(huruf23 == null)
//        {
//            huruf23 = MediaPlayer.create(this, R.raw.tajwid23);
//            huruf23.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf23();
//                }
//            });
//        }
//        huruf23.start();
//    }
//
//    public void pause23(View view)
//    {
//        if(huruf23 != null)
//        {
//            huruf23.pause();
//        }
//    }
//
//    public void stop23(View view)
//    {
//        stophuruf23();
//    }
//
//    private void stophuruf23()
//    {
//        if(huruf23 != null)
//        {
//            huruf23.release();
//            huruf23 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop23()
//    {
//        super.onStop();
//        stophuruf23();
//    }
//    //---------
//
//    //tajwid 24
//    public void huruf24(View view)
//    {
//        if(huruf24 == null)
//        {
//            huruf24 = MediaPlayer.create(this, R.raw.tajwid24);
//            huruf24.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf24();
//                }
//            });
//        }
//        huruf24.start();
//    }
//
//    public void pause24(View view)
//    {
//        if(huruf24 != null)
//        {
//            huruf24.pause();
//        }
//    }
//
//    public void stop24(View huruf)
//    {
//        stophuruf24();
//    }
//
//    private void stophuruf24()
//    {
//        if(huruf24 != null)
//        {
//            huruf24.release();
//            huruf24 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop24()
//    {
//        super.onStop();
//        stophuruf24();
//    }
//    //---------
//
//    //tajwid 25
//    public void huruf25(View view)
//    {
//        if(huruf25 == null)
//        {
//            huruf25 = MediaPlayer.create(this, R.raw.tajwid25);
//            huruf25.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf25();
//                }
//            });
//        }
//        huruf25.start();
//    }
//
//    public void pause25(View view)
//    {
//        if(huruf25 != null)
//        {
//            huruf25.pause();
//        }
//    }
//
//    public void stop25(View view)
//    {
//        stophuruf25();
//    }
//
//    private void stophuruf25()
//    {
//        if(huruf25 != null)
//        {
//            huruf25.release();
//            huruf25 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop25()
//    {
//        super.onStop();
//        stophuruf25();
//    }
//    //---------
//
//    //tajwid 26
//    public void huruf26(View view)
//    {
//        if(huruf26 == null)
//        {
//            huruf26 = MediaPlayer.create(this, R.raw.tajwid26);
//            huruf26.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf26();
//                }
//            });
//        }
//        huruf26.start();
//    }
//
//    public void pause26(View view)
//    {
//        if(huruf26 != null)
//        {
//            huruf26.pause();
//        }
//    }
//
//    public void stop26(View view)
//    {
//        stophuruf26();
//    }
//
//    private void stophuruf26()
//    {
//        if(huruf26 != null)
//        {
//            huruf26.release();
//            huruf26 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop26()
//    {
//        super.onStop();
//        stophuruf26();
//    }
//    //---------
//
//    //tajwid 27
//    public void huruf27(View view)
//    {
//        if(huruf27 == null)
//        {
//            huruf27 = MediaPlayer.create(this, R.raw.tajwid27);
//            huruf27.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf27();
//                }
//            });
//        }
//        huruf27.start();
//    }
//
//    public void pause27(View view)
//    {
//        if(huruf27 != null)
//        {
//            huruf27.pause();
//        }
//    }
//
//    public void stop27(View view)
//    {
//        stophuruf27();
//    }
//
//    private void stophuruf27()
//    {
//        if(huruf27 != null)
//        {
//            huruf27.release();
//            huruf27 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop27()
//    {
//        super.onStop();
//        stophuruf27();
//    }
//    //---------
//
//    //tajwid 28
//    public void huruf28(View view)
//    {
//        if(huruf28 == null)
//        {
//            huruf28 = MediaPlayer.create(this, R.raw.tajwid28);
//            huruf28.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
//            {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer)
//                {
//                    stophuruf28();
//                }
//            });
//        }
//        huruf28.start();
//    }
//
//    public void pause28(View view)
//    {
//        if(huruf28 != null)
//        {
//            huruf28.pause();
//        }
//    }
//
//    public void stop28(View view)
//    {
//        stophuruf28();
//    }
//
//    private void stophuruf28()
//    {
//        if(huruf28 != null)
//        {
//            huruf28.release();
//            huruf28 = null;
//            Toast.makeText(this, "MediaPlayer Released", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    protected void onStop28()
//    {
//        super.onStop();
//        stophuruf28();
//    }
//
//
//    //---------
//}
