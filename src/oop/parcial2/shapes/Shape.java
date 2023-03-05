package oop.parcial2.shapes;

public abstract class Shape {

    protected String name;
    public abstract double getArea();


    public abstract double getPerimeter();

    public abstract int getSidesCount();

    public Shape(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public abstract String toString();
}
