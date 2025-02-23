public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String data) {
        String[] parts = data.split("; ");
        if (parts.length == 4) {
            this.name = parts[0];
            this.age = Integer.parseInt(parts[1]);
            this.weight = Integer.parseInt(parts[2]);
            this.height = Integer.parseInt(parts[3]);
        } else {
            throw new IllegalArgumentException("Неверный формат данных");
        }
    }

    public boolean compare(String data) {
        String[] parts = data.split("; ");
        if (parts.length != 4) {
            throw new IllegalArgumentException("Неверный формат данных");
        }
        return this.name.equals(parts[0]) &&
                this.age == Integer.parseInt(parts[1]) &&
                this.weight == Integer.parseInt(parts[2]) &&
                this.height == Integer.parseInt(parts[3]);
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Вес: " + weight);
        System.out.println("Рост: " + height);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
