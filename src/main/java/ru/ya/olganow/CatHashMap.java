package ru.ya.olganow;

import java.util.*;

public class CatHashMap {
    private HashMap<String, Cat> cats;

    public CatHashMap() {
        cats = new HashMap<>();
    }

    public void addCat(Cat cat) {
        cats.put(cat.getName(), cat);
    }

    public void removeCat(String name) {
        cats.remove(name);
    }

    public void printCats() {
        for (Map.Entry<String, Cat> entry : cats.entrySet()) {
            String key = entry.getKey();
            Cat cat = entry.getValue();

            System.out.println("Имя кошки: " + key + ", Описание кошки: " + cat);
        }
    }

}
