package com.codecool;


import java.util.ArrayList;

public class ESProvider {
    private FactParser factParser;
    private RuleParser ruleParser;

    public ESProvider(FactParser factParser, RuleParser ruleparser) {
        this.factParser = factParser;
        this.ruleParser = ruleparser;

    }

    public void collectAnswers(ArrayList<Fact> facts, ArrayList<Question> questions) {
        for (Fact fact : facts) {
            if (fact.isHighRated() == questions.get(0).isTrue() && fact.isFamilyFriendy() == questions.get(1).isTrue() && fact.isLongMovie() == questions.get(2).isTrue() && fact.isAnimation() == questions.get(3).isTrue() && fact.isMultilang() == questions.get(4).isTrue()) {
                System.out.println(fact.toString());
            }
        }
    }

    public void listByCriteria(ArrayList<Fact> facts, FactFilter ff) {
        for(Fact fact : facts) {
            if(ff.filterFact(fact)){
                System.out.println(fact.toString());
            }
        }
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

    interface FactFilter {
         boolean filterFact(Fact f);
    }
}
