package com.codecool;

//These parsers are to be used to interpret
//the corresponding XML files ( Rules.xml and Facts.xml ).


//The FactParser adds the options with their corresponding
//id to the FactRepository instance. This is stored in a Map
//inside the FactRepository (as a field instance).

import java.util.ArrayList;
import java.util.Iterator;

public class FactParser extends XMLParser {
    private ArrayList<String[]> facts;

    public FactParser() throws Exception {
        searchFor = "Movie";
        arrLen = 6;
        this.facts = loadXmlDocument("./src/resources/facts.xml");
        makeObj();
    }



    public FactRepository getFactRepository() {
        return new FactRepository();

    }

    private FactRepository makeObj(){
        FactRepository movies = new FactRepository();
        for(String[] list : facts){
            movies.addFact(new Fact(list[0].trim(), list[1].trim(), Double.parseDouble(list[2].trim()) ,list[3].trim().split(","), Integer.parseInt(list[4].trim()),Boolean.valueOf(list[5].trim()), Boolean.valueOf(list[6].trim())));
        }
        return movies;
    }


}
