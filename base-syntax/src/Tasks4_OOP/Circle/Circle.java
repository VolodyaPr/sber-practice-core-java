package Tasks4_OOP.Circle;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Круг{" +
                "радиус = " + radius +
                ", цвет = '" + color + "' " +
                ", площадь = " + area() +
                ", периметр = " + perimeter() +
                '}';
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0, "Red");
        Circle circle2 = new Circle(3.5, "Blue");

        System.out.println(circle1);
        System.out.println(circle2);
    }
}