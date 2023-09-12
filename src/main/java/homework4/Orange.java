package homework4;

public class Orange extends Fruct{

    private String name;

    public String getName() {
        return name;
    }

    private  final String title = "Апельсины";

    public String getTitle() {
        return title;
    }
    public Orange(String name) {
        super(1.5f);
        this.name = name;
    }
}
