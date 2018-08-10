package chapter05_Array;

import java.util.ArrayList;

public class Tex7_FindAmObjectInArray {

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

		System.out.println("Array elements of Array1"+objArray);
		System.out.println("Array elements of Array2"+objArray2);
		System.out.println("Array1 contains String common2?? "+objArray.contains("common1"));
		System.out.println("Array2 contains String common1?? "+objArray2.contains(objArray));

//		결과
//		Array elements of Array1[common1, common2]
//		Array elements of Array2[common1, common2, notcommon0, notcommon1]
//		Array1 contains String common2?? true
//		Array2 contains String common1?? false
		
		
	}

}
