package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HashMakeTest {

    @Test
    void hashAddTest() {
        //given
        HashMake hashmake = new HashMake();
        hashmake.saveData(1, "lee");
        hashmake.saveData(2, "aa");
        hashmake.saveData(3, "lsse");

        //when
        Object returnvalue = hashmake.readValue(2);

        //then
        assertEquals(returnvalue,"aa");
    }

    @Test
    void hashDelete() {
        //given
        HashMake hashmake = new HashMake();
        hashmake.saveData(1, "lee");
        hashmake.saveData(2, "aa");
        hashmake.saveData(3, "lsse");
        List<Objects> readResult ;

        //when
        hashmake.deleteData(2);

        //then
        assertEquals(2, hashmake.size());
    }
}