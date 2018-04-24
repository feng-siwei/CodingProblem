package 网易;

import java.util.Scanner;

public class 矩形重叠 {
	/*
	 * 
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int[] rectangle = {1,2,3,4};
			int[] rectangle2 = {1,2,3,4};
			boolean a = isOverlap(rectangle,rectangle2);
			
		}
	}

	private static boolean isOverlap(int[] rectangle, int[] rectangle2) {
		if ((rectangle[0]>rectangle2[2]&&rectangle[1]>rectangle2[3])
				&&(rectangle[2]<rectangle2[0]&&rectangle[2]<rectangle2[1])
				) {
			return true;
		}
		return false;
	}
	

}
