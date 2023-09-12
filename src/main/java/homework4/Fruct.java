package homework4;

public abstract class Fruct {


    private final float weight;
   // private final String title;
    private String name;
    public String getName(){return name;}
    public float getWeight() {
        return weight;
    }
   // public String getTitle(){return title;}

    public Fruct(float weight) {
        this.weight = weight;
    }
}
