package com.example.octavio.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //How to fade images

    public void fade(View view){
        ImageView pom = (ImageView) findViewById(R.id.pom);
        ImageView cup = (ImageView) findViewById(R.id.cup);
        Button start = (Button) findViewById(R.id.start);
        Button next = (Button) findViewById(R.id.next);

// Change alpha property of the images, so pom disappears (alpha = 0)
        // and cup appear (alpha = 1).  Each transformation (animation) lasts 2 seconds.
        pom.animate().alpha(0f).setDuration(2000);
        cup.animate().alpha(1f).setDuration(2000);

        // We hide and disable the first button so it won't trouble us further
        start.setEnabled(false);
        start.setVisibility(View.INVISIBLE);
        // We show and enable the second button so we can go to the second animation
        next.setEnabled(true);
        next.setVisibility(View.VISIBLE);
    }
    // how to move an image
    public void movepug(View view) {
        ImageView pug = (ImageView) findViewById(R.id.pug);
        ImageView cup = (ImageView) findViewById(R.id.cup);
        Button next = (Button) findViewById(R.id.next);
        Button restart = (Button) findViewById(R.id.restart);

        // Swipe cup to the right and show pug falling from the top of the screen
        cup.animate().translationXBy(2000f).setDuration(2000);
        pug.setVisibility(View.VISIBLE);
        pug.animate().translationYBy(5000f).setDuration(2000);

        // We hide and disable the second button so it won't trouble us further
        next.setEnabled(false);
        next.setVisibility(View.INVISIBLE);

        // We show and enable the reset button so we can restart out animations
        restart.setEnabled(true);
        restart.setVisibility(View.VISIBLE);
    }
    public void resetImages(View view) {
        Button start = (Button) findViewById(R.id.start);
        Button restart = (Button) findViewById(R.id.restart);
        ImageView pom = (ImageView) findViewById(R.id.pom);
        ImageView cup = (ImageView) findViewById(R.id.cup);
        ImageView pug = (ImageView) findViewById(R.id.pug);

        pug.setVisibility(View.INVISIBLE);
        pug.setTranslationY(-5000);
        cup.setAlpha(0f);
        cup.animate().translationX(0f).setDuration(0);
        pom.setAlpha(1f);

        // We hide and disable the reset button so it won't troubles us further
        restart.setEnabled(false);
        restart.setVisibility(View.INVISIBLE);

        // We show and enable the first button so we can run our animations again
        start.setEnabled(true);
        start.setVisibility(View.VISIBLE);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hide pug before it all starts!
        ImageView pug = (ImageView) findViewById(R.id.pug);
        pug.setTranslationY(-5000);
    }
}
