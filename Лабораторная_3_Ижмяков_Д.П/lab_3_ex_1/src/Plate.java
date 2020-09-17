public class Plate extends Dish{

    Plate(){}
    Plate(String color,String company) {
        super(color,company);
    }

    void use() {
        System.out.println("Используем тарелку");
    }
}
