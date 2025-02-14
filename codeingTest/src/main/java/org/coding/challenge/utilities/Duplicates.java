package org.coding.challenge.utilities;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {
    public Duplicates() {
    }



    /*
     * Given a list of elements (where all elements are of the same type), return a new list
     * with the same elements in the same order, but removing duplicates.
     * Preserve the original input - do not mutate it, return a new list instead.
     */

    public List<Object> removeDuplicates(List<Object> mixedList) {
        List<Object> newList = new ArrayList<>();

        if ( mixedList.isEmpty()) {
            return newList;
        }
        // check to see if it is in the list
        for (Object element : mixedList) {
            boolean dup = false;
            for (Object newElement: newList) {
                if (newElement.equals(element)) {
                    dup = true;
                }
            }
            if (dup == false)
                newList.add( element );
        }
        return newList;
    }
}
