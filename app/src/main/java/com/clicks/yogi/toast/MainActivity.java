package com.clicks.yogi.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    btn = findViewById(R.id.btn);

    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Type 1
            Toast.makeText(MainActivity.this, "Type 1", Toast.LENGTH_SHORT).show();

/*
            // Type 2 (customized toast)
            Toast toast = Toast.makeText(MainActivity.this,"Type 2",Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER|Gravity.END,0,0);
            toast.show();
*/

        }
    });

    }
}