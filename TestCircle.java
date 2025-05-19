import java.util.Scanner;

public class TestCircle {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
  System.out.print("enter a radius for the circle: ");
  double userRadius = input.nextDouble();
  
  Circle userCircle = new Circle(userRadius);
  
  
  System.out.println("the radius " + userCircle.radius + "," + " is " + userCircle.getArea());
  
   input.close();
   }
   
}

//class to get like the area and perim and set a new radius
class Circle {
   double radius;
   
   Circle() {
      radius = 1;
   }
   
   Circle(double newRadius) {
      radius = newRadius;
   }
   
   double getArea() {
      return radius * radius * Math.PI;
   }
   
   
   double getPerimeter() {
      return 2 * radius * Math.PI;
   }
   
   void setRadius(double newRadius) {
      radius = newRadius;
   }
}