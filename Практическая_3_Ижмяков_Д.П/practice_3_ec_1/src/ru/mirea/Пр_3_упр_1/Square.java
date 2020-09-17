package ru.mirea.Пр_3_упр_1;

public class Square extends Shape{

    private int a;

    Square(int a) {
        this.a = a;
        calculateArea();
    }

    public void calculateArea() {
        S = a * a;

    }
}
