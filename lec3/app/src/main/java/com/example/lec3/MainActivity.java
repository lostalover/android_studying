package com.example.lec3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rabbitClick(View view) {
        // figure out which turtle the user clicked on,
        ImageView img = (ImageView) findViewById(R.id.image);
        if(view.getId() == R.id.r1){
            img.setImageResource(R.drawable.rabbit1);

        }
        else if(view.getId() == R.id.r2){
            img.setImageResource(R.drawable.rabbit2);

        }
        else if(view.getId() == R.id.r3){
            img.setImageResource(R.drawable.rabbit3);

        }
        else if(view.getId() == R.id.r4){
            img.setImageResource(R.drawable.rabbit4);

        }

        // set that image to show on screen
    }

    public void okClick(View view) {
        EditText edit = (EditText) findViewById(R.id.input_box);
        String text = edit.getText().toString();
        Toast.makeText(this, "You typed : " + text, Toast.LENGTH_SHORT).show();
        Log.d("harry", "The user types \""+text+"\"");
    }
}
