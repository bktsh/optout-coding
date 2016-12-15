package com.bktsh.rei.q1;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

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
        Set<Range> result = subject.findRanges(null);
        result.forEach(x -> System.out.print(x + " "));
        assertTrue(result.size() == 0);
    }

    @Test
    public void findRangesShouldReturnListOfAscendingRangesGivenEmptyInput() {

        Set<Range> result = subject.findRanges(new Integer[]{});
        result.forEach(x -> System.out.print(x + " "));
        assertTrue(result.size() == 0);
    }

    @Test
    public void findRangesShouldReturnListOfAscendingRangesGivenMultipleRangeInput() {
        Set<Range> result = subject.findRanges(new Integer[]{35, 36, 34, 7, 5, 6, 3, 2, 4, 1, 89, 92, 90, 91, 110});
        result.forEach(x -> System.out.print(x + " "));
        assertTrue(result.size() == 3);
    }

    @Test
    public void findRangesShouldReturnListOfAscendingRangesGivenSingleRangeInput() {
        Set<Range> result = subject.findRanges(new Integer[]{109, 110});
        result.forEach(x -> System.out.print(x + " "));
        System.out.println();
        assertTrue(result.size() == 1);
    }

    @Test
    public void findRangesShouldReturnListOfAscendingRangesGivenNagativeRangeInput() {
        Set<Range> result = subject.findRanges(new Integer[]{1, 2, -4, -5});
        result.forEach(x -> System.out.print(x + " "));
        System.out.println();
        assertTrue(result.size() == 2);
    }

    @Test
    public void findRangesForSampleProblemStatementInput() {
        Set<Range> result = subject.findRanges(new Integer[]{1,2,3,4,5,6,3,6,8,5,8,9,4,3,5});
        result.forEach(x -> System.out.print(x + " "));
        System.out.println();
        assertTrue(result.size() > 0);
    }
}