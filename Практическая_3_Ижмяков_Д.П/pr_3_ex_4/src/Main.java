public class Main {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(0,0,2,2,15);
        System.out.println(circle.toString());
        System.out.println();
        circle.moveUp();
        circle.moveLeft();
        System.out.println(circle.toString());
        System.out.println();

        MovableRectangle rect = new MovableRectangle(0,0,20,20,4,4);
        System.out.println(rect.toString());
        System.out.println();
        rect.moveUp();
        rect.moveLeft();
        System.out.println(rect.toString());
        System.out.println();
    }
}
