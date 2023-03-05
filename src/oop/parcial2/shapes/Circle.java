package oop.parcial2.shapes;

public class Circle extends Shape {

    private double radio;
    private int sides;
    public Circle(){
        super("Circulo");
    }

    public Circle(double radio){
        this();
        this.radio=radio;
        sides=1;
    }
    public double getArea(){
        return Math.PI*radio*radio;
    }

    public double getPerimeter(){
        return Math.PI * radio *2;
    }

    public int getSidesCount(){
        return sides;
    }

    /*public String getName(){
        return "Circulo";
    }*/

    public String toString()
    {
        return "○ ";
    }
}
