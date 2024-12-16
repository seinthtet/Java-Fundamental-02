class Person{
	String name;

	Person(String name){
		this.name = name;
	}

	void greet(){
		System.out.println("Hello I am " + name);
	}

	private void doPrivate(){
		System.out.println("Private Work");
	}
}

class Student extends Person{

	Student(String name){
		super(name);
	}

	void learn(){
		System.out.println("I am Learning");
	}
}

class Teacher extends Person{}