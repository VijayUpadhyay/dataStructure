package com.vijay.array.june2023;

public class ContainerWithMaxWater {
    public static void main(String[] args) {
        int[] a = {1, 5, 4, 3};
        int[] b = {3, 1, 2, 4, 5};
        System.out.println(maxArea(a));
        System.out.println(maxArea(b));
    }

    /* Algorithm:
     Keep two index, first = 0 and last = n-1 and a value max_area that stores the maximum area.
     Run a loop until first is less than the last.
     Update the max_area with maximum of max_area and min(array[first] , array[last])*(last-first)
             if the value at array[first] is greater the array[last] then update last as last – 1 else update first as first + 1
     Print the maximum area.*/
    public static int maxArea(int[] height) {
        int maxVol = Integer.MIN_VALUE;
        int firstPtr = 0, secPtr = height.length - 1;
        while (firstPtr < secPtr) {
            maxVol = Math.max(maxVol, Math.min(height[firstPtr], height[secPtr]) * (secPtr - firstPtr));
            if (height[firstPtr] < height[secPtr]) {
                firstPtr++;
            } else {
                secPtr--;
            }
        }
        return maxVol;
    }
}
