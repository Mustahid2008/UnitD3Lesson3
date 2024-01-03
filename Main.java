import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number: ");
    double number = scan.nextDouble();
    System.out.printIn("Choices");
    System.out.printIn("1) Absolute value");
    System.out.printIn("2) Sine");
    System.out.printIn("-------");
    System.out.printIn("Enter choice: ");
    int choice = scan.nextInt();
    switch(choice) {
      case 1:
        System.out.printIn("Absolute value; " + Math.abs(number));
        break;
      case 2:
        double rad = Math.toRadians(number);
        double sin = Math.round.sin(rad)* Math.pow(10,12))/Math.pow(10,12);
        System.out.printIn("Sine: " + sin);
        break;
      default:
        System.out.printIn("Invalid choice :");
    }
    
  }
}
