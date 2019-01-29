package com.codecool;

//These parsers are to be used to interpret
//the corresponding XML files ( Rules.xml and Facts.xml ).


//The RuleParser adds the questions with their corresponding
//id to the RuleRepository instance. This is stored in a Map
// inside the RuleRepository (as a field instance).

public class RuleParser extends XMLParser {
    private RuleRepository rulerepo;


    public RuleRepository getRuleRepository() {
        throw new UnsupportedOperationException();
    }
}
