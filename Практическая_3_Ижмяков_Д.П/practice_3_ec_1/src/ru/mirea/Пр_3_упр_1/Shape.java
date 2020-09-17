package ru.mirea.Пр_3_упр_1;

public abstract class Shape {
    protected double S;

    public abstract void calculateArea();
    public void showArea()
    {
        System.out.println(S);
    }
}
