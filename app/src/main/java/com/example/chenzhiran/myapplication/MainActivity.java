package com.example.chenzhiran.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //当被点击时，显示简短提示
                //Toast.makeText(MainActivity.this,"啊！我被打了一下！",Toast.LENGTH_LONG).show();
                //跳转到启动页面
                Intent intent = new Intent(MainActivity.this,SplashActivity.class);
                startActivity(intent);
            }
        });
    }
}
