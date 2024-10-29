package arraylist;

public class ArrayExam1 {

	public static void main(String[] args) {
		
//		Book[] aBook = new Book[5];
//		
//		for(Book a : aBook) {
//			System.out.println(a);
//		}
//		System.out.println();
//		
//		aBook[0] = new Book("상록수","홍기동");
//		aBook[1] = new Book("노인과바다","헤밍웨이");
//		aBook[2] = new Book("소년이온다","한강");
		
		Book[] book = {new Book("상록수","김훈"),
						new Book("노인과바다","헤밍웨이"),
						new Book("토지","박경리"),
						new Book("남한산성","김훈"),
						new Book("태백산맥","조정래")
						};
		
				for(Book b : book) {
//					System.out.println(b.toString());
					System.out.println(b); //프린트의 기본으로 to스트링을 호출한다!!!
				}
		
				System.out.println("------------------------------------");
		//book 배열의 공간을 추가하고싶을때는
//				1.새로운 배열을 만들어야한다
				Book[] book1 = new Book[7];
//				2.새로운 배열에 기존에 복사할 배열을 붙혀넣기해야한다. System.arraycopy();메소드사용
//				System.arraycopy(복사할배열명, 복사시작할인덱스번호, 복사를붙힐배열명, 붙히기시작할인덱스번호, 복사할 개수);
				System.arraycopy(book, 0, book1, 0, 5);
				
//				3.새로운 배열에 추가할 배열의값을 준다.
				book1[5]=new Book("어린왕자","생택쥐베리");
		
//				4.출력해서 확인해보기.
				for(Book b : book1) {
					System.out.println(b);
				}
				
	}// main end

}//class end
