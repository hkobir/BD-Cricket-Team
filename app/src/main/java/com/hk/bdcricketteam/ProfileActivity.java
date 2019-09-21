package com.hk.bdcricketteam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {
private TextView playerName,playerAge,playingRole,battingStyle,bowlingStyle;
private ImageView profileImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //set profile..
        profileImage=findViewById(R.id.profilePIc);

        playerName=findViewById(R.id.name);
        playerAge=findViewById(R.id.age);
        playingRole=findViewById(R.id.playingROLE);
        battingStyle=findViewById(R.id.battingStyleTB);
        bowlingStyle=findViewById(R.id.bowlingStyleTB);


        String pName=getIntent().getStringExtra("name");
        String pAge=getIntent().getStringExtra("age");
        String playRole=getIntent().getStringExtra("playing_role");
        String batStyle=getIntent().getStringExtra("batting_style");
        String bowlStyle=getIntent().getStringExtra("bowling_style");
        String playerId=getIntent().getStringExtra("playerID");

        //set profile Picture
        switch(playerId){
            case "mashrafe":
                profileImage.setImageResource(R.drawable.mashrafe);
                break;
            case "tamim":
                profileImage.setImageResource(R.drawable.tamim);
                break;
            case "mushfiq":
                profileImage.setImageResource(R.drawable.mushfiq);
                break;
            case "sakib":
                profileImage.setImageResource(R.drawable.sakib);
                break;
            case "mahmudullah":
                profileImage.setImageResource(R.drawable.mahmudullah);
                break;
            case "sumya":
                profileImage.setImageResource(R.drawable.somya);
                break;
            case "liton":
                profileImage.setImageResource(R.drawable.liton);
                break;
            case "mehedy":
                profileImage.setImageResource(R.drawable.mehedy);
                break;
            case "mithun":
                profileImage.setImageResource(R.drawable.mithun);
                break;
            case "musaddiq":
                profileImage.setImageResource(R.drawable.musaddik);
                break;
            case "sabbir":
                profileImage.setImageResource(R.drawable.sabbir);
                break;
            case "mustafiz":
                profileImage.setImageResource(R.drawable.mustafiz);
                break;
            case "rubel":
                profileImage.setImageResource(R.drawable.rubel);
                break;
            case "rahi":
                profileImage.setImageResource(R.drawable.rahi);
                break;
            case "saif":
                profileImage.setImageResource(R.drawable.saif);
                break;
            default:
                profileImage.setImageResource(R.drawable.mashrafe);
        }

        playerName.setText(pName);
        playerAge.setText(pAge);
        playingRole.setText(playRole);
        battingStyle.setText(batStyle);
        bowlingStyle.setText(bowlStyle);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);

    }
}
