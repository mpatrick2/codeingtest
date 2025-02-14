package org.coding.challenge.utilities;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesTest {
    @Test
    void removeDuplicates_0_0_Strings() {
        int expected = 0;
        List<Object> mixedList = Arrays.asList();
        Duplicates dups = new Duplicates();
        List<Object> reducedList = dups.removeDuplicates(mixedList);
        assertEquals(expected, reducedList.size());
    }

    @Test
    void removeDuplicates_2_1_Strings() {
        int expected = 1;
        List<Object> mixedList = Arrays.asList("a", "a");
        Duplicates dups = new Duplicates();
        List<Object> reducedList = dups.removeDuplicates(mixedList);
        assertEquals(expected, reducedList.size());
    }
    @Test
    void removeDuplicates_7_4_Strings() {
        int expected = 4;
        List<Object> mixedList = Arrays.asList("a", "b", "c", "a", "b", "d", "d");

        Duplicates dups = new Duplicates();
        List<Object> reducedList = dups.removeDuplicates(mixedList);
        assertEquals(expected, reducedList.size());
    }

    @Test
    void removeDuplicates_6_3_Strings() {
        int expected = 4;
        List<Object> mixedList = Arrays.asList("a", "b", "c", "a", "b", "d");

        Duplicates dups = new Duplicates();
        List<Object> reducedList = dups.removeDuplicates(mixedList);
        assertEquals(expected, reducedList.size());
    }

    @Test
    void removeDuplicates_0_0_Int() {
        int expected = 0;
        List<Object> mixedList = Arrays.asList();
        Duplicates dups = new Duplicates();
        List<Object> reducedList = dups.removeDuplicates(mixedList);
        assertEquals(expected, reducedList.size());
    }

    @Test
    void removeDuplicates_2_1_Int() {
        int expected = 1;
        List<Object> mixedList = Arrays.asList(9, 9);
        Duplicates dups = new Duplicates();
        List<Object> reducedList = dups.removeDuplicates(mixedList);
        assertEquals(expected, reducedList.size());
    }
    @Test
    void removeDuplicates_7_4_Int() {
        int expected = 4;
        List<Object> mixedList = Arrays.asList(1, 2, 3, 1, 2, 5, 5);

        Duplicates dups = new Duplicates();
        List<Object> reducedList = dups.removeDuplicates(mixedList);
        assertEquals(expected, reducedList.size());
    }
    @Test
    void removeDuplicates_6_4_Int() {
        int expected = 4;
        List<Object> mixedList = Arrays.asList(4, 4, 3, 2, 3, 1);

        Duplicates dups = new Duplicates();
        List<Object> reducedList = dups.removeDuplicates(mixedList);
        assertEquals(expected, reducedList.size());
    }

}