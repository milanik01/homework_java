package org.example;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat(10, "Барсик");
        Cat cat2 = new Cat(10, "Марсик");
        Cat cat3 = new Cat(10, "Дарсик");
        Cat cat4 = new Cat(10, "Карасик");
        Cat cat5 = new Cat(10, "Васька");

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);


        Dish dish = new Dish(45);
        

        dinner(cats,dish);

        dish.addVolume(40);

        System.out.println("В миске "+dish.getVolume()+" еды");

    }



    private static void dinner(ArrayList<Cat> cats, Dish dish) {

        for (Cat cat:cats) {
            if (cat.getEat() <= dish.getVolume()) {
                System.out.println("Кот "+ cat.getName() +" сыт");
                cat.setSatiety(true);
                dish.setVolume(dish.getVolume()-cat.getEat());
                //System.out.println(cat.getSatiety());
            } else {
                System.out.println("Кот "+ cat.getName() +" голоден");
            }
        }
        System.out.println("В миске "+dish.getVolume()+" еды");
    }

}