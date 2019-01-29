package com.codecool;

public class Main {

    public static void main(String[] args) {
        FactParser fparser = new FactParser();
        RuleParser rparser = new RuleParser();
        ESProvider exsys = new ESProvider(fparser, rparser);
        fparser.loadXmlDocument();

    }
}
