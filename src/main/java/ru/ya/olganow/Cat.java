package ru.ya.olganow;

public class Cat {
    private String name;
    private int age;
    private String color;
    private double weight;

    public Cat(String name, int age, String color, double weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "{Имя: '" + name + "', возраст: " + age + ", цвет шерсти: '" + color + "', вес: " + weight + "}";
    }
}