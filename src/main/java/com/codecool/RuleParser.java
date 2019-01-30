package com.codecool;

//These parsers are to be used to interpret
//the corresponding XML files ( Rules.xml and Facts.xml ).


//The RuleParser adds the questions with their corresponding
//id to the RuleRepository instance. This is stored in a Map
// inside the RuleRepository (as a field instance).

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class RuleParser extends XMLParser {
    private RuleRepository rulerepo;
    private ArrayList<String> tmp;
    private ArrayList<String[]> rules;



    public RuleParser() throws Exception{
            searchFor = "Rule";
            arrLen = 3;
           this.rules = loadXmlDocument("./src/resources/rules.xml");
           makeObj();
    }

    public RuleRepository getRulerepo() {
        return rulerepo;
    }

    private RuleRepository makeObj() {
        this.rulerepo = new RuleRepository();
        for (String[] qlist : rules) {
            this.rulerepo.addQuestion(new Question(qlist[0].trim(), qlist[1].trim(), new ArrayList<>(Arrays.asList(qlist[2].trim().split(","))), new ArrayList<>(Arrays.asList(qlist[3].trim().split(",")))));
        }
        return this.rulerepo;
    }

}
