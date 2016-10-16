package com.aspectcapital.questionone;

import com.aspectcapital.questionone.list.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>(Arrays.asList(6, 11, 414, 1546, 504));
        List<Integer> modifiedList = Lists.map(getPlusOneFunction(), list);

        System.out.println("Original list: ");
        list.forEach(System.out::println);

        System.out.println("Modified list: ");
        modifiedList.forEach(System.out::println);
    }

    private static Function<Integer, Integer> getPlusOneFunction() {
        return e -> e + 1;
    }
}
