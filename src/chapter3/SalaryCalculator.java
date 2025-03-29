package chapter3;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
    IF Statement.
    All salespeople get a payment of $1000 a week.
    Salespeople who exceed 10 sales get an additional bonus of $250.
     */
public class SalaryCalculator {
    public static void main(String[] args) {
        // Initialize the known values
        int salary = 1000;
        int bonus = 250;

        // Get values for unknown
        System.out.println("How many sales did the employee make this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        // Quick detour for the bonus
        if (sales >10){
        salary = salary + bonus;
        }

        //Out put part
        System.out.println("The employee's pay is $" + salary);
    }

}
