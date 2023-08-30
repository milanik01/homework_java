package org.example;

public class Dish {

    private int volume;
    private int addVolume;


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public  void addVolume(int addVolume){
        volume = volume + addVolume;
    }
    public Dish(int volume) {
        this.volume = volume;
    }
}
