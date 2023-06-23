package WeekSixAssignment;

import java.text.DecimalFormat;

public class Circle {

    private double radius;
    public Circle(int radius) {
        this.radius = radius;
    }

    public double area() {
        return sanitizeNumbers(radius * radius * Math.PI);
    }

    public double circumference() {
        return sanitizeNumbers(2 * Math.PI * radius);
    }

    public double sanitizeNumbers(double number) {
        /*Create a DecimalFormat object with the desired format pattern*/
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        /*Format the number using the DecimalFormat object*/
        String simplifiedNumber = decimalFormat.format(number);

        /*Parse the formatted string back to a double*/
        return Double.parseDouble(simplifiedNumber);
        }
}
