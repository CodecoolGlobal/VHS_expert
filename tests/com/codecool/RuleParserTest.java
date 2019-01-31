package com.codecool;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RuleParserTest {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getRulerepo() throws Exception {
        RuleParser rulepara = new RuleParser();
        assertTrue(rulepara.getRulerepo() instanceof RuleRepository);
    }
}
