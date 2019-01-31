package com.codecool;

import java.util.*;


public class FactRepository {
    ArrayList<Fact> facts = new ArrayList<Fact>();


    public FactRepository() {

    }

    public void addFact(Fact fact) {
        facts.add(fact);

    }


    public Iterator<Fact> getIterator() {
        return new FactIterator();
    }

    private class FactIterator implements Iterator {
        private int pointer = 0;

        @Override
        public boolean hasNext() {
            if(pointer < facts.size()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Fact next() {
            if(this.hasNext()) {
                return facts.get(pointer++);
            } else {
                return null;
            }
        }
    }

    public ArrayList<Fact> getFacts() {
        return facts;
    }
}
