// package зарлал нь энэ класс нь edu.cmu.cs.cs214.lab02.shapes багцад байрлаж байгааг заана
package edu.cmu.cs.cs214.lab02.shapes;
// Square класс нь Shape интерфэйсийг хэрэгжүүлдэг
public class Square implements Shape {
    // Өгөгдлийг private болгож битүүмжилснээр зөвхөн Square класс доторх методуудаар дамжуулан хандах боломжтой болгоно
    private double sideLen;
    // square конструктор нь талын уртыг параметр болгон авдаг
    public Square(double sideLen) {
        // this.sideLen талын уртыг анхны утгаар тохируулна
        this.sideLen = sideLen;
    }
    // @Override annotation нь энэ метод нь интерфэйс эсвэл эцэг классын методыг давтан тодорхойлж байгааг заана
    @Override
    // getArea метод нь талын уртыг ашиглан дөрвөлжингийн талбайг тооцоолно
    public double getArea() {
        // return талбайг тооцоолно: талын урт * талын урт
        return sideLen * sideLen;
    }
}
