package com.next.level;

public class MajorityElement {
    public static void main(String[] args) {
        MajorityElement obj = new MajorityElement();
        int[] arr = {1, 1, 1, 1, 2, 3, 4, 4, 4, 4, 4, 4, 5, 4, 4};
        obj.printMajorityElement(arr);
    }

    // Hashing: check list size. Iterate it and save in a map with its count. Iterate map and check if any element has size > n/2 of list size.
    // Sorting: Sort list and iterate over sorted list. Store element and its size having max size. At end, print element if its size > n/2 of list size.
    // Moore’s Voting Algorithm:
            /*This is a two-step process:

        findMajority: The first step gives the element that may be the majority element in the array.
                      If there is a majority element in an array, then this step will definitely return majority element, otherwise, it will return candidate for majority element.
        isMajorityElement:  Check if the element obtained from the above step is the majority element. This step is necessary as there might be no majority element.

             */
    public int printMajorityElement(final int[] arr) {
        int ele = findCandidate(arr, arr.length);
        if (isMajorityElement(ele, arr, arr.length)) {
            System.out.println("Majority ele is: " + ele);
        } else {
            System.out.println("No majority element");
        }
        return 0;
    }

    private boolean isMajorityElement(int ele, int[] arr, int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (ele == arr[i]) {
                count++;
            }
        }
        return count > Math.floorDiv(size, 2);
    }

    int findCandidate(int[] a, int size) {
        // consider majority index ele is at 0th index with count = 1
        int maj_index = 0, count = 1;
        int i;
        for (i = 1; i < size; i++) {
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            // reset maj_index to i and count = 1
            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }
}
