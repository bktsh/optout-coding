package com.bktsh.rei.q1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by hashem on 12/13/16.
 */
public class RangeMapper {

    public List<Range> findRanges(List<Integer> integers) {
        if (integers == null || integers.isEmpty()) return Collections.EMPTY_LIST;
        List<Range> result = new ArrayList<>();
        List<Integer> input = integers.stream().distinct().sorted().collect(Collectors.toList());
        Integer px = null;
        Integer py = null;
        int currentIdx = 0;
        while (currentIdx < input.size()) {
            px = input.get(currentIdx++);
            int highEnd = 0;
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
