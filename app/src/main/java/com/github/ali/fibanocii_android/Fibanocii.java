package com.github.ali.fibanocii_android;

import android.content.Intent;
import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class Fibanocii {
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    TextView screen;

    private int score = 0;

    public Fibanocii(TextView screen) {
        this.screen = screen;
    }

    //}
//    public String getFib(int n) {
//        StringBuilder sb = new StringBuilder(fibanociiGenerators(0));
//        for (int i = 1; i < n; ++i) {
//            sb.append(", ");
//            sb.append(fibanociiGenerators(i));
//        }
//        return sb.toString();
//    }


    //public void checker(String result,int num){

//    private static int fibanociiGenerators() {
//    }

    public void fibanociiGenerators(String userInput, int counter,long n) {                          // take int number
        //MainActivity mainActivity = new MainActivity();
        ArrayList<Long> arrayList = new ArrayList<>();
        long  t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        // convert to loong
        for (int i = 0; i <= n; ++i) {


            arrayList.add(t1);

//    mainActivity.numberMatcher(arrayList);

            //numberMatcher(t1);
            //return t1;
            System.out.print(t1 + " , ");
            Log.d("fib", "fib : " + t1 + " arrayList" + arrayList);
            long sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        long convertedUserInput = StringToLong(userInput);
        numberMatcher(arrayList, convertedUserInput, counter);
    }

    public void numberMatcher(ArrayList<Long> arraylist, long number, int counter) {

        // MainActivity mainActivity = new MainActivity();
        // long number = 2;

        if (counter < arraylist.size()) {

            if (arraylist.get(counter).equals(number)) {
                        score +=2;
                        setScore(score);
            } else {
                TokenColorize((int) number);
                score-=2;
                setScore(score);
            }
        } else
            System.out.println("Not Enough series");

    }


    public Long IntToLong(int num) {
        long convert;
        convert = (long) (num);
        return convert;

    }

    public void TokenColorize(int num) {
        String numToString = String.valueOf(num);
        Spannable WordtoSpan = new SpannableString(numToString);
        WordtoSpan.setSpan(new ForegroundColorSpan(Color.RED), 0, numToString.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        screen.setText(WordtoSpan);
    }

    public long StringToLong(String input){

        long convertedInput = Long.parseLong(input);
        return convertedInput;
    }

    public void Score(){



    }
}






