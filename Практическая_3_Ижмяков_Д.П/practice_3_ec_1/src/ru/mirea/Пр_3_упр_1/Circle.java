package ru.mirea.Пр_3_упр_1;

public class Circle extends Shape{

    double R;

    Circle(int R) {
        this.R = R;
        calculateArea();
    }

    public void calculateArea(){
        S = 3.14 * R*R;
    }
}
