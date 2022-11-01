package com.company;

public class Vector2D {
    private double vX;
    private double vY;
    public static int count=0;

    public Vector2D() {
        vX = 1;
       vY = 1;
       count++;
    }

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        count++;
    }

    public Vector2D(Vector2D original){
        vX= original.vX;
        vY=original.vY;
        count++;
    }
    public void print() {
        System.out.printf("(%.2f, %.2f)\n", this.vX, this.vY);
    }
    public  double length() {
        return Math.sqrt(this.vX * this.vX + this.vY * this.vY);
    }
    public void sub(Vector2D v){
        this.vX-=v.vX;
        this.vY-=v.vY;
    }
public void add(Vector2D v){
        this.vX+=v.vX;
        this.vY+=v.vY;
    }
public double dotProduct(Vector2D v){
        return this.vX*v.vX+this.vY*v.vY;
}
    public void normalized() {
        this.scale(1/this.length());
    }
    public void scale(double scaleFactor) {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }
}
