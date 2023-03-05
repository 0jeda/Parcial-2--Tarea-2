package oop.parcial2.shapes;

public class Square extends Shape {

    private double lado;

    private int sides;

    public Square(){
        super("Cuadrado");
    }

    public Square(double lado){
        this();
        this.lado=lado;
        sides=4;
    }
    public double getArea(){
        return lado*lado;
    }

    public double getPerimeter(){
        return lado*4;
    }

    /*public String getName(){
        return "Cuadrado";
    }*/

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public int getSidesCount(){
        return sides;
    }
    public String toString()
    {
        return "■ ";
    }
}
