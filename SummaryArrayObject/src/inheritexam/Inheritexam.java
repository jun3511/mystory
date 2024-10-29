package inheritexam;

public class Inheritexam {

	public static void main(String[] args) {

		Animal ani = new Animal();
		ani.cry();
		ani.name="동물";
		System.out.println(ani.name);
		
		System.out.println();
		
		Dog dog = new Dog();
		dog.cry();
		dog.run();
		dog.name="멍멍이";
		System.out.println(dog.name);
		
		System.out.println();
		
		Cat cat = new Cat();
		cat.name="냐옹이";
		System.out.println(cat.name);
		cat.cry();
		cat.jump();
		
		
		
	}// main end

}// class end
