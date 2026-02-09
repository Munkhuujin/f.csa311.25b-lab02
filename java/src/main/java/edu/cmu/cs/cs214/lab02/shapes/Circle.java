package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    // Өгөгдлийг private болгож битүүмжилснээр зөвхөн Circle класс доторх методуудаар дамжуулан хандах боломжтой болгоно 
    private double radius;
    // public Circle класс radius параметртэй конструктор
    public Circle(double radius) {
        // this.radius radius утгыг анхны утгаар тохируулна
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
