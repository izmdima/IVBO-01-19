abstract public class Furniture {
    String color;
    int price;

    Furniture(String color,int price) {
        this.color = color;
        this.price = price;
    }
    abstract String info();
}
