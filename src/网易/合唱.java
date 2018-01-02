package 网易;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 小Q和牛博士合唱一首歌曲,这首歌曲由n个音调组成,每个音调由一个正整数表示。
	对于每个音调要么由小Q演唱要么由牛博士演唱,对于一系列音调演唱的难度等于所有相邻音调变化幅度之和,
	例如一个音调序列是8, 8, 13, 12, 那么它的难度等于|8 - 8| + |13 - 8| + |12 - 13| = 6
	(其中||表示绝对值)。
	现在要对把这n个音调分配给小Q或牛博士,让他们演唱的难度之和最小,请你算算最小的难度和是多少。
	如样例所示: 小Q选择演唱{5, 6}难度为1, 牛博士选择演唱{1, 2, 1}难度为2,难度之和为3,
	这一个是最小难度和的方案了。 
	输入描述:
	输入包括两行,第一行一个正整数n(1 ≤ n ≤ 2000) 第二行n个整数v[i](1 ≤ v[i] ≤ 10^6), 表示每个音调。
	
	
	输出描述:
	输出一个整数,表示小Q和牛博士演唱最小的难度和是多少。
	
	输入例子1:
	5
	1 5 6 2 1
	
	输出例子1:
	3
 */
public class 合唱 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String sa = in.nextLine();
		int n = 0 ;
		try {
			n = Integer.parseInt(sa);
		} catch (Exception e) {
			System.out.println("请输入有效数列的个数t(1 ≤ t ≤ 10)");
		}
		String arrString = in.nextLine();
		String[] arrStr = arrString.split(" ");
		int [] arr = new int[arrStr.length];
		for (int i = 0; i < arrStr.length; i++) {
			arr[i] = Integer.parseInt(arrStr[i]);
		}
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (a.size() == 0) {
				a.add(arr[0]);
				continue;
			}
			if (b.size() == 0) {
				try {
					if (Math.abs(a.get(a.size()-1)-arr[i]) <= Math.abs(arr[i]-arr[i+1])) {
						a.add(arr[i]);
					}else {
						b.add(arr[i]);
					}
					continue;
				} catch (Exception e) {
					// 有可能发生数字下标越界,即将最后的一个放入b中
					b.add(arr[i]);
				}
			}
			//当a,b都有值后就简单了,直接比较谁简单谁唱就ok
			if (Math.abs(a.get(a.size()-1)-arr[i]) <= Math.abs(b.get(b.size()-1)-arr[i])) {
				a.add(arr[i]);
			}else {
				b.add(arr[i]);
			}
		}
		//统计结果 
		int aNanDu = getNanDu(a);
		int bNanDu = getNanDu(b);

		System.out.println(aNanDu+bNanDu);
		
		System.out.println("a的值:");
		for (Integer integer : a) {
			System.out.print(integer+" ");
		}
		System.out.println("a的难度"+aNanDu);
		System.out.println("b的值:");
		for (Integer integer : b) {
			System.out.print(integer+" ");
		}
		System.out.println("b的难度"+bNanDu);
		
		System.out.println("把13移下来");
		a.remove(1);
		b.add(0, new Integer(13));
		System.out.println("a的值:");
		for (Integer integer : a) {
			System.out.print(integer+" ");
		}
		System.out.println("a的难度"+aNanDu);
		System.out.println("b的值:");
		for (Integer integer : b) {
			System.out.print(integer+" ");
		}
		System.out.println("b的难度"+bNanDu);
	}

	/**
	 * 得到集合合唱难度
	 * @param list 集合 
	 * @return 难度
	 */
	private static int getNanDu(List<Integer> list) {
		Integer v = list.get(0);
		int nanDu = 0;
		for (Integer integer : list) {
			nanDu += Math.abs(integer - v );
			v = integer;
		}
		return nanDu;
	}

}
