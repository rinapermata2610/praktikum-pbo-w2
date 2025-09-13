package exercise1;

/**
 * The Cylinder class models a cylinder by extending Circle.
 * It demonstrates overriding getArea() to compute surface area,
 * using super.getArea() to access base area, and using super(...) in constructors.
 */
public class Cylinder extends Circle {
    private double height;

    // default constructor -> calls Circle() via super()
    public Cylinder() {
        super();       // Circle()
        height = 1.0;
    }

    // given height, default radius and color
    public Cylinder(double height) {
        super();       // Circle()
        this.height = height;
    }

    // given radius and height, default color
    public Cylinder(double radius, double height) {
        super(radius); // Circle(radius)
        this.height = height;
    }

    // given radius, height, color
    public Cylinder(double radius, double height, String color) {
        super(radius, color); // Circle(radius, color)
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    /** 
     * getBaseArea(): explicitly returns the base area (π r^2) by calling superclass method.
     * We add this helper so test code can still show base area even after overriding getArea().
     */
    public double getBaseArea() {
        return super.getArea();
    }

    /**
     * getVolume(): use the base area (from Circle) times height.
     * Important: we call super.getArea() to avoid calling the overridden getArea()
     * which returns surface area in this subclass.
     */
    public double getVolume() {
        return super.getArea() * height; // base area * height
    }

    /**
     * Override getArea() to return surface area of cylinder:
     * surface area = 2 * π * r * h + 2 * base-area
     */
    @Override
    public double getArea() {
        double r = getRadius();
        // 2π r h + 2π r^2  -> can be computed as shown
        return 2 * Math.PI * r * height + 2 * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + ", height=" + height;
    }
}
