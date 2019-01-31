package com.codecool;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FactRepositoryTest {
    FactParser fparser;
    RuleParser rparser;
    ESProvider exsys;
    Fact fact;

    @BeforeEach
    void setUp() throws Exception{
        this.fparser = new FactParser();
        this.rparser = new RuleParser();
        this.exsys = new ESProvider(fparser, rparser);
        this.fact = new Fact("String id", "String description",  5.5, new String[] {"élds", "éasdlfs"} , 5, true , false);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addFact() {
        fparser.getFactRepository().addFact(fact);
        assertTrue(fparser.getFactRepository().getFacts().contains(fact));
    }


    @Test
    void getFacts() {
        assertTrue(fparser.getFactRepository().getFacts().equals(fparser.getFactRepository().facts));
    }
}
