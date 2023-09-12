package homework4;

import java.util.ArrayList;

public class Box<T extends Fruct> {

    private ArrayList<T> fructs;


    private float weightBox;

    public float getWeightBox() {

        weightBox = fructs.size() * fructs.get(0).getWeight();
        return weightBox;
    }

    public Box(ArrayList<T> fructs) {

        this.fructs = fructs;

    }

     public void add(float addBox){
        weightBox+=addBox;
     }


    public boolean compare(Box box2){
        if(this.getWeightBox()==box2.getWeightBox()) return true;
        else return  false;

    }

    public void giveAway(Box toBox){
        if(fructs.getClass()!=toBox.fructs.getClass())
            throw new IndexOutOfBoundsException();
//        for (T item:fructs) {
//
//            fructs.remove(item);
//            toBox.fructs.add(item); //Первый вариант оставляет в корзине один последний объект
//
//        }

        for (int i=0; i<fructs.size(); i++)
        {
            toBox.fructs.add(fructs.get(i)); // Второй вариант тоже оставляет в корзине последний объект
            fructs.remove(fructs.get(i));

        }



    }

    public void printBox() {


        for (T item:fructs) {
            System.out.println(item.getName());
        }
    }
}
