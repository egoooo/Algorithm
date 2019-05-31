package suanfa;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode56 {
    public static void main(String[] args) {
        int[ ][ ]  arr = {{5,9},{8,34}};

        System.out.println( Arrays.toString(merge(arr)[0]));

    }

    /**
     * 给出一个区间的集合，请合并所有重叠的区间。
     *
     * 示例 1:
     *
     * 输入: [[1,3],[2,6],[8,10],[15,18]]
     * 输出: [[1,6],[8,10],[15,18]]
     * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
     * @param intervals
     * @return
     */
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        // 对数组进行排序，按照区间的起始位置进行比较
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        // 盛放新的合并的区间
        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);
        for (int[] interval : intervals) {
            // 如果当前区间的起始位置比前一个区间的终止位置要小，进行合并
            if (interval[0] <= newInterval[1])
                //更新上一个区间的终止位置
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            else {
                // 如果当前区间的起始位置大于前一个区间的终止位置，说明区间不重合
                newInterval = interval;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }


/**
    private class IntervalComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval a, Interval b) {
            return a.start < b.start ? -1 : a.start == b.start ? 0 : 1;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new IntervalComparator());

        LinkedList<Interval> merged = new LinkedList<Interval>();
        for (Interval interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.getLast().end < interval.start) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                merged.getLast().end = Math.max(merged.getLast().end, interval.end);
            }
        }

        return merged;
    }
 **/
}
