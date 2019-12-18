package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    void addAdult() {
        FamilyList familyList = new FamilyList();

        familyList.adults.add(new Adult("name","familyName",4,75.2));

        assertEquals(1, familyList.adults.size(), "Did not add adult");
    }
}