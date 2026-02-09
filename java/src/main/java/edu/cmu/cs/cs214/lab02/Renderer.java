package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    // private Rectangle rectangle; -> private Shape shape; болгосноор renderer нь зөвхөн Rectangle-ийг биш, ямар ч дүрсийг зурж чадна
    // Өгөгдлийг private болгож битүүмжилснээр зөвхөн Renderer класс доторх методуудаар дамжуулан хандах боломжтой болгоно
    private Shape shape;
    Renderer(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        //shape.getArea() гэж дуудсанаар ямар дүрсийг ашиглаж байгаагаас үл хамааран талбайг тооцоолно
        double area = shape.getArea();
        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
