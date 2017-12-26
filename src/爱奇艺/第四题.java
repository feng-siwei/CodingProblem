package 爱奇艺;

import java.util.Scanner;

/*
 * 牛牛有一个长度为n的整数序列,牛牛想对这个序列进行重排为一个非严格升序序列。
 * 牛牛比较懒惰,他想移动尽量少的数就完成重排,请你帮他计算一下他最少需要移动多少个序列中的元素。
 * (当一个元素不在它原来所在的位置,这个元素就是被移动了的) 
 * 
	输入描述:
	输入包括两行,第一行一个整数n(1 ≤ n ≤ 50),即序列的长度
	第二行n个整数x[i](1 ≤ x[i] ≤ 100),即序列中的每个数
	
	
	输出描述:
	输出一个整数,即最少需要移动的元素个数
	
	输入例子1:
	3
	3 2 1
	
	输出例子1:
	2
	
 */
public class 第四题 {
	public static void main(String[] args) {
		//思路至少移动,就是每一次都要找准位置,使用比较排序法
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int length = scanner.nextInt();
			int []n
			
			
			String string =scanner.nextLine();
			System.out.println("这是string的内容"+string);
			String[] strings = string.split(" ");
			for (String string2 : strings) {
				System.out.println(string2);
			}
		}
	}
}
