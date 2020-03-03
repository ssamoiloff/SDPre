import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double a = 0;
    double b = 0;
    double sum = 0;

    System.out.println("Please enter a number:");
    a = input.nextDouble();

    System.out.println("Please enter another number:");
    b = input.nextDouble();

    sum = a + b;

    System.out.println("The sum of " + a + " + " + b + " = " + sum);
  }
}
