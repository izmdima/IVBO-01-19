public final class Square extends Rectangle{
    Square() {}
    Square(double side) {
        super(side,side);
    }
    Square(double side,String color,boolean filled) {
        super(side,side,color,filled);
    }

    public double getSide(){
        return getWidth();
    }
    void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    double getArea() {
        return getLength()*getLength();
    }
    double getPerimetr() {
        return (getLength()+getLength())/2;
    }
    public String toString() {
        String str;
        if (isFilled())
            str = "заполненным";
        else
            str = "незаполненным";
        return "Квадрат со стороной: " + length + " цвета: " +  color + " является: " + str;
    }
}
