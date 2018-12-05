package com.glintec.app.audio;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnRock, btnBaboon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBaboon = findViewById(R.id.btn_BABBON);
        btnRock = findViewById(R.id.btn_ROCK);

//       View.OnClickListener clRock =new View.OnClickListener() {
//           @Override
//           public void onClick(View v) {
//               RecRock();
//           }
//       };

    }

    public void RecBabbon(View v){
        MediaPlayer mp =MediaPlayer.create(this,R.raw.baboon);
        mp.start();
    }

    public void RecRock(View v){
        MediaPlayer.create(this,R.raw.rock).start();
    }
}
