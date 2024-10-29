package exam;

public class Brid implements Countable{
	
	String name;
	
	public Brid(String name) {
		this.name=name;
	}
	
	
	@Override
	public void count() {
		System.out.println(name+"가 2마리 있다.");
		
	}
	
	public void fly() {
		System.out.println("2마리 "+name+"가 날아간다.");
	}
	
}//class end
