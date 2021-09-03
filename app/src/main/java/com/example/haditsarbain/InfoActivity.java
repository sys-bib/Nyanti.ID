package com.example.haditsarbain;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.text.util.Linkify;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {
    Spinner spinnerku;
    TextView textku;
    TextView textd;
    TextView texta;
    TextView textn;
    ImageView imageku;
    private TextView tvLinkify;

    String[] namaspinner =    {"Pilh Pesantren",
            "Pondok Pesantren Daar El- Qolam ",
            "Pondok Pesantren Darul Quran ",
            "Pondok Pesantren Darunnajah",
            "Pondok Pesantren Gontor",
            "Pondok Pesantren Tebuireng"
    };
    String [] namakyai =   {   " ",
            "Drs. K.H. Ahmad Rifa’i Arief.",
            "Ust. Yusuf Mansur",
            "KH. Abdul Manaf Mukhayyar dan dua rekannya KH. Qomaruzzaman dan KH. Mahrus Amin",
            "Dr. K.H. Abdullah Syukri Zarkasyi; K.H. Hasan Abdullah Sahal; K.H. Syamsul Hadi Abdan",
            "KH. Hasyim Asy'arie"
    };

    String [] alamat =   {   " ",
            "Jl. Raya Serang, Pasir Gintung, Jayanti, Tangerang, Banten 15610",
            "Jl. Thamrin Ketapang, Kp. Ketapang Kecamatan Cipondoh, Kota Tangerang, Provinsi Banten",
            "Jl. Ulujami Raya No.86, Ulujami, Kec. Pesanggrahan, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12250",
            "Desa, Gontor 1, Gontor, Mlarak, Kabupaten Ponorogo, Jawa Timur 63472",
            "Desa Cukir, Kecamatan Diwek, Jombang, Jawa Timur."
    };

    String [] link =   {   " ",
            "https://www.google.com/maps/place/Pondok+Pesantren+Modern+Daar+El-Qolam+1/@-6.1925898,106.3836824,15z/data=!4m2!3m1!1s0x0:0x2c3aa0bfd0fc335?sa=X&ved=2ahUKEwik9Ja-9bbmAhUBVysKHchQANwQ_BIwGnoECBoQCA",
            "https://www.google.com/maps/dir//pondok+pesantren+darul+quran+tangerang/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x2e69f9b2ffe59cc1:0x3f18679f939534aa?sa=X&ved=2ahUKEwik_uvC8rzmAhVGfisKHTLhApQQ9RcwAHoECAEQCA",
            "https://www.google.com/maps/dir/-6.1923328,106.6647552/pondok+pesantren+Darunnajah/@-6.2428979,106.6263274,12z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x2e69f0e44d90c181:0xfb082ad5573f478b!2m2!1d106.7616283!2d-6.246998",
            "https://www.google.com/maps/dir//pondok+pesantren+Gontor/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x2e790ac1e1671b99:0x3a0474ac71cbc7a9?sa=X&ved=2ahUKEwjK4ee287zmAhVSJHIKHftkD0kQ9RcwE3oECBIQDg",
            "https://www.google.com/maps/dir/-6.1923328,106.6647552/pondok+pesantren+tebuireng/@-6.8885109,107.2069624,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x2e786a7603f1d77b:0x71029570607e579e!2m2!1d112.238471!2d-7.60764"
    };

    String [] notelp =   {   " ",
            "021-5950 599",
            "021-2789 9696",
            "021-7350 187",
            "0352 311 766",
            "0321 863 136"
    };

    int[] gambarponpes = {R.drawable.ponpes,R.drawable.ponpes1,R.drawable.ponpes2,R.drawable.ponpes3,R.drawable.ponpes4,R.drawable.ponpes5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        spinnerku = findViewById(R.id.spninfo);
        textku =  findViewById(R.id.textku);
        textd  = findViewById(R.id.textd);
        texta  = findViewById(R.id.texta);
        textn  = findViewById(R.id.textn);
        imageku =  findViewById(R.id.gbr);
        tvLinkify = (TextView) findViewById(R.id.textm);

        ArrayAdapter adapterhewan = new ArrayAdapter(this,android.R.layout.simple_spinner_item, namaspinner);
        spinnerku.setAdapter(adapterhewan);
        spinnerku.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long I) {
                textd.setText(namakyai[i]);
                texta.setText(alamat[i]);
                tvLinkify.setText(link[i]);
                Linkify.addLinks(tvLinkify, Linkify.ALL);
                textn.setText(notelp[i]);
                imageku.setImageResource(gambarponpes[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}

