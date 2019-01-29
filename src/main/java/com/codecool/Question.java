package com.codecool;

import java.util.ArrayList;

public class Question {
    private String id;
    private String question;
    private ArrayList<String> trues;
    private ArrayList<String> falses;
    private boolean answer;

    public Question(String id, String question) {
        this.id = id;
        this.question = question;

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


}
