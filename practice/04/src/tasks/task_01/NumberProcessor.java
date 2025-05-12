package tasks.task_01;

public class NumberProcessor<T extends Number, V extends Number> {
    public double sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    public boolean compareArrays(T[] a, V[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (Math.abs(a[i].doubleValue() - b[i].doubleValue()) > 1e-9) {
                return false;
            }
        }

        return true;
    }

    public void findMinMax(Number[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty or null!");
            return;
        }

        double min = array[0].doubleValue();
        double max = array[0].doubleValue();

        for (Number num : array) {
            double current = num.doubleValue();
            min = Math.min(min, current);
            max = Math.max(max, current);
        }

        System.out.printf("%.2f - min, %.2f - max", min, max);
    }
}
