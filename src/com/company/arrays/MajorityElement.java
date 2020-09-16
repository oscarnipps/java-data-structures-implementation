package com.company.arrays;

import java.util.HashMap;
import java.util.Map;

/*
 *  gets the majority element from an array [2,2,1,1,1,2,2] has majority element of 2
 *
 *  created by oscar 16/09/2020
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> elementsMap = new HashMap<>();
        int maximum = 0;
        int maximumElement = 0;

        for (int i = 0; i < nums.length; i++) {
            //add new seen element to map with default count of 0
            if (!elementsMap.containsKey(nums[i])) {
                elementsMap.put(nums[i], 0);
                continue;
            }
            elementsMap.replace(nums[i],  elementsMap.get(nums[i]) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : elementsMap.entrySet()) {

            if(maximum <= entry.getValue()){
                maximum = entry.getValue();
                maximumElement = entry.getKey();
            }
        }

        return maximumElement;
    }
}
