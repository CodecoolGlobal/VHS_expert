package com.codecool;

import java.util.ArrayList;
import java.util.Iterator;


public class RuleRepository {
    ArrayList<Question> questions = new ArrayList<Question>();

    public RuleRepository() {

    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void getAllAnswers() {
        RuleIterator ruler = new RuleIterator();
        while(ruler.hasNext()) {
            ruler.next().getAnswer();
        }
    }

    private class RuleIterator implements Iterator {
        private int pointer = 0;

        @Override
        public boolean hasNext() {
            if(pointer < questions.size()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Question next() {
            if(this.hasNext()) {
                return questions.get(pointer++);
            } else {
                return null;
            }
        }
    }

    public ArrayList<Question> getQuestions() {
        return this.questions;
    }
}
