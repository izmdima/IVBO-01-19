abstract public class Shape {
    protected String color;
    protected boolean filled;

    Shape() {};
    Shape(String color,boolean filled) {
        this.color = color;
        this.filled = filled;
    };

    void setColor(String color) {
        this.color = color;
    }
    String getColor() {
        return color;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }

    boolean isFilled() {
        return filled;
    }



    abstract double getArea();
    abstract double getPerimetr();
    abstract public String toString();
}

