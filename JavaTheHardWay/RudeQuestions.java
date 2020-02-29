import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {
    String name, artist;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.print("How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year!");
    System.out.print("Well, thanks for ansering my rude questions, ");
    System.out.println(name + ".");

    System.out.print("One last thing, " + name + ". What is your favorite ");
    System.out.print("musical artist? ");
    artist = keyboard.next();

    System.out.println("Ah, " + artist + ". Never heard of them.");
  }
}
// 1. No, it just converts to a double.
// 2. No, it treats the input as a string.
// 3. Inputting a special character like "*" will cause an exception
//    in every question except question 1, since it accepts it as a string.
//    Every other question is expecting either an int or a double, so
//    a special character will always be invalid in this case.
