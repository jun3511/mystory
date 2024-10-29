package inheritexam;

public class ParentAnimalExam {

	public static void main(String[] args) {

		Cat cat = new Cat();
		cat.name="냥이";
		System.out.println(cat.name);
		cat.cry();
		cat.jump();
		System.out.println("==========================================");
		
		ParentAnimal[] all = {new Cat(),new Dog(),new Bird(),new Animal(),new Parrot()};
		//상속받고잇는 부모의 타입으로 여러 자식들을 묶을수있다!!!
		
		
		for(ParentAnimal a : all) {
			a.cry();
		}
		
		if(all[1] instanceof Dog ) { //부모타입인 all[1] 를 Dog(자식)타입으로 전환할수 있으면 true로 밑에 문장을 실행한다. 
			Dog dog1 = (Dog)all[1];
			dog1.run();
		}
		
		
		
	}//main end

}// class end
