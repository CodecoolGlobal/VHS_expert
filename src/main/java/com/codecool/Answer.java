package com.codecool;

//Every Question has an Answer and every Answer can have more than one Value.

// The Answer class has the responsibility to evaluate the answers based
//a given user input matched against an input pattern.

//If the value is SingleValue then the user input only needs to be
//compared against the input pattern (with equals). If the Value is
//MultipleValue then we need check the input against a range
//(e.g. the input pattern could contain more than one elements).
//If the input cannot be matched successfully against any input patterns
//an exception is thrown.

//-----> collectAnswers in ESProvider


public class Answer {

    public boolean evaluateAnswerByInput(String input) {

    }

    public void addValue(Value value) {

    }

}
