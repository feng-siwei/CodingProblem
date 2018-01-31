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
		//很丑的方法,但1.7开始取消了头结点,使用两个指针指向头尾,而且构造方法中又优化,
		// if (index < (size >> 1))从头开始,else从尾开始
		ListIterator<String> iter = list.listIterator(list.size());
		
//		1.6有头指针可能成功具体需要看previous()方法的实现
//		ListIterator<String> iter = list.listIterator();
//		iter.previous();
//		
		while(iter.hasPrevious()){
			System.out.println(iter.previous());
		}
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
		}
	}
	
}
