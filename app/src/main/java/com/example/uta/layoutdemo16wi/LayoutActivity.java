package com.example.uta.layoutdemo16wi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * CSE 5324 Spring 2016
 * Android Training Lecture 2 Code Sample
 * (Modified from Stanford CS 193A Winter 2016)
 */
public class LayoutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
    }

    /*
    * This method is called when the user chooses one of the turtle radio buttons.
    * In this code we set which turtle image is visible on the screen in the ImageView.
    */
    public void pickTurtle(View view) {
        ImageView img = (ImageView) findViewById(R.id.turtle);
        switch (view.getId()) {
            case R.id.leo:
                img.setImageResource(R.drawable.tmntleo);
                break;
            case R.id.mike:
                img.setImageResource(R.drawable.tmntmike);
                break;
            case R.id.don:
                img.setImageResource(R.drawable.tmntdon);
                break;
            case R.id.raph:
                img.setImageResource(R.drawable.tmntraph);
                break;
        }

    }


}