package exercise1;

public class TestCylinder {
    public static void main(String[] args) {
        // default radius=1.0, height=1.0
        Cylinder c1 = new Cylinder();

        // default radius=1.0, height=10.0
        Cylinder c2 = new Cylinder(10.0);

        // radius=2.0, height=10.0
        Cylinder c3 = new Cylinder(2.0, 10.0);

        // radius=3.0, height=5.0, color=blue
        Cylinder c4 = new Cylinder(3.0, 5.0, "blue");

        printCylinder("c1", c1);
        printCylinder("c2", c2);
        printCylinder("c3", c3);
        System.out.println(c4); // calls toString()
        System.out.println("c4 base area = " + c4.getBaseArea() + ", volume = " + c4.getVolume());
    }

    private static void printCylinder(String name, Cylinder c) {
        System.out.println(name + ": radius=" + c.getRadius()
                + " height=" + c.getHeight()
                + " base area=" + c.getBaseArea()
                + " surface area=" + c.getArea()
                + " volume=" + c.getVolume());
    }
}
