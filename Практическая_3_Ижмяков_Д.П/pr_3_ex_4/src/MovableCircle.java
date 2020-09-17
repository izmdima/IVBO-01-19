public class MovableCircle implements Movable{

    int radius;
    MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed,int radius) {
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "Текущая позиция центра круга x = " + center.x + " y = " + center.y;
    }

    public void moveUp() {
        center.y += center.ySpeed;
    }
    public void moveDown() {
        center.y -= center.ySpeed;
    }
    public void moveLeft(){
        center.x -= center.xSpeed;
    }
    public void moveRight(){
        center.x += center.xSpeed;
    }


}
