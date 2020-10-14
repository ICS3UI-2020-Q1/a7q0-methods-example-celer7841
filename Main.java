import java.util.Scanner;

/*
* Method example file
 * @author celer7841
 */
public class Main {

// calculates the area of a rectangle given the length and width
  public static double areaOfRect( double length, double width){
    // calculating the area of the rectangle
    double area = length * width;
    // returning the answer
    return area;
  }   

 public static void sayHello(){
   System.out.println("Hello World");
 }

 public static void sayHello(String name){
   System.out.println("Hello World " + name );
 }
  
  
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double l = input.nextDouble();
    double w = input.nextDouble();
    double area = areaOfRect(l,w);
    System.out.println(area);
    String name = "Steve";
    sayHello();
    sayHello(name);
    sayHello("celer7841"); 

  }
}
