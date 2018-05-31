package com.example.omer3.tmonot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    ImageButton btn;
    int y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv= (ImageView) findViewById(R.id.omer);
        btn= (ImageButton) findViewById(R.id.button);
    }
    public void om1(View view){
        Random rnd=new Random();
        y=rnd.nextInt(3)+1;
        if (y==1){
            btn.setImageResource(R.drawable.image1);
            iv.setImageResource(R.drawable.image1);}
        else if (y==2){
            btn.setImageResource(R.drawable.image2);
            iv.setImageResource(R.drawable.image2);
        }
        else{
            btn.setImageResource(R.drawable.image3);
            iv.setImageResource(R.drawable.image3);
        }

    }

}
