//Program to define abstract class
package dayeight.abstraction;

//abstract class
public class Shape {
    protected float area;
    
    //abstract method 
	 abstract void calArea();
	 
	 //concrete method
	 void show()
	 {
		 System.out.println("Area of shape is "+area);
	 }
}
