package chapter05_Array;

import java.util.Arrays;

public class Tex4_ArrayCompare {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
		Arrays.sort(array);
		// Arrays에 sort라는 메소드가 있다는 사실을 알아야한다. api다큐먼트에
		printArray("Sorted array", array);
			
		int index = Arrays.binarySearch(array, 2);
		// api다큐먼트에 Arrays를 보면 binarySearch라는 메소드가 있다는 것도한 알아야한다.
		System.out.println("Found 2 @ "+index);
	}// end of main
	
	private static void printArray(String message, int array[]){
		System.out.println(message + ": length: " + array.length);
		for(int i = 0; i < array.length; i++){
			if(i != 0){
				System.out.print(", ");
			} // end of if
			System.out.print(array[i]);
		}// end of for
	System.out.println();
	}// end of method
}// end of class
