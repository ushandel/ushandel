package chapter6;
import java.util.Scanner;

/*
 * Write a class that creates instances of the `Rectangle` class to find the
 * total area of two rooms in a house.
 */
public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HomeAreaCalculatorRedo homeAreaCalculatorRedo = new HomeAreaCalculatorRedo();
        Rectangle kitchen = homeAreaCalculatorRedo.getRoom ();
        Rectangle barthroom = homeAreaCalculatorRedo.getRoom ();

        double area = homeAreaCalculatorRedo.calculateTotalArea(kitchen,barthroom);

        System.out.println("Total area is"+ area);
        homeAreaCalculatorRedo.scanner.close();
    }

    public Rectangle getRoom(){

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();


        return new Rectangle(length,width);
        
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
}
}
