package 剑指offer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class 合并两个排序的链表 {
	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(4);
		list1.add(8);
		list1.add(9);
		List<Integer> list2 = new LinkedList<>();
		list2.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(8);

		List<Integer> mergeList = merge(list1, list2);

		System.out.println(mergeList);

	}

	private static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
		if (list1 == null || list1.size() == 0) {
			return list2;
		} else if (list2 == null || list2.size() == 0) {
			return list1;
		}
		List<Integer> mergeList = new LinkedList<Integer>();
		Iterator<Integer> ite1 = list1.iterator();
		Iterator<Integer> ite2 = list2.iterator();

		Integer p1 = ite1.next();
		Integer p2 = ite2.next();

		while (ite1.hasNext() && ite2.hasNext()) {
			if (p1 < p2) {
				mergeList.add(p1);
				p1 = ite1.next();
			} else {
				mergeList.add(p2);
				p2 = ite2.next();
			}
		}

		// 结尾追加
		if (p1 < p2) {
			mergeList.add(p1);
			mergeList.add(p2);
		} else {
			mergeList.add(p2);
			mergeList.add(p1);
		}
		
		while (ite2.hasNext()) {
			mergeList.add(ite2.next());
		}
		while (ite1.hasNext()) {
			mergeList.add(ite1.next());
		}

		return mergeList;
	}

}
