package com.codecool;



import java.util.ArrayList;


public class FactParser extends XMLParser {
    private ArrayList<String[]> facts;
    private FactRepository movies;

    public FactParser() throws Exception {
        searchFor = "Movie";
        arrLen = 6;
        this.facts = loadXmlDocument("src/resources/facts.xml");
        makeObj();
    }


    public FactRepository getFactRepository() {
        return this.movies;

    }

    private FactRepository makeObj(){
        this.movies = new FactRepository();
        for(String[] list : facts){
            movies.addFact(new Fact(list[0].trim(), list[1].trim(), Double.parseDouble(list[2].trim()) ,list[3].trim().split(","), Integer.parseInt(list[4].trim()),Boolean.valueOf(list[5].trim()), Boolean.valueOf(list[6].trim())));
        }
        return movies;
    }

    public FactRepository getMovies() {
        return movies;
    }
}
