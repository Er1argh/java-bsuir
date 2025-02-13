/* Для проверки остаточных знаний учеников после летних каникул,
 * учитель младших классов решил начинать каждый урок с того, чтобы задавать
 * каждому ученику пример из таблицы умножения, но в классе 15 человек, а
 * примеры среди них не должны повторяться. В помощь учителю напишите
 * программу, которая будет выводить на экран 15 случайных примеров из таблицы
 * умножения (от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 –
 * слишком просты). При этом среди 15 примеров не должно быть повторяющихся
 * (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися). */

public class Main {
    public static void main(String[] args) {
        int[][] examples = new int[15][2];
        int count = 0;

        while (count < 15) {
            int a = 2 + (int) (Math.random() * 8);
            int b = 2 + (int) (Math.random() * 8);

            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            boolean isExists = false;
            for (int i = 0; i < count; i++) {
                if (examples[i][0] == a && examples[i][1] == b) {
                    isExists = true;
                    break;
                }
            }

            if (!isExists) {
                examples[count][0] = a;
                examples[count][1] = b;
                count++;
            }
        }

        System.out.println("15 случайных примеров из таблицы умножения:");
        for (int i = 0; i < 15; i++) {
            System.out.println(examples[i][0] + " × " + examples[i][1]);
        }
    }
}

