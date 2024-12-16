abstract class Animal{

	protected String name;

	Animal(String name){
		this.name = name;
	}

	abstract void feed(String food);

	void greet(){
		System.out.println("Hello Java.");
	}
}

interface DanceEnable{
	void dance();
}

class Monkey extends Animal implements DanceEnable{

	Monkey(String name){
		super(name);
	}

	void feed(String food){
		System.out.println("Kwe Kwe ! Yummy!" + food);
	}

	@Override
	public void dance(){
		System.out.println("Monkey Dance!!!");
	}
}



abstract class Elephant extends Animal{

	Elephant(String name){
		super(name);
	}
	abstract void wash();

	void feed(String food){
		System.out.println("I am eating "+ food);
		System.out.println("Moor!!!!");
	}
}

class AsianElephant extends Elephant implements DanceEnable{

	AsianElephant(String name){
		super(name);
	}
	void wash(){
		System.out.println("Moor!!!!");
		System.out.println("I love water!!!Really Happy!");
	}

	public void dance(){
		System.out.println("Elephant Dance!!!");
	}
}

class AfricanElephant extends Elephant{
	AfricanElephant(String name){
		super(name);
	}

	void wash(){
		System.out.println("What did you do to me?");
		System.out.println("Ohhh! I hate water!");
	}
}

class Tiger extends Animal{
	Tiger(String name){
		super(name);
	}

	void feed(String food){
		if(food.equals("meet")){
			System.out.println("Woow!!!Yummy...");
			System.out.println("I love "+ food);
		}else{
			System.out.println("Oh! I hate "+ food);
		}
	}
}

class Zoo{
	private Animal[] animals = new Animal[10];

	boolean add(Animal animal){
		for(int i = 0 ;i<animals.length; i++){
			if(animals[i] == null){
				animals[i] = animal;
				return true;
			}
		}
		return false;
	}

	void wash(){
		for(Animal a : animals){
			if(a instanceof Elephant){
				Elephant e = (Elephant) a;
				e.wash();
				System.out.println();
			}
		}
	}

	void feed(String food){
		for(Animal a : animals){
			if(null != a){
				a.feed(food);
				System.out.println();
			}
		}
	}

	
}