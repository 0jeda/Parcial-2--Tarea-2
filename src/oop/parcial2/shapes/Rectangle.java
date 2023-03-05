package oop.parcial2.shapes;

public class Rectangle extends Shape{

    private double base;
    private double height;

    private int sides;

    public Rectangle(){
        super("Rectangulo");
    }


    public Rectangle(double base, double height){
        this();
        this.base=base;
        sides=4;
        this.height=height;
    }
    public double getArea(){
        return base*height;
    }

    public double getPerimeter(){
        return (base*2)+(height*2);
    }

    /*public String getName(){
        return "Rectangulo";
    }*/

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSidesCount(){
        return sides;
    }

    public String toString()
    {
        return "█";
    }
}
