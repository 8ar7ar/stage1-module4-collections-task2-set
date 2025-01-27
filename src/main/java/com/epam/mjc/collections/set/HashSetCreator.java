package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (Integer intNum: sourceList){
            int num = intNum;

            if (num%2==0) {
                while (num%2==0) {
                    result.add(num);
                    num /= 2;
                }
                result.add(num);
            }
            else{
                result.add(num);
                result.add(2*num);
            }
        }
        return result;
    }

}
