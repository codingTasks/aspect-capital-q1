package com.aspectcapital.questionone.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class ListsTest {
    @Test
    public void shouldReturnEmptyListWhenEmptyListIsProvided() throws Exception {
        Function<Integer, Integer> plusOneFunction = e -> e + 1;

        List<Integer> modifiedList = Lists.map(plusOneFunction, Collections.emptyList());
        assertThat(modifiedList, is(Collections.EMPTY_LIST));
    }

    @Test
    public void shouldReturnListWithIncrementedElements() throws Exception {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 14, 156, 54));
        Function<Integer, Integer> plusOneFunction = e -> e + 1;

        List<Integer> modifiedList = Lists.map(plusOneFunction, list);

        assertNotNull(modifiedList);
        assertThat(modifiedList.size(), is(equalTo(list.size())));

        IntStream.rangeClosed(0, list.size() - 1)
                .forEach(i -> assertThat(modifiedList.get(i), is(equalTo(list.get(i) + 1))));
    }
}
