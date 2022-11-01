package com.company;

public abstract class Figure {
    private float x;
    private float y;

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public void getArea(){}
    public void  getPerimeter(){}
}
class Rectraingle extends Figure{
    public Rectraingle(float x, float y) {
        super(x, y);
    }
    float height;
    float width;
}
class Circle extends Figure{

    public Circle(float x, float y) {
        super(x, y);
    }
    float radius;
}
