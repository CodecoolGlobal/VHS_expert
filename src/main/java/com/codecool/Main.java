package com.codecool;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        FactParser fparser = new FactParser();
        RuleParser rparser = new RuleParser();
        ESProvider exsys = new ESProvider(fparser, rparser);


        //rparser.loadXmlDocument("src/resources/rules.xml");

        /*ArrayList<String[]> toprintTest = fparser.loadXmlDocument("src/resources/facts.xml");
        for(String[] test : toprintTest) {
            for(String testString : test) {
                System.out.println(testString);
            }
        }*/

        Menu mn = new Menu();
        mn.program_menu();

    }

}
