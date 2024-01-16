
////Write a Java program to create an interface Drawable with a method draw() that 
//takes no arguments and returns void. Create three classes Circle, Rectangle, and 
//Triangle that implement the Drawable
//interface and override the draw() method to draw their respective shapes.

package testt;

//Drawable interface

interface Drawable {
 void draw();
}


class Circle implements Drawable {

 public void draw() {
     System.out.println("Drawing a Circle");
 
 }
}

//Rectangle class 
class Rectangll implements Drawable {

 public void draw() {
     System.out.println("Drawing a Rectangle");
     
 }
}

//Triangle class 
class Triangle implements Drawable {

 public void draw() {
     System.out.println("Drawing a Triangle");
     
 }
}


public class Shapee {
 public static void main(String[] args) {
     // Create objects of Circle, Rectangle, and Triangle
     Circle circle = new Circle();
     Rectangll rectangle = new Rectangll();
     Triangle triangle = new Triangle();

     
     circle.draw();
     rectangle.draw();
     triangle.draw();
 }
}
