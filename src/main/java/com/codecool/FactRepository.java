package com.codecool;

import java.util.*;


//The FactRepository constructor initializes the FactIterator
//inner class that implements the Iterator interface. With this we
//can iterate through the answers later.

public class FactRepository {
    Fact[] facts = new Fact[5];


    public FactRepository() {
    }

    public void addFact(Fact fact) {

    }

    public Set<String> getIdSet() {

    }

    public void setFactValueById(String id, boolean value) {

    }

    public boolean getValueById(String id) {

    }

    public Iterator<Fact> getIterator() {
        return new FactIterator();
    }

    private class FactIterator implements Iterator {
        private int pointer = 0;

        @Override
        public boolean hasNext() {
            if(pointer < facts.length) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Fact next() {
            if(this.hasNext()) {
                return facts[pointer++];
            } else {
                return null;
            }
        }
    }
}
