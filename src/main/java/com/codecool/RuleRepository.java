package com.codecool;

import java.util.ArrayList;
import java.util.Iterator;


//The RuleRepository constructor initializes the QuestionIterator
//inner class that implements the Iterator interface. With this we
//can iterate through the questions later.

public class RuleRepository {
    ArrayList<Question> questions = new ArrayList<Question>();

    public RuleRepository() {
        QuestionIterator questIt = new QuestionIterator();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public Iterator<Question> getIterator() {
        throw new UnsupportedOperationException();
    }

    private class QuestionIterator implements Iterator {

        @Override
        public boolean hasNext() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Object next() {
            throw new UnsupportedOperationException();
        }
    }
}
