package com.github.ali.fibanocii_android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView screen, low_screen, matchFound;
    Fibanocii mFibanocii;
    Button one, two, three, four, five, six, seven, eight, nine, zero, add;
    int screenRes = 0;
    int numberList[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.btn_one);
        two = findViewById(R.id.btn_two);
        three = findViewById(R.id.btn_three);
        four = findViewById(R.id.btn_four);
        five = findViewById(R.id.btn_five);
        six = findViewById(R.id.btn_six);
        seven = findViewById(R.id.btn_seven);
        eight = findViewById(R.id.btn_eight);
        nine = findViewById(R.id.btn_nine);
        zero = findViewById(R.id.btn_zero);
        screen = findViewById(R.id.main_screen);
        add = findViewById(R.id.btn_add);

       // low_screen = findViewById(R.id.low_screen);
        low_screen = findViewById(R.id.low_screen);

        mFibanocii = new Fibanocii(screen);
//        mFibanocii.fibanociiGenerators();

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int One = 1;
                AddDigit(One);

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Two = 2;
                AddDigit(Two);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Three = 3;
                AddDigit(Three);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Four = 4;
                AddDigit(Four);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Five = 5;
                AddDigit(Five);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Six = 6;
                AddDigit(6);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Seven = 7;
                AddDigit(Seven);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Eight = 8;
                AddDigit(Eight);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Nine = 9;
                AddDigit(Nine);

            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Zero = 0;
                AddDigit(Zero);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String addSign = "+";
                AddSign(addSign);
            }
        });


    }


    public void AddDigit(int num) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(num);
        result += num;
        low_screen.setText(String.valueOf(result));
//long sequenceNumbers = mFibanocii.fibanociiGenerators();

//        long userInput = StringToLong(result);
//        Log.d("test", "" + userInput);
        mFibanocii.fibanociiGenerators(num);


    }


    public void AddSign(String sign) {
        result += sign;
        low_screen.setText(result);
    }


    public Long StringToLong(String result) {

        result = result.replaceAll("\\D+", "");
        // eliminate + from the numbers text
        long digitExtractor = Long.parseLong(result);

        return digitExtractor;
    }

//    public void TokenColorize(int num) {
//        String numToString = String.valueOf(num);
//        Spannable WordtoSpan = new SpannableString(numToString);
//        WordtoSpan.setSpan(new ForegroundColorSpan(Color.RED), 0, numToString.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        screen.setText(WordtoSpan);
//    }

}


