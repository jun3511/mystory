package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {

//		//String[] array = new String[5];
//		String[] array = {"사과","포도","딸기","복숭아","수박"};
//		System.out.println(Arrays.toString(array));
//		//포도를 삭제 하려면
//		//배열은 삭제 불가
////		array[1] = null;
////		System.out.println(Arrays.toString(array));
//		for(int i=1; i<array.length-1; i++) {//랭스에 -1을 안하면 java.lang.ArrayIndexOutOfBoundsException
//			array[i] = array[i+1];			 // 예외발생 배열을 공간보다 더큰배열의값을 요청했을때 발생
//		}
//		array[array.length-1]=null;
//		System.out.println(Arrays.toString(array));
/*
 	ArrayList :
 		동적(추가삭제가 자유롭다.)으로 배열을 처리
 		배열의 추가하거나 삭제가 자유롭다.
 		index로 관리, 순서
 		
 		add(추가할요소) : 추가
 		size() : 크기, 배열-length , 문자열-length()
 		remove(제거할 인덱스) : 인덱스 위치의 요소 값을 제거
 		isEmpty() : 배열이 비어 있는지 확인
 		get(읽어올 요소의 인덱스) : 배열의 인덱스 위치의 요소 값을 반환(읽어온다)
 */
		
//		List<String> arrayList = new ArrayList();
		ArrayList<String> fruit = new ArrayList();
//		for(String fr : fruit) {
//			System.out.println(fr);
//		} 요소가 아무것도 없어서 안나온다.
		
		fruit.add("사과");
		fruit.add("딸기");
		fruit.add("복숭아");
		fruit.add("수박");
		
		for(String fr : fruit) {
			System.out.println(fr);
		}
		
		System.out.println();
		
		for(int i=0; i<fruit.size(); i++) {
			//System.out.println(fruit[i]);
			System.out.print(fruit.get(i)+" ");
		}
		
		System.out.println();
		System.out.println(fruit.get(1));
		fruit.remove(1);//1번 요소의 내용은 제거하고 //2번째부터 마지막 요소의 내용이 1칸씩 앞으로 이동
		System.out.println();
		System.out.println(fruit.get(1));
		fruit.add(1, "오렌지");//1번째에 요소를 추가하고 추가된 번째부터 마지막까지 요소들이 1칸씩 뒤로 이동
		
		for(int i=0; i<fruit.size(); i++) {
			//System.out.println(fruit[i]);
			System.out.print(fruit.get(i)+" ");
		}
	}// main end

}// class end
