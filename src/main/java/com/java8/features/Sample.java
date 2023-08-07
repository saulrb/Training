package com.java8.features;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sample {

    public List<Integer> getNumber(int[] array, int targetSum) {
        Set<Integer> numbersThatMeetTarget = new HashSet<>();
        if(targetSum > 0) {
            for (int i = 0; i < array.length; i++) {
                int j = array.length - 1;
                while (j > i) {
                    if (array[i] + array[j] == targetSum) {
                        numbersThatMeetTarget.add(array[i]);
                        numbersThatMeetTarget.add(array[j]);
                    }
                    if (array[i] == targetSum) {
                        numbersThatMeetTarget.add(array[i]);
                    }
                    if (array[j] == targetSum) {
                        numbersThatMeetTarget.add(array[j]);
                    }
                    j--;
                }
            }
        }
        return numbersThatMeetTarget.stream().collect(Collectors.toList());
    }


}
