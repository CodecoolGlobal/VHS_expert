package com.codecool;

public class Main {

    public static void main(String[] args) throws Exception {
        FactParser fparser = new FactParser();
        RuleParser rparser = new RuleParser();
        ESProvider exsys = new ESProvider(fparser, rparser);


        //rparser.loadXmlDocument("src/resources/rules.xml");

        System.out.println(fparser.loadXmlDocument("src/resources/facts.xml"));
        

    }

}
