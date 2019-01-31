package com.codecool;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RuleRepositoryTest {
    FactParser fparser;
    RuleParser rparser;
    ESProvider exsys;
    Question question;
    @BeforeEach
    void setUp() throws Exception {
        this.fparser = new FactParser();
        this.rparser = new RuleParser();
        this.exsys = new ESProvider(fparser, rparser);
        this.question = new Question("String id", "String question", new ArrayList<String>(), new ArrayList<String>());
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addQuestion() {
        rparser.getRulerepo().addQuestion(question);
        assertTrue(rparser.getRulerepo().getQuestions().contains(question));
    }


    @Test
    void getQuestions() {
        assertTrue(rparser.getRulerepo().getQuestions().equals(rparser.getRulerepo().questions));
    }
}
