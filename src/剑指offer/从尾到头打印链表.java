package 剑指offer;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class 从尾到头打印链表 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		reversalPrint(list);
		
	}
	
	private static void reversalPrint(List<String> list) {
		ListIterator<String> iter = list.listIterator();
		while(iter.hasPrevious()){
			System.out.println(iter.previous());
		}
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
		}
	}
	
}
