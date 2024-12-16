public class NestedDemo{
	public static void main(String[] args) {
		
		// Static Nested Class
		Outer.InnerStatic obj1 = new Outer.InnerStatic();
		obj1.showMessage();

		// Inner Class
		Outer.Inner obj2 = new Outer().new Inner();
		obj2.showMessage();

		Outer outer  = new Outer();
		Outer.Inner obj3 = outer.new Inner();
		obj3.showMessage();
	}
}