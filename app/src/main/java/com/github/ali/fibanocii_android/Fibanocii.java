package com.github.ali.fibanocii_android;

import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class Fibanocii {

    TextView screen;

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

    public void fibanociiGenerators(int userInput) {                          // take int number
        MainActivity mainActivity = new MainActivity();
        long n = 50, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        // convert to loong
        for (int i = 0; i <= n; ++i) {

            ArrayList<Long> arrayList = new ArrayList<>();
            arrayList.add(t1);
            long convertedUserInput = IntToLong(userInput);
            numberMatcher(arrayList, convertedUserInput);
//    mainActivity.numberMatcher(arrayList);

            //numberMatcher(t1);
            //return t1;
            System.out.print(t1 + " , ");
            Log.d("fib", "fib : " + t1 + " arrayList" + arrayList);
            long sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }

    public boolean numberMatcher(ArrayList<Long> arraylist, long number) {

        // MainActivity mainActivity = new MainActivity();
        // long number = 2;

        if (arraylist.contains(number)) {

            System.out.println("Matched");
            // mainActivity.matchFound.setText("Matched");
        TokenColorize((int) number);

            Log.d("test4", "matched");
            return true;

        } else
            System.out.println("Not matched");
        Log.d("test4", "Not matched");
        return false;
        // mainActivity.matchFound.setText("Not Matched");


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

}






