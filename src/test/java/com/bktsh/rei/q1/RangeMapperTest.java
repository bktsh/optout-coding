package com.bktsh.rei.q1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by hashem on 12/13/16.
 */
public class RangeMapperTest {

    RangeMapper subject;

    @Before
    public void setUp() throws Exception {
        subject = new RangeMapper();
    }

    @Test
    public void findRangesShouldReturnListOfAscendingRangesGivenNullInput() {
        List<Range> result = subject.findRanges(null);
        result.forEach(x -> System.out.print(x + " "));
        assertTrue(result.size() == 0);
    }

    @Test
    public void findRangesShouldReturnListOfAscendingRangesGivenEmptyInput() {

        List<Range> result = subject.findRanges(Collections.emptyList());
        result.forEach(x -> System.out.print(x + " "));
        assertTrue(result.size() == 0);
    }

    @Test
    public void findRangesShouldReturnListOfAscendingRangesGivenMultipleRangeInput() {
        List<Range> result = subject.findRanges(Arrays.asList(35, 36, 34, 7, 5, 6, 3, 2, 4, 1, 89, 92, 90, 91, 110));
        result.forEach(x -> System.out.print(x + " "));
        assertTrue(result.size() == 3);
    }

    @Test
    public void findRangesShouldReturnListOfAscendingRangesGivenSingleRangeInput() {
        List<Range> result = subject.findRanges(Arrays.asList(109, 110));
        result.forEach(x -> System.out.print(x + " "));
        System.out.println();
        assertTrue(result.size() == 1);
    }

    @Test
    public void findRangesShouldReturnListOfAscendingRangesGivenNagativeRangeInput() {
        List<Range> result = subject.findRanges(Arrays.asList(1, 2, -4, -5));
        result.forEach(x -> System.out.print(x + " "));
        System.out.println();
        assertTrue(result.size() == 2);
    }
}