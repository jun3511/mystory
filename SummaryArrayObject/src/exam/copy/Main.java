package exam.copy;

import java.net.InterfaceAddress;

public class Main {

	public static void main(String[] args) {

		Countable[] count = {(new Brid("뻐꾸기")),(new Brid("독수리")),(new Tree("사과나무")),(new Tree("밤나무"))};
		
		//부모타입일때 메소드 출력시 부모의메소드를 출력하지만
		//오버라이딩 된 메소드는 자식의 메소드가 출력된다.
		for(Countable a : count) {
			a.count();
		}
		
		System.out.println();	
		
		//오버라이딩하지 않은 자식들만 가지고 있는 메소드를 출력하기위해 자식타입으로 변환하기!
		//자식 -> 부모 -> 자식 변환하기
		for(Countable a : count) {	
			if(a instanceof Brid) {
				Brid b1 = (Brid)a;
				b1.fly();
			}else if(a instanceof Tree) {
				Tree t1 = (Tree)a;
				t1.ripen();
			}
			
		}
		System.out.println("-------------------------------");
		
//		if(count[0] instanceof Brid brid1) {
//			brid1.fly();
//		}
//		if(count[1] instanceof Brid brid1) {
//			brid1.fly();
//		}
//		if(count[2] instanceof Tree tree1) {
//			tree1.ripen();
//		}
//		if(count[3] instanceof Tree tree1) {
//			tree1.ripen();
//		}		
		
		
	}

}
