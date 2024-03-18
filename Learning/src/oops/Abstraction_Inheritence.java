package oops;

//class1
	abstract class Shape 
	{
		abstract double calculateArea();
	}
//class2
	class Circle extends Shape {
	 private double radius;
	
	 // Constructor
	 public Circle(double radius) {
	     this.radius = radius;
	 }
	
	 @Override
	 double calculateArea() {
	     return Math.PI * radius * radius;
	 }
	}
//class3
	class Rectangle extends Shape {
	 private double length;
	 private double width;
	
	 // Constructor
	 public Rectangle(double length, double width) {
	     this.length = length;
	     this.width = width;
	 }
	 @Override
	 double calculateArea() {
	     return length * width;
	 }
	}
	
//class4
	public class Abstraction_Inheritence {
	 public static void main(String[] args) {
	     // Creating objects of Circle and Rectangle
	     Circle circle = new Circle(6);
	     Rectangle rectangle = new Rectangle(4, 6);
	
	     // Calling the calculateArea method without needing to know the implementation details
	     System.out.println("Area of Circle: " + circle.calculateArea());
	     System.out.println("Area of Rectangle: " + rectangle.calculateArea());
 }
}
