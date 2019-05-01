package com.github.ali.fibanocii_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreBoard extends AppCompatActivity {

    TextView score_text_view ;
    Button btnPlayAgain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board);

        score_text_view = findViewById(R.id.scoreTextView);
        btnPlayAgain = findViewById(R.id.buttonPlayAgain);
        String score = getIntent().getStringExtra("score");

        score_text_view.setText(String.valueOf(score));


        btnPlayAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mplayAgain = new Intent(ScoreBoard.this,MainActivity.class);
                startActivity(mplayAgain);

            }
        });
    }
}
