package org.example;

public class Cat {
    private int eat;
    private String name;
    private boolean satiety = false;

    public int getEat() {
        return eat;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public Cat(int eat, String name) {
        this.eat = eat;
        this.name = name;
    }
}
