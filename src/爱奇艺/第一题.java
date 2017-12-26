package 爱奇艺;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * 对于任意两个正整数x和k,我们定义repeat(x, k)为将x重复写k次形成的数,例如repeat(1234, 3) =
 * 123412341234,repeat(20,2) = 2020. 牛牛现在给出4个整数x1, k1, x2, k2, 其中v1 = (x1, k1),
 * v2 = (x2, k2),请你来比较v1和v2的大小。 输入描述: 输入包括一行,一行中有4个正整数x1, k1, x2, k2(1 ≤ x1,x2 ≤
 * 10^9, 1 ≤ k1,k2 ≤ 50),以空格分割
 * 
 * 
 * 输出描述: 如果v1小于v2输出"Less",v1等于v2输出"Equal",v1大于v2输出"Greater".
 * 
 * 输入例子1: 1010 3 101010 2
 * 
 * 输出例子1: Equal
 * 
 * @author 冯思伟
 */
public class 第一题 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			int x1 = in.nextInt();
            int k1 = in.nextInt();
            int x2 = in.nextInt();
            int k2 = in.nextInt();
             
            BigInteger v1 = repeat(x1,k1);
            BigInteger v2 = repeat(x2,k2);
            
            if (v1.compareTo(v2)<0) {
            	System.out.println("Less");
			}else if (v1.compareTo(v2)==0) {
				System.out.println("Equal");
			}else {
				System.out.println("Greater");
			}
           
            
		}
	}
	private static BigInteger repeat(int x,int k) {
		StringBuffer b = new StringBuffer();
        
        for (int i = 0; i < k; i++) {
			b.append(x);
		}
        //防止 k = 0 报错
        if (b.length() == 0) {
			b.append(0);
		}
        return new BigInteger(b.toString());
	}
}
