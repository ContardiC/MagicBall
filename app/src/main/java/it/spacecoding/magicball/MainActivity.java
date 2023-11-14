package it.spacecoding.magicball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private int mArrayBalls[] = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}