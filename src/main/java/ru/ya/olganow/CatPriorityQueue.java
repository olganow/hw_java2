package ru.ya.olganow;

import java.util.*;

public class CatPriorityQueue {
    private PriorityQueue<Cat> cats;

    public CatPriorityQueue() {
        cats = new PriorityQueue<>(Comparator.comparing(Cat::getName));
    }

    public void addCat(Cat cat) {
        cats.add(cat);
    }

    public void printCatsSortedByName() {
        List<Cat> catList = new ArrayList<>(cats);
        Collections.sort(catList, Comparator.comparing(Cat::getName));
        for (Cat cat : catList) {
            System.out.println(cat);
        }
    }

    public void printFirstBlackCat() {
        Iterator<Cat> catIterator = cats.iterator();
        if (catIterator.hasNext()) {
            do {
                Cat cat = catIterator.next();
                System.out.println(cat);
                if (cat.getColor().equals("Black")) {
                    return;
                }
            } while (catIterator.hasNext());
        }
    }
}