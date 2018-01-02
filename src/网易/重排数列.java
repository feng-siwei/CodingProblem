package 网易;

import java.util.Scanner;

/**
 * 小易有一个长度为N的正整数数列A = {A[1], A[2], A[3]..., A[N]}。
	牛博士给小易出了一个难题:
	对数列A进行重新排列,使数列A满足所有的A[i] * A[i + 1](1 ≤ i ≤ N - 1)都是4的倍数。
	小易现在需要判断一个数列是否可以重排之后满足牛博士的要求。 
	输入描述:
	输入的第一行为数列的个数t(1 ≤ t ≤ 10),
	接下来每两行描述一个数列A,第一行为数列长度n(1 ≤ n ≤ 10^5)
	第二行为n个正整数A[i](1 ≤ A[i] ≤ 10^9)
	
	
	输出描述:
	对于每个数列输出一行表示是否可以满足牛博士要求,如果可以输出Yes,否则输出No。
	
	输入例子1:
	2
	3
	1 10 100
	4
	1 2 3 4
	
	输出例子1:
	Yes
	No
	
	800 924 708 872 632 718 270 806 14 606 208 380 896 664 71 963 952 169 612 251 336 720 528
 *
 */
public class 重排数列 {
	public static void main(String[] args) {
		//思路分析:找被4整除的, 计数1, 找到被2整除的计数0.5 如果n/2>计数 则no n/2<计数 则yes,
		Scanner in = new Scanner(System.in);
		String sa = in.nextLine();
		int t = 0 ;
		try {
			t = Integer.parseInt(sa);
		} catch (Exception e) {
			System.out.println("请输入有效数列的个数t(1 ≤ t ≤ 10)");
		}
		
		for (int i = 0; i < t; i++) {
			String nString = in.nextLine();
			int n = Integer.parseInt(nString);
			//如果n=1 ,数列A长度为1 不存在A[i + 1],所以输出no
			/*
			但貌似题不是这么想的测试用例
			1
			494
			测试是通过的输出yes
			if (n == 1) {
				System.out.println("No");
				//将下一排数据读取
				in.nextLine();
				continue; 
			}
			*/
			String AString = in.nextLine();
			String[] As = AString.split(" ");
			double count = 0;
			for (String string : As) {
				int a = Integer.parseInt(string);
				if (a % 4 == 0) {
					count ++;
				}else if (a % 2 == 0) {
					count  += 0.5; 
				}
			}
			if (n/2>count) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
			
		}

	}

}
