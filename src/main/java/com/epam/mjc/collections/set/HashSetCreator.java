package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> finalSet = new HashSet<>();

        for (int i : sourceList) {
            if (i % 2 == 0) {
                int temp = i;
                do {
                    finalSet.add(temp);
                    finalSet.add(temp / 2);
                    temp /= 2;
                } while (temp % 2 == 0);
            } else {
                finalSet.add(i);
                finalSet.add(2 * i);
            }
        }

        return finalSet;
    }
}
