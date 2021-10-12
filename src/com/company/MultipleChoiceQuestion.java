package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoiceQuestion extends Question {
    private ArrayList<String> possibleAnswers;
    private int correctAnswer;


    public MultipleChoiceQuestion(String questionText, int pointValue, ArrayList<String> possibleAnswers, int correctAnswer) {
        super(questionText, pointValue);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayAnswers() {
        for (int i = 0; i < possibleAnswers.size(); i++) {
            System.out.println(i + "): " + possibleAnswers.get(i));
        }

    }
    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctAnswer;
    }

    @Override
    public int getAnswer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose the corresponding integer to answer");
//        while(!input.hasNextInt()) {
//            System.out.println(("Please input an integer"));
//            input.next();
//        }
        int userAnswer = input.nextInt();
        if (isCorrect(userAnswer)) {
            return getPointValue();
        }
        return 0;
    }


}
