package tasks.task_02;

import java.util.TreeSet;

public class NumberStorage {
    private final TreeSet<Integer> numbers = new TreeSet<>();

    public void add(int number) {
        numbers.add(number);
    }

    public boolean remove(int number) {
        return numbers.remove(number);
    }

    public Integer findClosest(int target) {
        if (numbers.isEmpty()) {
            return null;
        }

        Integer floor = numbers.floor(target);
        Integer ceiling = numbers.ceiling(target);

        if (floor == null) {
            return ceiling;
        }

        if (ceiling == null) {
            return floor;
        }

        int diffFloor = target - floor;
        int diffCeiling = ceiling - target;

        return (diffFloor <= diffCeiling) ? floor : ceiling;
    }
}
