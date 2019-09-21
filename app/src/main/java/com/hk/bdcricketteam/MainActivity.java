package com.hk.bdcricketteam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button mashrafe,tamim,mushfiq,sakib,mahmudullah,sumya,liton,mehedy,mithun,musaddiq,sabbir,mustafiz,rubel,rahi,saif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button activity
        operate();
    }

    public void operate(){
    mashrafe=findViewById(R.id.mashBTN);
    tamim=findViewById(R.id.tamimBTN);
    mushfiq=findViewById(R.id.mushfiqBTN);
    sakib=findViewById(R.id.sakibBTN);
    mahmudullah=findViewById(R.id.mahmudullahBTN);
    sumya=findViewById(R.id.sumyaBTN);
        liton=findViewById(R.id.litonBTN);
        mehedy=findViewById(R.id.mehedyBTN);
        mithun=findViewById(R.id.mithunBTN);
        musaddiq=findViewById(R.id.musaddiqBTN);
        sabbir=findViewById(R.id.sabbirBTN);
        mustafiz=findViewById(R.id.mustafizBTN);
        rubel=findViewById(R.id.rubelBTN);
        rahi=findViewById(R.id.rahiBTN);
        saif=findViewById(R.id.saifBTN);



        //button territory

        mashrafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("playerID","mashrafe");
                intent.putExtra("name","MASHRAFE MORTOZA(C)");
                intent.putExtra("age","35 years 193 days");
                intent.putExtra("playing_role","Bowler");
                intent.putExtra("batting_style","Right-hand bat");
                intent.putExtra("bowling_style","Right-arm-fast-medium");
                startActivity(intent);
            }
        });

        tamim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("playerID","tamim");
                intent.putExtra("name","TAMIM IQBAL");
                intent.putExtra("age","30 years 27 days");
                intent.putExtra("playing_role","Opening batsman");
                intent.putExtra("batting_style","Left-hand bat");
                intent.putExtra("bowling_style","N/A");
                startActivity(intent);
            }
        });

        mushfiq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("playerID","mushfiq");
                intent.putExtra("name","MUSHFIQUR RAHIM(WC)");
                intent.putExtra("age","31 years 311 days");
                intent.putExtra("playing_role","Wicketkeeper batsman");
                intent.putExtra("batting_style","Right-hand bat");
                intent.putExtra("bowling_style","N/A");
                startActivity(intent);
            }
        });

        sakib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("playerID","sakib");
                intent.putExtra("name","SAKIB AL HASAN");
                intent.putExtra("age","32 years 23 days");
                intent.putExtra("playing_role","Allrounder");
                intent.putExtra("batting_style","Left-hand bat");
                intent.putExtra("bowling_style","Slow left-arm orthodox");
                startActivity(intent);
            }
        });

        mahmudullah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("playerID","mahmudullah");
                intent.putExtra("name","MAHMUDULLAH");
                intent.putExtra("age","33 years 71 days");
                intent.putExtra("playing_role","Allrounder");
                intent.putExtra("batting_style","Right-hand bat");
                intent.putExtra("bowling_style","Right-arm offbreak");
                startActivity(intent);

            }
        });

        sumya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("playerID","sumya");
                intent.putExtra("name","SOUMYA SARKAR");
                intent.putExtra("age","26 years 50 days");
                intent.putExtra("playing_role","Opening batsman");
                intent.putExtra("batting_style","Left-hand bat");
                intent.putExtra("bowling_style","Right-arm medium-fast");
                startActivity(intent);

            }
        });

        liton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("playerID","liton");
                intent.putExtra("name","LITON DAS");
                intent.putExtra("age","24 years 185 days");
                intent.putExtra("playing_role","Wicketkeeper batsman");
                intent.putExtra("batting_style","Right-hand bat");
                intent.putExtra("bowling_style","N/A");
                startActivity(intent);

            }
        });

        mehedy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("playerID","mehedy");
                intent.putExtra("name","MEHIDY HASAN");
                intent.putExtra("age","21 years 173 days");
                intent.putExtra("playing_role","Allrounder");
                intent.putExtra("batting_style","Right-hand bat");
                intent.putExtra("bowling_style","Right-arm offbreak");
                startActivity(intent);

            }
        });

        mithun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("playerID","mithun");
                intent.putExtra("name","MOHAMMAD MITHUN");
                intent.putExtra("age","28 years 45 days");
                intent.putExtra("playing_role","Top-order batsman");
                intent.putExtra("batting_style","Right-hand bat");
                intent.putExtra("bowling_style","N/A");
                startActivity(intent);
            }
        });

        musaddiq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("playerID","musaddiq");
                intent.putExtra("name","MOSADDEK HOSSAIN");
                intent.putExtra("age","23 years 127 days");
                intent.putExtra("playing_role","Middle-order-batsman");
                intent.putExtra("batting_style","Right-hand bat");
                intent.putExtra("bowling_style","Right-arm offbreak");
                startActivity(intent);

            }
        });

        sabbir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("playerID","sabbir");
                intent.putExtra("name","SABBIR RAHMAN");
                intent.putExtra("age","27 years 145 days");
                intent.putExtra("playing_role","Middle-order-batsman");
                intent.putExtra("batting_style","Right-hand bat");
                intent.putExtra("bowling_style","Legbreak");
                startActivity(intent);

            }
        });

        mustafiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("playerID","mustafiz");
                intent.putExtra("name","MUSTAFIZUR RAHMAN");
                intent.putExtra("age","23 years 222 days");
                intent.putExtra("playing_role","Bowler");
                intent.putExtra("batting_style","Left-hand bat");
                intent.putExtra("bowling_style","Left-arm medium-fast");
                startActivity(intent);

            }
        });

        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("playerID","rubel");
                intent.putExtra("name","RUBEL HOSSAIN");
                intent.putExtra("age","29 years 105 days");
                intent.putExtra("playing_role","Bowler");
                intent.putExtra("batting_style","Right-hand bat");
                intent.putExtra("bowling_style","Right-arm fast");
                startActivity(intent);

            }
        });

        rahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("playerID","rahi");
                intent.putExtra("name","ABU JAYED");
                intent.putExtra("age","25 years 257 days");
                intent.putExtra("playing_role","Bowler");
                intent.putExtra("batting_style","Right-hand bat");
                intent.putExtra("bowling_style","Right-arm fast-medium");
                startActivity(intent);

            }
        });

        saif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("playerID","saif");
                intent.putExtra("name","MOHAMMAD SAIFUDDIN");
                intent.putExtra("age","22 years 166 days");
                intent.putExtra("playing_role","Bowling Allrounder");
                intent.putExtra("batting_style","Left-hand bat");
                intent.putExtra("bowling_style","Right-arm medium-fast");
                startActivity(intent);

            }
        });





    }
}
