/*       Design a base class shape with two double type values and member functions to input the data
and compute_area() for calculating area of shape. Derive two classes: triangle and rectangle. Make
compute_area() as abstract function and redefine this function in the derived class to suit their
requirements. Write a program that accepts dimensions of triangle/rectangle and display
calculated area. Implement dynamic binding for given case study.
*/

import java.util.*
abstract class Shape {
    Double a,b,r;
    Double pi=3.14;
    void input(){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter Height : ");
        a = sc.nextDouble ();
        System.out.println ("Enter Base : ");
        b = sc.nextDouble ();
 }
    void input_radius(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius: ");
        r=sc.nextDouble();
}
abstract void compute_area ();
} 
class Triangle extends Shape{
    void compute_area (){
        System.out.println ("Area of Triangle is: ");
        System.out.println (0.5 * a * b);
    } 
} 
class Rectangle extends Shape {
    void compute_area () {
        System.out.println ("Area of Rectangle is: ");
        System.out.println (a * b);
    } 
} 
class Circle extends Shape{
    void compute_area(){
        System.out.println("Area of circle is: ");
        System.out.println(2*pi*r*r);
    }
}
public class Area {
    public static void main (String[]args) 
  {
    Scanner n = new Scanner (System.in);
    System.out.println ("Enter choice to calculate Area : \n1.Triangle\n2.Rectangle\n3.Circle");
    int ch = n.nextInt ();
    if (ch == 1){
        Triangle a = new Triangle ();
        a.input ();
        a.compute_area ();
    }
    else if (ch == 2){
        Rectangle b = new Rectangle ();
        b.input ();
        b.compute_area ();
    }else if(ch==3){
        Circle c=new Circle();
        c.input_radius();
        c.compute_area();
    } else {
        System.out.println ("Invalid Choice");
    }
}
}
