package inheritexam;

//public class Cat {
//	//필드
//	String name;
//	
//	//생성자
//	
//	//메소드
//	public void cry() {
//		System.out.println("야옹~~");
//	}
//	public void jump() {
//		System.out.println("고양이가 높이 뛴다");
//	}
//	
//}//class end
public class Cat extends ParentAnimal{
	//필드
	
	//생성자
	
	//메소드
	public void jump() {
		System.out.println("고양이가 높이 뛴다");
	}
	
	@Override
	public void cry() {
//		super.cry(); //부모의 cry를 호출 한다!
		System.out.println("냥냥~~");
	}
}//class end
