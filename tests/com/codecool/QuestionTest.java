package com.codecool;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {
    Question question;
    @BeforeEach
    void setUp() {
        this.question = new Question("1234", "Hogy vagy?", new ArrayList<String>(), new ArrayList<String>());

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getId() {
        assertEquals(question.getId(), "1234");
    }

    @Test
    void getQuestion() {
        assertEquals(question.getQuestion(), "Hogy vagy?");
    }

}
