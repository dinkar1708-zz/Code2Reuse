
public class Interface8and9DemoJava implements MyInterface, Java8Interface, Java9Interface {

	public static void main(String[] args) {
		// interface demo
		Java8Interface java8Interface = new Java8Interface() {
		};
		java8Interface.defaultMethod();
		Java9Interface java9Interface = new Java9Interface() {
		};
		// compile time error can not call it
		java9Interface.dontExpose();
	}

	@Override
	public void display() {
		// error can not override it
		// staticMethod();
	}

	// optional to @Override ie. this is not necessary to override
	@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
		Java8Interface.super.defaultMethod();
	}

}
