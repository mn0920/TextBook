package chapter05_Array;

import java.util.Arrays;

public class Tex8_CheckEqualityTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ary = {1,2,3,4,5,6,};
		int[] ary1 = {1,2,3,4,5,6,};
		int[] ary2 = {1,2,3,4};
		
		int[] ary3 = {1,4,2,6,3,5};
		// equals는 배열의 크기와 각각의 요소들의 순서가 똑같이 일치될때만 같은 배열로 판단을 한다.
		
		System.out.println("Is array 1 equal to array2?? " + Arrays.equals(ary, ary1));
		System.out.println("Is array 1 equal to array3?? " + Arrays.equals(ary, ary2));
		System.out.println("Is array 1 equal to array4?? " + Arrays.equals(ary, ary3));
		
//		결과
//		Is array 1 equal to array2?? true
//		Is array 1 equal to array3?? false
//		Is array 1 equal to array4?? false

		
	}

}
