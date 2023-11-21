package it.spacecoding.magicball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int mArrayBalls[] = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5};
    private ImageView mImageViewBall;
    private Random mRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageViewBall = (ImageView) findViewById(R.id.imageViewBall);
        mRandom = new Random();
    }

    public void Ask(View view) {
        int rand = mRandom.nextInt(5);
        System.out.println("numero random: " + rand);
        mImageViewBall.setImageResource(mArrayBalls[rand]);
    }
}