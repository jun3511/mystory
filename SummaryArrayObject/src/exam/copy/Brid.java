package exam.copy;

public class Brid extends Countable{
	
	
	public Brid(String name) {
		super.name=name;
	}
	
	@Override
	public void count() {
		System.out.println(name+"가 2마리 있다.");
		
	}
	
	public void fly() {
		System.out.println("2마리 "+name+"가 날아간다.");
	}
	
}//class end
