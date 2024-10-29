package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam2 {
	
	public static void main(String[] args) {

//		문자열을 담을때는
//		List<String> book = new ArrayList<String>();
//		book.add("홍길동");
//		정수름 담을때는
//		List<int> book = new ArrayList<int>();
//		book.add(10);
//		그렇다면 객체를 담을때는? 내가 리스트에 담고싶은 객체의 클래스 타입에 맞게 !!! 타입을 주어야한다.!!!
//		List<Book> book = new ArrayList<Book>();  //Book 타입의 객체를 담고 싶기때문에 Book타입을 주어야한다!!!
	
		List<Book> book = new ArrayList<Book>();
		
		book.add(new Book("상록수","김훈"));
		book.add(new Book("노인과바다","헤밍웨이"));
		book.add(new Book("토지","박경리"));
		
		for(Book b : book) {
			System.out.println(b);
		}
		
		book.remove(1);
		System.out.println("===========수정하기전과후==========");
		for(Book b : book) {
			System.out.println(b);
		}
		
		book.add(0,new Book("소년이온다","한강"));
		System.out.println("===========수정하기전과후==========");
		for(Book b : book) {
			System.out.println(b);
		}//ArrayList는 추가 삭제가 매우매우 용이한다!!!
		
		book.clear();//배열의 모든요소를 삭제!!!
		System.out.println("===========수정하기전과후==========");
		for(Book b : book) {
			System.out.println(b);
		}
		
		
		
	}// main end

}// class end
