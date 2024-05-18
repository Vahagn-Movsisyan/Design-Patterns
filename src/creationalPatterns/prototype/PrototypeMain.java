package creationalPatterns.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Shape circle1 = new Circle(10, 15, 5);
        Shape circle2 = circle1.clone();

        System.out.println("Original circle:");
        circle1.draw();

        System.out.println("\nCloned circle:");
        circle2.draw();

        Rectangle rectangle1 = new Rectangle(20, 30, 40, 50);
        Rectangle rectangle2 = (Rectangle) rectangle1.clone();

        System.out.println("\nOriginal rectangle:");
        rectangle1.draw();

        System.out.println("\nCloned rectangle:");
        rectangle2.draw();

    }
}
