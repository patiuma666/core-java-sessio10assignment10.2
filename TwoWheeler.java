/*
 * If we use fully qualified name then only we can declare  the class of this package will be 
 * accessible.
 * here there is no need to import. but we have to use fully qualified name every time when  access the class or interface
 * It is generally used when two packages have same class name e.g. java.util and java.sql packages contain Date class.
 */
package mypack3;//here i have created another package called mypack3

public class TwoWheeler {         //created main class  name as TwoWheeler

	public static void main(String[] args) { //created main method
		System.out.println("The Properties of a two wheeler are :");     //prints the properties of a bike 
		
		packagesdemo.Bike bike = new packagesdemo.Bike(); //here created fully qualified name to access the object of the class Bike from package as packagesdemo
              
		bike.gears();  //displays the get methods for the objects provided
		bike.milage();
		bike.speed();
		bike.model();
		
	}

}
