package 网易;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 一个由小写字母组成的字符串可以看成一些同一字母的最大碎片组成的。
 * 例如,"aaabbaaac"是由下面碎片组成的:'aaa','bb','c'。
 * 牛牛现在给定一个字符串,请你帮助计算这个字符串的所有碎片的平均长度是多少。

	输入描述:
	输入包括一个字符串s,字符串s的长度length(1 ≤ length ≤ 50),s只含小写字母('a'-'z')
	
	
	输出描述:
	输出一个整数,表示所有碎片的平均长度,四舍五入保留两位小数。
	
	如样例所示: s = "aaabbaaac"
	所有碎片的平均长度 = (3 + 2 + 3 + 1) / 4 = 2.25
	
	输入例子1:
	aaabbaaac
	
	输出例子1:
	2.25
 */

public class 字符串碎片 {
//	方法一,垃圾的简单方法
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String sa = in.nextLine();
			char [] chars =  sa.toCharArray();
			char before = chars[0];
			char after  = '\0';
			int count = 0;
			List<Integer> counts = new ArrayList<Integer>();
			for (int i = 0; i < chars.length; i++) {
				after = chars[i];
				if (before == after) {
					count++;
					continue;
				}
				counts.add(count);
				count = 1 ;
					
				before = after;
			}
			//将最后一位统计收入
			counts.add(count);
			int sum = 0; 
			for (Integer integer : counts) {
				sum += integer;
			}
			System.out.println(String.format("%.2f", (double)sum/counts.size()));
		}
	}
//	方法二 思路，用字符串长度除以去重字符串长度。去重用正则,效率高
//	此处就单独写一个去除连续重复的正则方法
	public static String wipeRepetitive(String s) {
		s = s.replaceAll("(.)\\1+", "$1");
		return s;
	}
}
