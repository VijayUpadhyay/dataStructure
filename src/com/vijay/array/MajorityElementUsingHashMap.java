package com.vijay.array;

import java.util.HashMap;

public class MajorityElementUsingHashMap {

    public static void main(String[] args) {

	int[] array = { 2, 3, 2, 1, 1, 2, 3, 4, 2, 1, 2 };
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	int value = 0;
	for (int i = 0; i < array.length; i++) {
	    if (map.containsKey(array[i])) {
		value = map.get(array[i]);
		value++;
		map.put(array[i], value);
		value = 0;
	    } else
		map.put(array[i], 1);

	}

    }

}
