package 剑指offer;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class 双指针 {
	public static void main(String[] args) {
		List<Integer> intList = new LinkedList<>();
		
		
		for (int i = 0; i < 100; i++) {
			intList.add(i);		
		}
		
		
		
		
		ListIterator<Integer> iterator =intList.listIterator();
		ListIterator<Integer> iterator2 = intList.listIterator();
		
		for (int i = 0; i < 3; i++) {
			iterator.next();
		}
		
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println("这是第一个迭代器"+integer);
			Integer integer2 = (Integer) iterator2.next();
			System.out.println("这是第二个迭代器"+integer2);
		}
		
		
	}
}
