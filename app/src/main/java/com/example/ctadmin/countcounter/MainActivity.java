package com.example.ctadmin.countcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void teamApoints1 () {

        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }

    public void teamApoints2() {
        teamAScore = teamAScore+ 2;
        displayForTeamA(teamAScore);
    }

    public void teamApoints3() {
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.textView9);
        scoreView.setText("" + score);
    }

    public void teamBpoints1() {
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }

    public void teamBpoints2() {
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }

    public void teamBpoints3() {
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }

    private void displayForTeamB(int points) {
        TextView scoreView = (TextView) findViewById(R.id.textView);
        scoreView.setText("" + points);
    }

    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(0);
        displayForTeamB(0);}}