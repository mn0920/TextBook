package chapter05_Array;

public class Tex2_LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 선형 탐색 방법이다.
		// 몇번째 배열에 내가 찾고자 하는 것이 담겨져 있는지 사용하는 것 : target		
		int[] a = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
		int target = 0;
			
		for(int i=0; i<a.length; i++){
			if(a[i] == target){
				System.out.println("Element found at index: "+i);
				break;
			}// end of if
		}// end of for

		
		
		// 바이너리 탐색 방법
		// 처음 수와 끝의 수의 중간을 내 타겟과 비교하여 크거나 작으면 다시 그 가운데를 집어서 비교
		int[] b = {3, 5, 6, 7, 8, 9, 10, 11, 13, 15};
		int low = 0;
		int high = 9;
		int target1 = 13;
		
		while(true){
			int mid = (int)(low + high)/2;
			System.out.println("low : " + low + " mid : " + mid + " high : " + high);
			System.out.println("low : " + b[low] + " mid : " + b[mid] + " high : " + b[high]);
			
			if(target1 == b[mid]){
				System.out.println("I found : "+b[mid]);
				System.out.println("값을 찾았습니다..");
				break;
			}else if(target1 >= b[mid]){
				low = mid;
				System.out.println("비교값 " + b[mid] + "이 찾으려는 값보다 작다 : ");
			}else if(target1 <= b[mid]){
				high = mid;
				System.out.println("비교값 " + b[mid] + " 이 찾으려는 값보다 크다 : ");
			} // end of if
			
		} // end of while

		
	} // end of main

} // end of class
