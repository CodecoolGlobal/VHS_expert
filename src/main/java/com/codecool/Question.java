package com.codecool;

import java.util.ArrayList;
import java.util.Scanner;

public class Question {
    private String id;
    private String question;
    private ArrayList<String> trues;
    private ArrayList<String> falses;
    private boolean answer;

    public Question(String id, String question, ArrayList<String> trues, ArrayList<String> falses) {
        this.id = id;
        this.question = question;
        this.trues = trues;
        this.falses = falses;

    }

    public String getId() {
        return this.id;
    }

    public String getQuestion() {
        return this.question;
    }


    public boolean getEvaluatedAnswer(String input) {
        throw new UnsupportedOperationException();

    }

    public void getAnswer() {
        Scanner reader = new Scanner(System.in);
        System.out.println(question);
        String choice = reader.nextLine();
        if (trues.contains(choice)) {
            answer = true;
        } else if (falses.contains(choice)) {
            answer = false;
        } else {
            System.out.println("There is no such option!");
            getAnswer();
        }

    }

}
