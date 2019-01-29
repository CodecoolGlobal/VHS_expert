package com.codecool;


//Next the collectAnswers method is called and it initializes
//a Map instance field which stores the question identifiers
//mapped against their respective answers.

//The collectAnswers method iterates through the questions and
//asks the user each questions. Repeating the questions until a
//correct answer can be determined.


//The possible answers for every question are defined in the Rules.xml file.
//Call the getEvaluateAnswer method with the given user input and if
//there is no exception thrown store the returned value by question id
//(mapping each question with the user's answer: true or false).


//In the ESProvider's constructor we store the FactRepository instance
//that returned by calling the getFactRepository method of the FactParser.
//The parsed Facts (parsed by the FactParser ) are added to the FactRepository.

public class ESProvider {
    private FactParser factParser;
    private RuleParser ruleParser;

    public ESProvider(FactParser factParser, RuleParser ruleparser) {
        this.factParser = factParser;
        this.ruleParser = ruleparser;
        //In the constructor the getRuleRepository method is called and
        //the returned RuleRepository instance is stored as an instance
        //field.
        //RuleRepository ruleRepo = ruleparser.getRuleRepository();
    }

    public void collectAnswers() {

    }

    public boolean getAnswerByQuestion(String questionId) {
        throw new UnsupportedOperationException();

    }

    public String evaluate() {
        //If we call the evaluate method of the ESProvider then it iterates
        //through the Facts and checks for possible matches. If it finds one
        //then the answer it returns will be the description of the Fact
        //otherwise null. If the return value is null then an answer couldn't
        //be found by the expert system (maybe it needs more rules, or facts, etc.).

        throw new UnsupportedOperationException();

    }
}
