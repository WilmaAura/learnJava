package latihanUTS.shapeArea;

interface resizeable{
    void resize(double factor);
}

abstract class shape{
    private String color;

    // Abstract method: harus diimplementasikan oleh anak
    public abstract double calculateArea();

    public shape(String color){
        this.color = color;
    }

    public void printInfo(){
        System.out.printf("Color: %-7s | Area: %10.2f%n", color, calculateArea());
    }
    //encapsulation

    //getter
    public String getColor(){
        return color;
    }
    //setter
    public void setColor(String color){
        this.color = color;
    }
}

class circle extends shape implements resizeable{
    private double radius;

    public circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(double factor) {
        this.radius *= factor;
    }
}

class rectangle extends shape implements resizeable{
    private double width, height;
    public rectangle(String color, double widht, double height){
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea(){
        return width * height;
    }

    public void resize (double factor){
        this.width *= factor;
        this.height *= factor;
    }
}

class triangle extends shape { // Tidak implement Resizable sesuai permintaan
    private double base, height;

    public triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Main {
        
}
