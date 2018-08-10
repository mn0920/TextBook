package chapter05_Array;

import java.util.ArrayList;
import java.util.Collections;

public class Tex1_ReversionArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		
		System.out.println("Before Reverse Order: " + arrayList);
		Collections.reverse(arrayList);
		System.out.println("After Reverse Order: "+ arrayList);
		
//		String str = "I am Min A";
//		Collections.reverse(str);
//		System.out.println("After Reverse Order: "+ arrayList);
//		이것은 되지 않습니다. String과는 맞지 않습니다. 엉엉
		
	} // end of main
} // end of class
