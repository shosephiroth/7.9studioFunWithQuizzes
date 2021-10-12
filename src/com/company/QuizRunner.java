package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import com.company.Quiz;

public class QuizRunner {

    public static void main(String[] args) {
        Quiz myQuiz = new Quiz(new ArrayList<Question>());
        ArrayList<String> possAns1 = new ArrayList<>(Arrays.asList("Garfield", "Salem", "Cheshire", "Tom"));
        ArrayList<Integer> correctAns1 = new ArrayList<>(Arrays.asList(2,3));
//        Checkbox newQuestion1 = new Checkbox(2, "Who is the best cat in the world?", possAns1, correctAns1);
//        myQuiz.addQuestion(newQuestion1);
        ArrayList<String> possAns2 = new ArrayList<>(Arrays.asList("Doc", "Tillie", "Gizmo", "Benji", "Nala"));
        MultipleChoiceQuestion newQuestion2 = new MultipleChoiceQuestion( "Who won the Halloween Costume Contest?", 1, possAns2, 3);
        myQuiz.addQuestion(newQuestion2);
//        TrueOrFalse newQuestion3 = new TrueOrFalse(1, "Are all dogs the best?", true);
//        myQuiz.addQuestion(newQuestion3);

        myQuiz.runQuiz();

        myQuiz.gradeQuiz();
    }
}
