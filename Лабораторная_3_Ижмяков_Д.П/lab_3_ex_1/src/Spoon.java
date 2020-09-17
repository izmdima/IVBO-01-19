public class Spoon extends Dish{
    Spoon(){}
    Spoon(String color,String company) {
        super(color,company);
    }

    void use() {
        System.out.println("Используем ложку");
    }
}
