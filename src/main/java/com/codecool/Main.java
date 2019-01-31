package com.codecool;

public class Main {

    public static void main(String[] args) throws Exception {
        FactParser fparser = new FactParser();
        RuleParser rparser = new RuleParser();
        ESProvider exsys = new ESProvider(fparser, rparser);

        Menu mn = new Menu();
        mn.program_menu(rparser, exsys, fparser);



    }

}
