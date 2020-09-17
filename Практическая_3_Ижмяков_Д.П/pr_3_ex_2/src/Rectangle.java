public class Rectangle extends Shape{
    protected double width;
    protected double length;

    Rectangle() {}

    Rectangle(double width,double length) {
        this.width = width;
        this.length = length;
    }
    Rectangle(double width,double length,String color,boolean filled) {
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    double getWidth() {
        return width;
    }
    void setWidth(double width) {
        this.width = width;
    }

    double getLength() {
        return width;
    }
    void setLength(double length) {
        this.length = length;
    }



    double getArea() {
        return width*length;
    }
    double getPerimetr() {
        return (width + length)/2;
    }
    public String toString() {
        String str;
        if (isFilled())
            str = "заполненным";
        else
            str = "незаполненным";
        return "Прямоугольник с длиной: " + length + " шириной: " + width + " цвета: " +  color + " является: " + str;
    }
}
