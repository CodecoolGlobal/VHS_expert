package com.codecool;

import java.util.*;


//The FactRepository constructor initializes the FactIterator
//inner class that implements the Iterator interface. With this we
//can iterate through the answers later.

public class FactRepository {
    ArrayList<Fact> facts = new ArrayList<Fact>();


    public FactRepository() {
    }

    public void addFact(Fact fact) {
        facts.add(fact);

    }

    public Set<String> getIdSet() {
        throw new UnsupportedOperationException();
    }

    public void setFactValueById(String id, boolean value) {

    }

    public boolean getValueById(String id) {
        throw new UnsupportedOperationException();
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
}
