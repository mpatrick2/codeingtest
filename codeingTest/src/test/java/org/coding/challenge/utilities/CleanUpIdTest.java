package org.coding.challenge.utilities;

import static org.junit.jupiter.api.Assertions.*;
class CleanUpIdTest {

    @org.junit.jupiter.api.Test
    void cleanId_character_and_number() {
        CleanUpId cleanUpId = new CleanUpId();
        String testId = "@1";
        String actual = cleanUpId.cleanId(testId);
        String expected = "1";
        assertEquals(actual, expected);
    }
    @org.junit.jupiter.api.Test
    void cleanId_characterOnly() {
        CleanUpId cleanUpId = new CleanUpId();
        String testId = "@";
        String actual = cleanUpId.cleanId(testId);
        String expected = null;
        assertEquals(actual, expected);
    }
    @org.junit.jupiter.api.Test
    void cleanId_numberOnly() {
        CleanUpId cleanUpId = new CleanUpId();
        String testId = "113";
        String actual = cleanUpId.cleanId(testId);
        String expected = "113";
        assertEquals(actual, expected);
    }

}