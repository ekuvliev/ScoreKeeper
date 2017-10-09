package com.example.eekuvliev.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //int outTracker=0;
    int homeScore=0; int awayScore=0; int half=1;
    int numYellows=0; int numReds=0; int numShots=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementHomeScore(View view ){
        homeScore++; displayHomeScore(homeScore);}

    public void incrementAwayScore (View view){
        awayScore++; displayAwayScore(awayScore);}

    public void incrementYellows (View view){
       numYellows++; displayYellows(numYellows);}

    public void decrementYellows (View view){
        numYellows--; displayYellows(numYellows);}

    public void incrementReds (View view){
       numReds++; displayReds(numReds);}


    public void decrementReds (View view){
        numReds--; displayReds(numReds);}

    public void incrementShots (View view){
        numShots++; displayShots(numShots);
    }

    public void decrementShots (View view){
        numShots--; displayShots(numShots);}

    public void incrementHalf(View view){
        if(half<2) {
            half++;
        }
        displayHalf(half);}

    public void resetButton(View view){
        homeScore=0; awayScore=0; half=1;
        numYellows=0; numReds=0; numShots=0;
        displayHomeScore(homeScore); displayAwayScore(awayScore); displayHalf(half);
        displayYellows(numYellows); displayReds(numReds); displayShots(numShots);
    }

    public void resetShotsButton(View view){numShots=0; displayShots(numShots);}

    private void displayHomeScore(int hScore){
        TextView homeScoreTextView =(TextView)findViewById(R.id.home_score);
        homeScoreTextView.setText("" + hScore);
    }

    private void displayAwayScore(int aScore){
        TextView homeScoreTextView =(TextView)findViewById(R.id.away_score);
        homeScoreTextView.setText("" + aScore);
    }

    private void displayShots(int shot){
        TextView homeScoreTextView =(TextView)findViewById(R.id.shots_number);
        homeScoreTextView.setText("" + shot);
    }

    private void displayYellows(int yellow){
        TextView homeScoreTextView =(TextView)findViewById(R.id.yellows_number);
        homeScoreTextView.setText("" + yellow);

    }

    private void displayReds(int shot){
        TextView homeScoreTextView =(TextView)findViewById(R.id.reds_number);
        homeScoreTextView.setText("" + shot);
    }

    private void displayHalf(int h){
        TextView homeScoreTextView =(TextView)findViewById(R.id.half_number);
        homeScoreTextView.setText("" + h);
    }

}