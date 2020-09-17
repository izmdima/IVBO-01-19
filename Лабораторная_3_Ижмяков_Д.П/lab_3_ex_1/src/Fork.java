public class Fork extends Dish{

    Fork(){}
    Fork(String color,String company) {
        super(color,company);
    }

    void use() {
        System.out.println("Используем вилку");
    }

}
