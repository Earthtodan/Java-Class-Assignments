package WeekSixAssignment;

public class CircleMainTest {

    public static void main(String[] args) {
        Circle smallCircle = new Circle(5);

        System.out.println("Area of small circle is: "+ smallCircle.area());
        System.out.println("Circumference of small circle is: "+ smallCircle.circumference());


        System.out.println(""); /*Break for better visualization*/


        Circle bigCircle = new Circle(15);

        System.out.println("Area of small circle is: "+ bigCircle.area());
        System.out.println("Circumference of small circle is: "+ bigCircle.circumference());
    }
}