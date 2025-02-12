/* Создайте массив из 12 случайных целых чисел из отрезка [–15;15].
 * Определите какой элемент является в этом массиве максимальным и сообщите
 * индекс его последнего вхождения в массив.*/

public class Main {
    public static void main(String[] args) {
        int[] array = new int[12];
        int max = Integer.MIN_VALUE;
        int lastIndex = -1;


        for (int i = 0; i < array.length; i++) {
            array[i] = -15 + (int) (Math.random() * 30 + 1);

            if (array[i] >= max) {
                max = array[i];
                lastIndex = i;
            }
        }

        System.out.print("Массив: ");

        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Индекс последнего вхождения: " + lastIndex);
    }
}
