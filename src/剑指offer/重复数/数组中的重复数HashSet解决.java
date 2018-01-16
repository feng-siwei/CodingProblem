package 剑指offer.重复数;

import java.util.HashSet;

public class 数组中的重复数HashSet解决 {
	public static void main(String[] args) {
		int [] arr ={1,2,3,6,5,3};
		System.out.println(duplicate(arr));
	}
	public static boolean duplicate(int [] arr) {
		if (arr == null ||arr.length == 0) {
			System.out.println("数组为空");
			return false;
		}	
		HashSet<Integer> intHashSet = new HashSet<>();
		for (Integer integer : arr) {
			if (!intHashSet.contains(integer)) {
				intHashSet.add(integer);
			}else {
				System.out.println("重复数为"+integer);
				return false;
			}
		}
		return true;
	}

}
