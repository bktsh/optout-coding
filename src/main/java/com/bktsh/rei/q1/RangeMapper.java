package com.bktsh.rei.q1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by hashem on 12/13/16.
 */
public class RangeMapper {

    /**
     * Given an array of Integers, will return Set of ranges[if any], with inclusive start and end values, in ascending order.
     *
     * @param integers
     * @return
     */
    public Set<Range> findRanges(Integer[] integers) {
        if (integers == null || integers.length == 0) {
            return Collections.emptySet();
        }
        Set<Range> result = new TreeSet<>();
        List<Integer> input = (Arrays.asList(integers)).stream().distinct().sorted().collect(Collectors.toList());
        Integer px;
        Integer py = null;
        int currentIdx = 0;
        while (currentIdx < input.size()) {
            px = input.get(currentIdx++);
            int highEnd;
            for (highEnd = currentIdx; highEnd < input.size(); highEnd++) {
                if (input.get(highEnd) - input.get(highEnd - 1) != 1) break;
                py = input.get(highEnd);
            }
            if (py != null && py > px) {
                result.add(new Range(px, py));
            }
            currentIdx = highEnd;
        }
        return result;
    }
}
