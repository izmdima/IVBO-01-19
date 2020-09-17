package ru.mirea.Пр_3_упр_1;

public class Triangle extends Shape{

    Triangle(int side,int height) {
        S = 0.5*side*height;
    }
    Triangle(int side1, int side2, int sina) {
        S = (1/2)*side1*side2*sina;
    }
    Triangle(int side1,int side2,int side3,int radius) {
        int p = (side1+side2+side3)/2;
        S = p*radius;
    }
//    Triangle(int side1,int side2,int side3) {
//        int p = (side1+side2+side3)/2;
//
//    }

    public void calculateArea() {

    }
}
