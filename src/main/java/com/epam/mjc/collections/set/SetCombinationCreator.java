package com.epam.mjc.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> combSet = new LinkedHashSet<>();
        for (String s : firstSet) {
            if (secondSet.contains(s) && !thirdSet.contains(s)) {
                combSet.add(s);
            }
        }
        for (String s : thirdSet) {
            if (!firstSet.contains(s) && !secondSet.contains(s)) {
                combSet.add(s);
            }
        }

        return combSet;
    }
}
