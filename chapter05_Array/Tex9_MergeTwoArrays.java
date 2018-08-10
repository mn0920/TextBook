package chapter05_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tex9_MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[] = {"A", "E", "I"};
		String b[] = {"O", "U", "I"};
		
		List list = new ArrayList(Arrays.asList(a));
		// Arrays의 asList
		list.addAll(Arrays.asList(b));
		// ArrayList의 addAll
		Object[] c = list.toArray();
		// 즉, Array 병합, 통합하는 메소트펑션. 그러나 중복 제거는 되지 않는다.
		
		System.out.println(Arrays.toString(c));

//		결과
//		[A, E, I, O, U, I]
		
	}

}
