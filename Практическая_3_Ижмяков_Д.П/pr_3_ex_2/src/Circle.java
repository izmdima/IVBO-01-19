public class Circle extends Shape{
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;

    }

    double getArea() {
        return 3.14*radius*radius;
    }
    double getPerimetr() {
        return 2*3.14*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public String toString() {
        String str;
        if (isFilled())
            str = "заполненным";
        else
            str = "незаполненным";
        return "Круг с радиусом: " + radius + " цвета: " +  color + " является: " + str;
    }

}
