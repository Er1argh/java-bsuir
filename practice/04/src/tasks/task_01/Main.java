/*
 * Необходимо написать параметризированный класс с двумя параметрами,
 * ограниченными классом Number и разработать метод вычисления суммы двух
 * чисел, любых типов, метод сравнивающий поэлементно два массива разных
 * типов, метод определяющий наибольший и наименьший элементы в массивах.
 */


package tasks.task_01;

public class Main {
    public static void main(String[] args) {
        NumberProcessor<Integer, Double> numberProcessor = new NumberProcessor<>();

        System.out.println("Sum: " + numberProcessor.sum(10, 2.5));

        Integer[] intArray = {1, 2, 3};
        Double[] doubleArray = {1.0, 2.0, 3.0};

        System.out.println("Arrays equal: " + numberProcessor.compareArrays(intArray, doubleArray));

        numberProcessor.findMinMax(intArray);
        System.out.println();
        numberProcessor.findMinMax(doubleArray);
    }
}
