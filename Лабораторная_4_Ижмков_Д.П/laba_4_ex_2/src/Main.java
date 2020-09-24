public class Main {
    public static void main(String[] args) {
        Banana banana = new Banana(10,7);
        System.out.println(banana.getPrice());
        Apple apple = new Apple(15,6);
        System.out.println(apple.getPrice());
        Kiwi kiwi = new Kiwi(23,3);
        System.out.println(kiwi.getPrice());
    }
}
