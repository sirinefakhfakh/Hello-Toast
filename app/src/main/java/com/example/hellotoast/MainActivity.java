package com.example.hellotoast;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView showCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showCount = findViewById(R.id.show_count);
        Button buttonToast = findViewById(R.id.button_toast);
        Button buttonCount = findViewById(R.id.button_count);

        // Bouton Toast
        buttonToast.setOnClickListener(view -> Toast.makeText(MainActivity.this,
                getString(R.string.toast_message),
                Toast.LENGTH_SHORT).show());

        // Bouton Count
        buttonCount.setOnClickListener(view -> {
            count++;
            showCount.setText(String.valueOf(count));
        });
    }
}
