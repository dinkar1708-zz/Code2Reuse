
public interface MyInterface {

	// simple interface method as java5
	void display();

}

/*
 * FROM JDK - In addition to default methods, you can define static methods in
 * interfaces. (A static method is a method that is associated with the class in
 * which it is defined rather than with any object. Every instance of the class
 * shares its static methods.) This makes it easier for you to organize helper
 * methods in your libraries; you can keep static methods specific to an
 * interface in the same interface rather than in a separate class. The
 * following example defines a static method that retrieves a ZoneId object
 * corresponding to a time zone identifier; it uses the system default time zone
 * if there
 * 
 * 
 * Default methods enable you to add new functionality to existing interfaces
 * and ensure binary compatibility with code written for older versions of those
 * interfaces. In particular, default methods enable you to add methods that
 * accept lambda expressions as parameters to existing interfaces. This section
 * demonstrates how the Comparator interface has been enhanced with default and
 * static methods
 */
interface Java8Interface {
	// does not force client to implement this method ie. if any feature is added as
	// default then it is optional for client to implement it
	default void defaultMethod() {
		System.out.println("I am defaultMethod...");
		// can use staic method here
		staticMethod();
	}

	// added static method interface
	// can define utility type of method reusable to interfaces
	public static void staticMethod() {
		System.out.println("I am staticMethod...");
	}
}

interface Java9Interface {
	// can define private method
	// advantages - by default all methods are exposed to clients now private strict
	// this, some common and reusable code can be written here, also does not force
	// client to implement feature written in private method
	private void dontExpose() {
	}

}
