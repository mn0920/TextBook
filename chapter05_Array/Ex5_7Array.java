/*
 * Cheongju, Green Computer
 * 2018-08-09
 * 
 * Source : TextBook page 197
 * */

package chapter05_Array;

public class Ex5_7Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++){
			numArr[i] = i; // 배열을 0~9의 숫자로 초기화 한다.
			System.out.print(numArr[i]+" ");
		} // end of for
		System.out.println();
		
		for(int i=0; i<100; i++){
			int n = (int)(Math.random()*10); // 0~9 중의 한 값을 임의로 얻는다.
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
			// 위의 있는 코드는 num[0]의 값과 num[n]의 값을 서로 바꾸는 수식이다.
		} // end of for
		
		for(int i=0; i<numArr.length; i++){
			System.out.print(numArr[i]+" ");
			// 여기에 있는 i는 그냥 그 번지수를 불러오는 용도로 사용된는 것일뿐 아무 의미가 없다.
		}// end of for

	} // end of main

} // end of class
