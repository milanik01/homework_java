package homework4;

import java.util.ArrayList;

public class Program {
    /*
a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;

b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
c. Для хранения фруктов внутри коробки можно использовать ArrayList;
d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);

e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
Можно сравнивать коробки с яблоками и апельсинами;

f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
g. Не забываем про метод добавления фрукта в коробку.

Формат сдачи: ссылка на гитхаб проект
    * */
    public static void main(String[] args) {

        ArrayList<Apple> apples = new ArrayList<Apple>(5);
        Apple apple1 = new Apple("apple1");
        Apple apple2 = new Apple("apple2");
        Apple apple3 = new Apple("apple3");
       // Apple apple4 = new Apple();
       // Apple apple5 = new Apple();

        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);
        //apples.add(apple4);
        //apples.add(apple5);


        ArrayList<Orange> oranges = new ArrayList<Orange>();
        Orange orange1 = new Orange("orange1");
        Orange orange2 = new Orange("orange2");
        //Orange orange3 = new Orange();
        //Orange orange4 = new Orange();
        //Orange orange5 = new Orange();
       // Orange orange6 = new Orange();

        oranges.add(orange1);
        oranges.add(orange2);
        // oranges.add(orange3);
        //oranges.add(orange4);
        //oranges.add(orange5);
       // oranges.add(orange6);

        ArrayList<Orange> oranges2 = new ArrayList<Orange>();
        Orange orange11 = new Orange("orange11");
        Orange orange12 = new Orange("orange12");
        Orange orange13 = new Orange("orange13");
        Orange orange14 = new Orange("orange14");
        //Orange orange15 = new Orange();
        // Orange orange16 = new Orange();

        oranges2.add(orange11);
        oranges2.add(orange12);
        oranges2.add(orange13);
        oranges2.add(orange14);

        Box<Apple> box1 = new Box<>(apples);
        Box<Orange> box2 = new Box<>(oranges);
        Box<Orange> box3 = new Box<>(oranges2);

        System.out.println(box1.getWeightBox());
        System.out.println(box2.getWeightBox());
        System.out.println(box3.getWeightBox());

        System.out.println();

        System.out.println(box1.compare(box2));
        System.out.println(box2.compare(box1));

        box2.giveAway(box3);

        System.out.println("Box1: "+box1.getWeightBox());
        System.out.println("Box2: "+box2.getWeightBox());
        System.out.println("Box3: "+box3.getWeightBox());

        box1.printBox();
        System.out.println();
        box2.printBox();
        System.out.println();
        box3.printBox();

        box2.giveAway(box3);


    }
}

