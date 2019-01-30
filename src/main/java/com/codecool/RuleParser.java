package com.codecool;

//These parsers are to be used to interpret
//the corresponding XML files ( Rules.xml and Facts.xml ).


//The RuleParser adds the questions with their corresponding
//id to the RuleRepository instance. This is stored in a Map
// inside the RuleRepository (as a field instance).

import java.util.ArrayList;
import java.util.Arrays;

public class RuleParser extends XMLParser {
    private RuleRepository rulerepo;
    private ArrayList<String> tmp;


    public RuleRepository getRuleRepository(ArrayList<String[]> questioncollection) {
        this.rulerepo = new RuleRepository();
        for (String[] qlist : questioncollection) {
            this.rulerepo.addQuestion(new Question(qlist[0], qlist[1], new ArrayList<>(Arrays.asList(qlist[2].split(","))), new ArrayList<>(Arrays.asList(qlist[3].split(",")))));
        }
        return this.rulerepo;
    }

}
