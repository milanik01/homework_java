package homework4;

public class Apple extends Fruct{

    private String name;

    public String getName() {
        return name;
    }
//  private  final String title = "Яблоки";

//    public  String getTitle() {
//        return title;
//    }

    public Apple(String name) {
        super(1f);
        this.name = name;
    }
}
