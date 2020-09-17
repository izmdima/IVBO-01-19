abstract public class Dog {
    protected String color;
    protected String name;

    Dog(String color,String name) {
        this.color = color;
        this.name = name;
    }

    void bite() {
        System.out.println("Покусать");
    }
}
