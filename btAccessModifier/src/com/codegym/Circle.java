package com.codegym;

public class Circle {
    private double radius =1.0d;
    private String color="red";
    public Circle(){ }
    public Circle(double r){
        radius =r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
