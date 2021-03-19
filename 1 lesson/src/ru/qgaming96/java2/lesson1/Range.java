package ru.qgaming96.java2.lesson1;

public class Range {
    private double from;
    private double to;
    final double EPSILON = 1.0e-10;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        if (to - from > EPSILON) {
            this.from = from;
        }
        System.out.println("Начальная точка диапазона должна быть меньше конечной ");
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        if (to - from > EPSILON) {
            this.to = to;
        }
        System.out.println("Конечная точка диапазона должна быть больше начальной ");
    }


    public double rangeLength() {

        return to - from;
    }

    public boolean isInside(double number) {
        if((number - from > EPSILON && to - number > EPSILON) || (number - from == 0) || (to - number == 0) ){
            return true;
        }else{
            return false;
        }

    }

}
