public class Outer{

	public static void staticMessage(){
		InnerStatic obj1 = new InnerStatic();
		obj1.showMessage();
	}

	public void showMessage(){

		InnerStatic obj1 = new InnerStatic();
		obj1.showMessage();

		Inner obj2 = new Inner();
		obj2.showMessage();

	}

	public static class InnerStatic{
		public void showMessage(){
			System.out.println("Hello from static Nested class");
		}
	}

	public class Inner{
		public void showMessage(){
			System.out.println("Hello from Inner Class.");
		}
	}
}