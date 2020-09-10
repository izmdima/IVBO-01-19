package testball;

public class Ball {
    
    private double x = 0.0;
    private double y = 0.0;
    private int speed = 0;
    
    
    Ball(){}
    
    Ball(double x,double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public double getX() 
    {
        return x;
    }
    
    public void setX(double x) 
    {
        this.x = x;
    }
    
    public double getY() 
    {
        return y;
    }
    
    public void setY(double y) 
    {
        this.y = y;
    }   
    
    public void setXY(double x,double y) 
    {
        this.y = y;
        this.x = x;
    }
    
    public void setXYSpeed(int speed) 
    {
        this.speed = speed;
    }
    
    public void move(double xDisp,double yDisp)
    {
        x += xDisp;
        y += yDisp;
    }
    
    @Override
    public String toString() 
    {
        return "Ball@(" + x + "," + y + ")";
    }
}
