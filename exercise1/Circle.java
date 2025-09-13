package exercise1;

/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle {
    // private instance variables
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** default constructor */
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    /** construct Circle with given radius, default color */
    public Circle(double r) {
        radius = r;
        color = "red";
    }

    /** construct Circle with given radius and color */
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    // getters & setter
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /** Returns the area of this Circle instance (base area) */
    public double getArea() {
        return radius * radius * Math.PI; // π r^2
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}
