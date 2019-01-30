package com.codecool;

//These parsers are to be used to interpret
//the corresponding XML files ( Rules.xml and Facts.xml ).


//The FactParser adds the options with their corresponding
//id to the FactRepository instance. This is stored in a Map
//inside the FactRepository (as a field instance).

import java.util.ArrayList;
import java.util.Iterator;

public class FactParser extends XMLParser {


    public FactParser() {
        searchFor = "Movie";
        arrLen = 6;
    }

    public FactRepository getFactRepository() {
        return new FactRepository();

    }

    public FactRepository makeObj(ArrayList<String[]> moviecollection){
        FactRepository movies = new FactRepository();
        for(String[] list : moviecollection){
            movies.addFact(new Fact(list[0], list[1], Double.parseDouble(list[2]) ,list[3].split(","), Integer.parseInt(list[4]),Boolean.valueOf(list[5]), Boolean.valueOf(list[6])));
        }
        return movies;
    }


}
