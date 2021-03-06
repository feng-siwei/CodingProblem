package 网易;

import java.util.Scanner;

/*
	 * 小易准备去魔法王国采购魔法神器,购买魔法神器需要使用魔法币,
	 * 但是小易现在一枚魔法币都没有,但是小易有两台魔法机器可以通过投入x(x可以为0)个魔法币
	 * 产生更多的魔法币。
	魔法机器1:如果投入x个魔法币,魔法机器会将其变为2x+1个魔法币
	魔法机器2:如果投入x个魔法币,魔法机器会将其变为2x+2个魔法币
	小易采购魔法神器总共需要n个魔法币,所以小易只能通过两台魔法机器产生恰好n个魔法币,
	小易需要你帮他设计一个投入方案使他最后恰好拥有n个魔法币。 
	输入描述:
	输入包括一行,包括一个正整数n(1 ≤ n ≤ 10^9),表示小易需要的魔法币数量。
	
	
	输出描述:
	输出一个字符串,每个字符表示该次小易选取投入的魔法机器。其中只包含字符'1'和'2'。
	
	输入例子1:
	10
	
	输出例子1:
	122
 */
public class 魔法币 {
//	方法一,二进制替代法,效率最高
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int a = in.nextInt();
			String sa = Integer.toBinaryString(a+1);
			sa = sa.substring(1, sa.length());
			sa = sa.replace('1', '2');
			sa = sa.replace('0', '1');
			System.out.println(sa);
		}
		
	}
//	方法二,反向递归法
	public static void two(String[] args) {
		Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();
        int b = sc.nextInt();
        while (b > 0) {
            if (b % 2 == 0) {
                sb.append("2");
                b = (b - 2) / 2;
            } else {
                sb.append("1");
                b = (b - 1) / 2;
            }
        }
        char[] arrc = sb.toString().toCharArray();
        for (int i = sb.length() - 1; i >= 0; i--) {
            sb1.append(arrc[i]);
        }
 
        System.out.println(sb1);
		
	}
}
