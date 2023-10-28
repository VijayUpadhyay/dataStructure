package com.vijay.array.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(-1, -1, 6, 1, 9, 3, 2, -1, 4, -1);
        Map<Integer, Long> m = l.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(m);
    }
}
