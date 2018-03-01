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
				n = n & (n-1);
			}
			System.out.println(count);
		}	
	}

}
