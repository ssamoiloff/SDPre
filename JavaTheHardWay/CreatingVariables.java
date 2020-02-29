public class CreatingVariables {
  public static void main(String[] args) {
    int x, y, age, totalFests;
    double seconds, e, checking, cost;
    String firstName, lastName, title, fest1, fest2;

    x = 10;
    y = 400;
    age = 39;
    totalFests = 2;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    cost = 650.48;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr. ";
    fest1 = "Parookaville";
    fest2 = "Let It Roll";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The experiment took " + seconds + " seconds.");
    System.out.println("A favorite irrational # is Euler's number: " + e);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name's " + title + " " + firstName + lastName);
    System.out.println();
    System.out.print("Last year I went to 4 music festivals. ");
    System.out.print("My " + totalFests + " favorites were " + fest1 + " ");
    System.out.print("and " + fest2 + ". Although the $" + cost + " total cost ");
    System.out.println("was steep, it was worth it.");
  }
}
