package com.example.chenzhiran.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by chenzhiran on 2018/3/23.
 */

public class SplashActivity extends AppCompatActivity {

    private Button mEnterButton;

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.enter_button:
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);

                    break;
            }

        }
    };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mEnterButton = (Button)findViewById(R.id.enter_button);
        mEnterButton.setOnClickListener(mOnClickListener);

        }
    };
