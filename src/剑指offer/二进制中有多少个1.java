package 剑指offer;

import java.util.Scanner;

public class 二进制中有多少个1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int count = 0;
			while (n!=0) {
				count++;
				//当n与n-1且运算,会消除最右侧的1
				n = n & (n-1);
			}
			
			//普通方法
//			int flag = 1;
//			//int类型为4字节,一字节8位,需要循环32次
//			while (flag != 0) {
//				if ((n&flag) != 0) {
//					count++;
//				}
//				flag = flag<<1;
//				System.out.printf("flag的值为%d %n", flag);
//			}
			
			System.out.println(count);
		}	
	}

}
