package testball;

public class TestBall {


    public static void main(String[] args) {
        
        Ball ball = new Ball();
        ball.setX(16.95);
        ball.setY(25.19);
        ball.setXYSpeed(20);
        ball.move(20,20);
    
        System.out.println(ball.toString());
    }
    
}
