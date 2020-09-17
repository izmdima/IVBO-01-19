public class MovableRectangle implements Movable{

    MovablePoint point1;
    MovablePoint point2;


    MovableRectangle(int x1, int y1,int x2, int y2, int xSpeed, int ySpeed) {
        point1 = new MovablePoint(x1,y1,xSpeed,ySpeed);
        point2 = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    MovablePoint topLeft() {
        return point1;
    }
    MovablePoint bottomRight() {
        return point2;
    }

    public String toString() {
        return "Текущая позиция точки 1 x = " + point1.x + " y = " + point1.y + "  Текущая позиция точки 2 x = " + point2.x + " y = " + point2.y;
    }

    public void moveUp() {
        point1.y += point1.ySpeed;
        point2.y += point2.ySpeed;
    }
    public void moveDown() {
        point1.y -= point1.ySpeed;
        point2.y -= point2.ySpeed;
    }
    public void moveLeft(){
        point1.x -= point1.xSpeed;
        point2.x -= point2.xSpeed;
    }
    public void moveRight(){
        point1.x += point1.xSpeed;
        point2.x += point2.xSpeed;
    }
}
