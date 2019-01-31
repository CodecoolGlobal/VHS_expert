package com.codecool;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        FactParser fparser = new FactParser();
        RuleParser rparser = new RuleParser();
        ESProvider exsys = new ESProvider(fparser, rparser);

        //rparser.getRulerepo().getAllAnswers();


        //Menu mn = new Menu();

        //exsys.collectAnswers(fparser.getFactRepository().getFacts(), rparser.getRulerepo().getQuestions() );
        //exsys.evaluate(fparser.getFactRepository().getFacts());

        exsys.listByCriteria(fparser.getFactRepository().getFacts(), (x) -> !(x.isHighRated()));
        //allmovies:
        /*for(Fact fact : fparser.getFactRepository().getFacts()) {
            System.out.println(fact.toString());
        }*/
        //exsys.evaluate(fparser.getFactRepository().getFacts());
        
        /*Menu mn = new Menu();
        mn.program_menu();
*/

    }

}
