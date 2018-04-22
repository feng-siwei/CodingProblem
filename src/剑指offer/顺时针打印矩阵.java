package 剑指offer;

public class 顺时针打印矩阵 {
	public static void main(String[] args) {
		int[][] numbers={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
//		printMatrxInCircle(numbers,1);
		printMatrxClockwisely(numbers);
		
		int[][] numbers2={
				{1,2,3,4}		
		};
		printMatrxClockwisely(numbers2);
		
		int[][] numbers3={
				{1},
				{2},
				{3},
				{4}
		};
		printMatrxClockwisely(numbers3);
		
		int[][] numbers4={
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12},
				{13,14,15},
				
		};
		printMatrxClockwisely(numbers4);
		
		int[][] numbers5={
			
		};
		printMatrxClockwisely(numbers5);
		
		int[][] numbers6={
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
				
		};
		printMatrxClockwisely(numbers6);
		
	}
	
	public static void printMatrxClockwisely(int[][] numbers) {
		if (numbers == null) {
			return;
		}
		int start = 0 ;
		while (numbers.length>start*2 &&numbers[0].length>start*2) {
			printMatrxInCircle(numbers,start);
			start++;
		}
		System.out.println();
		
	}

	public static void printMatrxInCircle(int[][] numbers, int start) {
		int endX = numbers[0].length-start-1;
		int endY = numbers.length-start-1;
		
		for (int i = start; i <= endX; i++) {
			System.out.print(numbers[start][i]+",");
		}
		if (start<endY) {
			for (int i = start+1; i <= endY; i++) {
				System.out.print(numbers[i][endX]+",");
			}
			if (start<endX) {
				for (int i = endX-1; i >= start; i--) {
					System.out.print(numbers[endY][i]+",");
				}
				if (start<endY-1) {
					for (int i = endY-1; i >start; i--) {
						System.out.print(numbers[i][start]+",");
					}
				}
			}
		}
		
		
		
	}

}
