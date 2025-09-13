package exercise2;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape("red", false);
        System.out.println(s1);

        Circle c1 = new Circle(2.5, "blue", true);
        System.out.println(c1);
        System.out.println("Area = " + c1.getArea() + ", Perimeter = " + c1.getPerimeter());

        Rectangle r1 = new Rectangle(2.0, 4.0, "yellow", true);
        System.out.println(r1);
        System.out.println("Area = " + r1.getArea() + ", Perimeter = " + r1.getPerimeter());

        Square sq1 = new Square(5.0, "black", true);
        System.out.println(sq1);
        System.out.println("Area = " + sq1.getArea() + ", Perimeter = " + sq1.getPerimeter());
    }
}
