package ru.ya.olganow;

import java.util.ArrayList;


public class CatArrayList {

    private ArrayList<Cat> cats;

    public CatArrayList() {
        cats = new ArrayList<>();
    }

    public ArrayList<Cat> getCats() {
        return cats;
    }

    public void addCat(Cat cat) {
        cats.add(cat);
    }

    public void removeCat(int number) {
        if (number < cats.size()) {
            cats.remove(number);
        } else {
            System.out.println("Кошек в списке меньше чем это число");
        }
    }

    public void printCats() {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i).getName());
        }
    }
}