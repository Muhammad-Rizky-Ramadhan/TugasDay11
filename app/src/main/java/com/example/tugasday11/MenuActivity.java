package com.example.tugasday11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {
    private ImageView ivBeranda, ivBeli, ivReward, ivMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ivBeranda = findViewById(R.id.beranda4);
        ivBeli = findViewById(R.id.beliPaket4);
        ivReward = findViewById(R.id.reward4);
        ivMenu = findViewById(R.id.imgMenu4);


        ivBeranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ivBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, BeliActivity.class);
                startActivity(intent);
            }
        });

        ivReward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, RewardActivity.class);
                startActivity(intent);
            }
        });

        ivMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}