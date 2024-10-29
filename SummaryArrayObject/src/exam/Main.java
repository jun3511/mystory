package exam;

import java.net.InterfaceAddress;

public class Main {

	public static void main(String[] args) {

		Countable[] count = {(new Brid("뻐꾸기")),(new Brid("독수리")),(new Tree("사과나무")),(new Tree("밤나무"))};
		
		for(Countable a : count) {
			a.count();
		}
		
		System.out.println("-------------------------------");
		
		if(count[0] instanceof Brid brid1) {
			brid1.fly();
		}
		if(count[1] instanceof Brid brid1) {
			brid1.fly();
		}
		if(count[2] instanceof Tree tree1) {
			tree1.ripen();
		}
		if(count[3] instanceof Tree tree1) {
			tree1.ripen();
		}
		
		
		
	}

}
