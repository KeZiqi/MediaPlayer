package com.example.phillip.mediaplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //添加textView
        TextView textView = (TextView)findViewById(R.id.text);

        //添加点击事件
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this,"Hello!",Toast.LENGTH_SHORT);
//            }
//        });

        //添加按钮
        Button musicPlayerButton = (Button)findViewById(R.id.musicListButton);
        Button videoPlayerButton = (Button)findViewById(R.id.videoListButton);
        musicPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MusicPlayer.class);
                startActivity(intent);
            }
        });
        videoPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(intent);
            }
        });
    }
}
