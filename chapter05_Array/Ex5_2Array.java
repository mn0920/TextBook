package chapter05_Array;

import java.util.*; //Arrays.toString()을 사용하기 위한 준비

/*
 * Cheonju Green Computer, 2018-08-09
 * Array Output with Arrays.toString()
 * Arrays.toString() 메소드를 이용하여 배열 요소 출력하기
 * Source : TextBook page 191
 * */

public class Ex5_2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr1 = new int[10]; // 배열 선언만
		int[] iArr2 = new int[10]; // 배열 선언만
		int[] iArr3 = {100, 95, 80, 70, 60}; // 선언 및 초기화
		char[] chArr = {'a', 'b', 'c', 'd'}; //선언 및 초기화
		
		// 배열 초기화 하는 또 다른 방법 ... for loop(for구문)을 이용 값 대입
		// 배열참조변수.length : 배열의 크기
		for(int i = 0; i < iArr1.length; i++){
			iArr1[i] = i + 1; //1~10의 숫자를 배열에 대입
		} // end of for
		for(int i = 0; i < iArr2.length; i++){
			iArr2[i] = (int)(Math.random()*10)+1;
			// random()함수는 0.0 > 1.0 이렇게 발생이 된다. 그래서 만약 내가 1부터 10까지 하고 싶으면
			// 곱하기 10을 해주고 1을 더하는 것이다. +1을 하지 않는다면 0~9의 수가 나온다.
			// 만약 100까지의 수를 하고 싶다면 곱하기 100 +1.
		} // end of for
		
		// 배열에 저잔된 값을 출력한다. - 가장 원시적인 방법
		// 배열 요소를 하나씩 모두 출력
		for(int i=0; i< iArr1.length; i++){
			System.out.print(iArr1[i]+" ");
		} // end of for
		System.out.println();
		
		// println()의 패러미터로 Arrays.toString()을 사용
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		
		// println()의 패러미터로 배열참조변수를 직접 사용
		System.out.println(iArr3);
		System.out.println(chArr);

	} // end of main

} // end of class
