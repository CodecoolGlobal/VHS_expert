package com.codecool;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactParserTest{

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getFactRepository() throws Exception{
        FactParser factpars = new FactParser();
        assertTrue(factpars.getFactRepository() instanceof FactRepository);
    }


}
