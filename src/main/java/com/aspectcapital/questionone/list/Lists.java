package com.aspectcapital.questionone.list;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lists {
    public static <T, U> List<U> map(Function<T, U> function, final List<T> list) {
        return list.stream().map(e -> function.apply(e)).collect(Collectors.toList());
    }
}
