
/*
 * Cheongju, Green Computer
 * 2018-08-09
 * 배열의 복사를 위해 System.arraycopy()를 사용한다.
 * Source : TextBook page 195
 * */

package chapter05_Array;

public class Ex5_4Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);
		
		// 베열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
		char[] result = new char[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		// abc의 0번째에 있는 배열을, result의 0번째 배열로 복사. abc의 길이만큼.
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		//배열 abc을 배열 num의 첫번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		// number의 인덱스6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);

	} // end of main

} // end of class
