import java.util.*;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Interval> intervals = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            intervals.add(new Interval(start, end));
        }

        List<Interval> mergedIntervals = mergeIntervals(intervals);

        for (Interval interval : mergedIntervals) {
            System.out.println(interval.start + " " + interval.end);
        }
    }

    static List<Interval> mergeIntervals(List<Interval> intervals) {
        if (intervals.size() <= 1) {
            return intervals;
        }

        Collections.sort(intervals, Comparator.comparingInt(a -> a.start));
        List<Interval> merged = new ArrayList<>();
        Interval current = intervals.get(0);

        for (Interval interval : intervals) {
            if (interval.start <= current.end) {
                current.end = Math.max(current.end, interval.end);
            } else {
                merged.add(current);
                current = interval;
            }
        }
        merged.add(current);
        return merged;
    }
}

