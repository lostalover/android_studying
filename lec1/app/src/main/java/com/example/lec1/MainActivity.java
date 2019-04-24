package com.example.lec1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int num1;
    private int num2;
    private int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize
        // push test for git branch
        // jjh test git push

        init();
        points = 0;
    }

    public void init(){
        Random randy = new Random();
        Button left_button = (Button) findViewById(R.id.left_button);
        Button right_button = (Button) findViewById(R.id.right_button);
        TextView point_display = (TextView) findViewById(R.id.point_display);

        num1 = randy.nextInt(100);
        num2 = randy.nextInt(100);
        while(true){
            if(num2 != num1){
                break;
            }
            num2 = randy.nextInt(100);
        }
        left_button.setText(String.valueOf(num1));
        right_button.setText(String.valueOf(num2));
        point_display.setText("point : " + points);
    }

    public void click_left(View view) {
        if(num1 > num2){
            points++;
        }
        else{
            points--;
        }
        init();
    }

    public void click_right(View view) {
        if(num2 > num1){
            points++;
        }
        else{
            points--;
        }
        init();
    }
}
