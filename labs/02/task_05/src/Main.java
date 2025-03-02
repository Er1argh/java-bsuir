/*
 * Создайте объекты класса Double, используя методы valueOf().
 * Преобразуйте значение типа String к типу double, используя метод
 * Double.parseDouble(). Преобразуйте объект класса Double ко всем примитивным
 * типам. Выведите значение объекта Double на консоль. Преобразуйте литерал
 * типа double к строке: String d = Double.toString(3.14).
 */

public class Main {
    public static void main(String[] args) {
        Double d1 = Double.valueOf(10.5);
        Double d2 = Double.valueOf("20.5");

        String str = "30.5";
        double d3 = Double.parseDouble(str);

        double primitiveDouble = d1.doubleValue();
        float primitiveFloat = d1.floatValue();
        int primitiveInt = d1.intValue();
        long primitiveLong = d1.longValue();
        short primitiveShort = d1.shortValue();
        byte primitiveByte = d1.byteValue();

        System.out.println("Double object d1: " + d1);
        System.out.println("Double object d2: " + d2);
        System.out.println("Parsed double d3: " + d3);

        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Primitive float: " + primitiveFloat);
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Primitive long: " + primitiveLong);
        System.out.println("Primitive short: " + primitiveShort);
        System.out.println("Primitive byte: " + primitiveByte);

        String dString = Double.toString(3.14);
        System.out.println("String representation of 3.14: " + dString);
    }
}
