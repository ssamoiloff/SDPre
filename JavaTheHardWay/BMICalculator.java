import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, feet, inches, pounds;

    System.out.print("Your height (feet only): ");
    feet = keyboard.nextDouble();

    System.out.print("Your height (inches): ");
    inches = keyboard.nextDouble();

    System.out.print("Your weight in pounds: ");
    pounds = keyboard.nextDouble();

    inches = (feet*12) + inches;
    m = inches / 39.37;
    kg = pounds / 2.205;
    bmi = kg / (m*m);

    System.out.println("Your BMI is " + bmi);
  }
}
