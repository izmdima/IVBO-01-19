package circletest;


public class Circle {
    
    private String color;
    private int radius;
    
    Circle(String color,int radius) 
    {
        this.color = color;
        this.radius = radius;
    }
    
    public void setColor(String color) 
    {
        this.color = color;
    }
    public String getColor() 
    {
        return color;
    }
    
    public void setRadius(int radius) 
    {
        this.radius = radius;
    }
    public int getRadius() 
    {
        return radius;
    }
    
    
    
}
