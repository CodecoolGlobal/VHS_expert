package com.codecool;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        FactParser fparser = new FactParser();
        RuleParser rparser = new RuleParser();
        //ESProvider exsys = new ESProvider(fparser, rparser);
        rparser.getRulerepo().getAllAnswers();


        Menu mn = new Menu();
        mn.program_menu();


    }

}
