package com.company;

import java.util.ArrayList;

public class Quiz() {
    private ArrayList<Question> questions;
    private int score;
    private int totalScore;


    public Quiz(ArrayList<Question> questions, int score, int totalScore) {
        this.questions = questions;
        this.score = score;
        this.totalScore = totalScore;
    }
}
