/*
 * Создайте класс Car в пакете com.company.vehicles, Engine в пакете
 * com.company.details и Driver в пакете com.company.professions. Класс Driver
 * должен содержать поля – ФИО, стаж вождения. Класс Engine должен содержать
 * поля – мощность, производитель. Класс Car должен содержать поля – марка
 * автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
 * Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать:
 * "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево". А
 * также метод toString(), который выводит полную информацию об автомобиле, ее
 * водителе и моторе. Создайте производный от Car класс – Lorry (грузовой
 * автомобиль), характеризуемый также грузоподъемностью кузова. Создайте
 * производный от Car класс – SportCar, характеризуемый также предельной
 * скоростью. Класс Driver должен расширять класс Person.
 */

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.*;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Иван Иванов", 10);
        Engine engine = new Engine(250, "Toyota");
        Car car = new Car("Toyota Camry", "Седан", 1500, driver, engine);
        Lorry lorry = new Lorry("Volvo FH", "Грузовик", 8000, driver, engine, 20);
        SportCar sportCar = new SportCar("Ferrari F8", "Спорткар", 1400, driver, engine, 340);

        System.out.println(car);
        System.out.println(lorry);
        System.out.println(sportCar);

        car.start();
        car.turnLeft();
        car.stop();
    }
}
