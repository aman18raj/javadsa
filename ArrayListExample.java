import java.util.ArrayList;
import java.util.Date;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(new Loan(1000, 5.5, 2));
        list.add(new Date());
        list.add("Hello, world!");
        list.add(new Circle(5));
        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }
}

// Loan class
class Loan {
    private double amount;
    private double interestRate;
    private int years;

    public Loan(double amount, double interestRate, int years) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.years = years;
    }

    public double getAmount() {
        return amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getYears() {
        return years;
    }

    public double getTotalPayment() {
        double monthlyPayment = amount * interestRate / 1200 / (1 - 1 / Math.pow(1 + interestRate / 1200, years * 12));
        double totalPayment = monthlyPayment * years * 12;
        return totalPayment;
    }

    public String toString() {
        return "Loan amount: " + amount + ", interest rate: " + interestRate + ", years: " + years + ", total payment: " + getTotalPayment();
    }
}

// Circle class
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle radius: " + radius + ", area: " + getArea() + ", perimeter: " + getPerimeter();
    }
}