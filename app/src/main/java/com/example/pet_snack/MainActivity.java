package com.example.pet_snack;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnFood, btnSnack, btnWalk, btnHealth;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnSnack = findViewById(R.id.imgBtn2);
        btnSnack.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgBtn2:
                intent = new Intent(this, snack_register.class);
                startActivity(intent);
                break;
            default: break;
        }

    }
}