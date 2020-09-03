package javaapplication1;


class Dog 
{
    private String name;
    private int age;
    
    Dog(int age,String name)
    {
        this.age = age;
        this.name = name;
    }
    public int GetAge() {return age;}
    public String GetName() {return name;}
    public void setAge(int age) {this.age = age;} 
    public void setName(String name) {this.name = name;}
    public int getHumanAge() {return age*7;}
    
}

class Ball 
{
    private String color;
    
    Ball(String color) 
    {
        this.color = color;
    }
    
    public void setColor(String color) {this.color = color;}
    public String getColor() { return color; }
    public void PushBall() { System.out.println("Ball is pushed");}
}

class Book 
{
    private String name;
    private int size;
    
    Book(int size,String name)
    {
        this.size = size;
        this.name = name;
    }
    public int GetSize() {return size;}
    public String GetName() {return name;}
    public void setSize(int age) {this.size = size;} 
    public void setName(String name) {this.name = name;}
    
    
}

public class JavaApplication1 {

    
    public static void main(String[] args) {
        
    }
    
}
