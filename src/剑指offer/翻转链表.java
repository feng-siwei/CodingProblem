package 剑指offer;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class 翻转链表 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		LinkedList<String>rLL = reversLinkedList(list);
		
		for (String string : rLL) {
			System.out.println(string);
		}
		
	}
	
	private static LinkedList<String> reversLinkedList(List<String> list) {
		ListIterator<String> iter = list.listIterator(list.size());
		LinkedList<String> reversLinkedList = new LinkedList<>();
		while(iter.hasPrevious()){
			reversLinkedList.add(iter.previous());
		}
		return reversLinkedList;
	}
}
