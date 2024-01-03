package org.example;

public class Calc {
    public int summ(int a, int b){
        int result;
        result = a + b;
        System.out.printf("Сумма %d и %d равна %d", a, b, result);
        return result;
    }
    public int summ2(int c, int d){
        int result;
        result = c - d;
        System.out.println();
        System.out.printf("Сумма %d и %d равна %d", c, d, result);
        return result;
    }
}
