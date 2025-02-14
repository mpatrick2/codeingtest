package org.coding.challenge.utilities;

public class CleanUpId {
    public CleanUpId() {
    }
    public String cleanId( String input ){

        StringBuilder sb = new StringBuilder();

        for (int index = 0; index < input.length(); index++) {
            char c = input.charAt(index);
            if (c >= '0' && c <= '9') {
                sb.append(c);
            }
        }
        return (sb.isEmpty() ? null : sb.toString());
    }
}
