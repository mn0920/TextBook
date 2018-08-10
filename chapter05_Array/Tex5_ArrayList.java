package chapter05_Array;

import java.util.ArrayList;

public class Tex5_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> objArray = new ArrayList<String>();
		objArray.clear(); // 배열 초기화 선언
		objArray.add(0, "0th element"); // 몇번째 배열, 이걸을 넣겠다.
		objArray.add(1, "1th element");
		objArray.add(2, "2th element");
		
		System.out.println("Array before removing an element"+objArray);
		
		objArray.remove(1);
		objArray.remove("0th element");
		
		System.out.println("Array after removing an element"+objArray);
	}

}
