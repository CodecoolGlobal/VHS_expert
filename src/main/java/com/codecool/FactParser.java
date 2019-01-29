package com.codecool;

//These parsers are to be used to interpret
//the corresponding XML files ( Rules.xml and Facts.xml ).


//The FactParser adds the options with their corresponding
//id to the FactRepository instance. This is stored in a Map
//inside the FactRepository (as a field instance).

import java.util.Iterator;

public class FactParser extends XMLParser {

    public FactRepository getFactRepository() {
        //In the constructor the getFactRepository method is called and
        //the returned FactRepository instance is stored as an instance
        //field.
        throw new UnsupportedOperationException();

    }

    csináljobjektet() {
        for(String[] lista : ArrayList<String[]>) {
            FactRepository.addFact(new Fact(lista[0], lista[1] ))
        }
    }

}
