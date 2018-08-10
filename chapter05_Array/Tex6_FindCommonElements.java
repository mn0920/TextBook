package chapter05_Array;

import java.util.ArrayList;

public class Tex6_FindCommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> objArray = new ArrayList<String>();
		ArrayList <String> objArray2 = new ArrayList<String>();
		
		objArray2.add(0, "common1");
		objArray2.add(1, "common2");
		objArray2.add(2, "notcommon0");
		objArray2.add(3, "notcommon1");

		objArray.add(0, "common1");
		objArray.add(1, "common2");
		objArray.add(2, "notcommon2");
		
		System.out.println("Array elements of Array1"+objArray);
		System.out.println("Array elements of Array2"+objArray2);
		
		objArray.retainAll(objArray2);
		// retainAll : objArray의 객체를 남겨라. 그러나 objArray2 중에서 공통된것만 남기고 나머지는 없애라.
		// 양쪽 배열에 공통적으로 포함되있는 것만을 뽑고 싶을 때, retainAll이라는 메소드펑션을 사용하는 것이다.
		
		System.out.println("Array1 after retaining common elements of Array1 & Array2"+objArray);

//		결과
//		Array elements of Array1[common1, common2, notcommon2]
//		Array elements of Array2[common1, common2, notcommon0, notcommon1]
//		Array1 after retaining common elements of Array1 & Array2[common1, common2]
		
		
	}// end of main

}// end of class
