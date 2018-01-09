package 网易;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * 一个合法的括号匹配序列被定义为:
	1. 空串""是合法的括号序列
	2. 如果"X"和"Y"是合法的序列,那么"XY"也是一个合法的括号序列
	3. 如果"X"是一个合法的序列,那么"(X)"也是一个合法的括号序列
	4. 每个合法的括号序列都可以由上面的规则生成
	例如"", "()", "()()()", "(()())", "(((()))"都是合法的。
	从一个字符串S中移除零个或者多个字符得到的序列称为S的子序列。
	例如"abcde"的子序列有"abe","","abcde"等。
	定义LCS(S,T)为字符串S和字符串T最长公共子序列的长度,即一个最长的序列W既是S的子序列也是T的子序列的长度。
	小易给出一个合法的括号匹配序列s,小易希望你能找出具有以下特征的括号序列t:
	1、t跟s不同,但是长度相同
	2、t也是一个合法的括号匹配序列
	3、LCS(s, t)是满足上述两个条件的t中最大的
	因为这样的t可能存在多个,小易需要你计算出满足条件的t有多少个。
	
	如样例所示: s = "(())()",跟字符串s长度相同的合法括号匹配序列有:
	"()(())", "((()))", "()()()", "(()())",其中LCS( "(())()", "()(())" )为4,其他三个都为5,所以输出3. 
	输入描述:
	输入包括字符串s(4 ≤ |s| ≤ 50,|s|表示字符串长度),保证s是一个合法的括号匹配序列。
	
	输出描述:
	输出一个正整数,满足条件的t的个数。
	
	输入例子1:
	(())()
	
	输出例子1:
	3
 * 
 */
public class 最长公共子括号序列 {
	public static void main(String[] args) {
		/*
		 * 根据题意，要想使得 LCS 最大，删去任意一个字符即可获得 LCS = |s| - 1 ，
		 * 再把该字符插到与原来不同的任意位置可以维持原长度，所以只能改变一个字符的位置。
		 * 因此最暴力的做法是枚举每个字符，把它插入到任意位置，判合法，去重，累计。
		 */	
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			Set<String> set = new HashSet<>();
			String str = in.nextLine();
			char[] strs = str.toCharArray();
			//使用list提高数组插入效率
			ArrayList<Character>strList = new ArrayList<>();
			
			StringBuilder sb = new StringBuilder();
			
			for (char c : strs) {
				strList.add(c);
			}
			for (int i = 0; i < strs.length; i++) {
				char c = strList.get(i);
				strList.remove(i);
				for (int j = 0; j < strs.length; j++) {
					strList.add(j, c);
					
					sb.delete( 0, sb.length());					
					for (Character character : strList) {
						sb.append(character);
					}
					
					set.add(sb.toString());
					strList.remove(j);
				}
				//还原list
				strList.add(i,c);
			}
			
			int count = 0;
			for (String s : set) {
				if (isValid(s)) {
//					System.out.println(s);
					count++;
				}
			}
			System.out.println(count-1);
		}

	}
	/**
	 * 判断括号字符串是否合法
	 * @return
	 */
	private static boolean isValid(String str) {
		int v = 0;
		char [] strs = str.toCharArray();
		for (int i = 0; i < str.length()&&v>=0; i++) {
			
			if (strs[i]=='(') {
				v++;
			}else if (strs[i] == ')') {
				v--;
			}
		}
		if (v == 0) {
			return true;
		}
		return false;
	}
	

}
