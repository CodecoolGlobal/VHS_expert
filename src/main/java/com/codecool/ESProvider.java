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

import java.util.ArrayList;

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

    public void collectAnswers(ArrayList<Fact> facts, ArrayList<Question> questions) {
        for (Fact fact : facts) {
            if (fact.isHighRated() != questions.get(0).isTrue() || fact.isFamilyFriendy() != questions.get(1).isTrue() || fact.isLongMovie() != questions.get(2).isTrue() || fact.isAnimation() != questions.get(3).isTrue() || fact.isMultilang() != questions.get(4).isTrue()) {
                fact.setInclude(false);
            }
        }
    }
    public boolean getAnswerByQuestion() {
        throw new UnsupportedOperationException();

    }

    public void evaluate(ArrayList<Fact> facts) {
        int x = 0;
        for(Fact fact : facts) {
            if(fact.isInclude()) {
                System.out.println(fact.toString());
                x++;
            }
        }
        if(x == 0) {
            System.out.println("\nWe are sorry, but there is no film that matches the given criteria.");
        } else {
            System.out.println("The above listed movies were closest to your search criteria.");
        }

    }
}
