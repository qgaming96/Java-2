package ru.qgaming96.java2.lesson1;

public class Main {
    public static void main(String[] args) {
        Range ab = new Range(-5.562, 10.284);
        double from = ab.getFrom();
        System.out.println(from);
        boolean condition = ab.isInside(-5.5619);
        System.out.println(condition);
        double length = ab.rangeLength();
        System.out.println(length);
    }
}