package exam.copy;

public class Tree extends Countable{

	
	public Tree(String name) {
		super.name=name;
	}
	
	@Override
	public void count() {
		System.out.println(name+"가 5그루 있다.");
	}

	public void ripen() {
		System.out.println(name+"예 열매가 잘 익었다.");
	}
}//class end
