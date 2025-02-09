package ru.ya.olganow;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class CatLinkedList {

    private LinkedList<Cat> cats;

    public CatLinkedList() {
        cats = new LinkedList<>();
    }

    public LinkedList<Cat> getCats() {
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

    public void printCatsSortedByWeight() {
        Collections.sort(cats, Comparator.comparing(Cat::getWeight));
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public void printCatsListWithWhile() {

        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
            Cat cat = iterator.next();
            System.out.println(cat);

        }
    }
}
