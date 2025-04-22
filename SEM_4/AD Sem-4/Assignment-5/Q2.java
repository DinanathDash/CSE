import java.util.*;

class Interval {
    int start, end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class IntervalScheduler {
    public static List<Interval> intervalSchedule(List<Interval> intervals) {
        List<Interval> schedule = new ArrayList<>();

        intervals.sort((a, b) -> a.end - b.end);

        schedule.add(intervals.get(0));
        int lastScheduledIndex = 0;

        for (int i = 1; i < intervals.size(); i++) {
            Interval currentInterval = intervals.get(i);
            Interval lastScheduled = intervals.get(lastScheduledIndex);

            if (currentInterval.start >= lastScheduled.end) {
                schedule.add(currentInterval);
                lastScheduledIndex = i;
            }
        }

        return schedule;
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 4));
        intervals.add(new Interval(3, 6));
        intervals.add(new Interval(5, 7));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(9, 11));

        List<Interval> schedule = intervalSchedule(intervals);

        System.out.println("Schedule:");
        for (Interval interval : schedule) {
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }
}
