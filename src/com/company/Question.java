package com.company;

public abstract class Question {
    private String questionText;

    private int pointValue;

    public Question(String questionText, int pointValue) {
        this.questionText = questionText;
        this.pointValue = pointValue;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void displayQuestion() {
        System.out.println(questionText);
    }

    public abstract void displayAnswers();

    public abstract int getAnswer();

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }
}
