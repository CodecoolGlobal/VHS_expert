package com.codecool;

import java.util.Iterator;


//The RuleRepository constructor initializes the QuestionIterator
//inner class that implements the Iterator interface. With this we
//can iterate through the questions later.

public class RuleRepository {

    public RuleRepository() {
        QuestionIterator questIt = new QuestionIterator();
    }

    public void addQuestion(Question question) {

    }

    public Iterator<Question> getIterator() {

    }

    private class QuestionIterator implements Iterator {

        @Override
        public boolean hasNext() {

        }

        @Override
        public Object next() {

        }
    }
}
