public class Bowl extends Dish{
    Bowl(){}
    Bowl(String color,String company) {
        super(color,company);
    }
    void use() {
        System.out.println("Используем миску");
    }
}
