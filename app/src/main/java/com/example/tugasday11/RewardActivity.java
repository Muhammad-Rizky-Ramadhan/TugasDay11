package com.example.tugasday11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RewardActivity extends AppCompatActivity {
    private ImageView ivBeranda, ivBeli, ivReward, ivMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward);

        ivBeranda = findViewById(R.id.beranda3);
        ivBeli = findViewById(R.id.beliPaket3);
        ivReward = findViewById(R.id.reward3);
        ivMenu = findViewById(R.id.imgMenu3);


        ivBeranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RewardActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ivBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RewardActivity.this, BeliActivity.class);
                startActivity(intent);
            }
        });

        ivReward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RewardActivity.this, RewardActivity.class);
                startActivity(intent);
            }
        });

        ivMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RewardActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}