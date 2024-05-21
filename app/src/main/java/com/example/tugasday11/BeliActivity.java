package com.example.tugasday11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BeliActivity extends AppCompatActivity {

    private ImageView ivBeranda, ivBeli, ivReward, ivMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beli);

        ivBeranda = findViewById(R.id.beranda2);
        ivBeli = findViewById(R.id.beliPaket2);
        ivReward = findViewById(R.id.reward2);
        ivMenu = findViewById(R.id.imgMenu2);


        ivBeranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BeliActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ivBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BeliActivity.this, BeliActivity.class);
                startActivity(intent);
            }
        });

        ivReward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BeliActivity.this, RewardActivity.class);
                startActivity(intent);
            }
        });

        ivMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BeliActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}