import java.util.Scanner;
public class HelloWorld {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);  
    String name;
    System.out.println("My name is Patrick");
    System.out.println("What is yours?");
    name = in.nextLine();
    System.out.println("Your name is "+name);
  }
}
