/*
 * Необходимо создать интерфейс "Инструмент" и реализующие его классы
 * "Гитара", "Барабан" и "Труба". Интерфейс Инструмент должен содержать метод
 * play() и переменную String KEY = "До мажор". Класс "Гитара" должен содержать
 * поле – количество струн, класс "Барабан" должен содержать поле – размер,
 * класс "Труба" должен содержать поле – диаметр. Создать массив типа
 * "Инструмент", содержащий инструменты разного типа. В цикле вызвать метод
 * play() для каждого инструмента, который должен выводить строку "Играет
 * такой-то инструмент, с такими-то характеристиками".
 */

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar(6);
        instruments[1] = new Drum(40);
        instruments[2] = new Trumpet(15.5);

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
