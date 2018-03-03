package 剑指offer;

public class 机器人的运动范围_回溯法 {
	public static void main(String[] args) {
		//临界条件
		int threshold = 15;
		int rows = 200;
		int cols = 1;
		int count = movingCount(threshold,rows,cols);
		System.out.printf("最后进入格子数为%d %n",count);
	}

	private static int movingCount(int threshold, int rows, int cols) {
		if (threshold<0||rows<0||cols<0) {
			return 0 ;
		}
		boolean [] visited = new boolean[(rows+1)*(cols+1)];
		
		int count = movingCountCore(threshold,rows,cols,0,0,visited);
		
		return count;
	}
	//核心方法用于递归,查看是否可以进入,然后递归上下左右
	private static int movingCountCore(int threshold, int rows, int cols,
			int row, int col, boolean[] visited) {
		
		int count = 0;
		if (check(threshold, rows, cols, row, col, visited)) {
			visited[row*cols+col]=true;
			count = 1
					+ movingCountCore(threshold, rows, cols, row+1, col, visited)
					+ movingCountCore(threshold, rows, cols, row-1, col, visited)
					+ movingCountCore(threshold, rows, cols, row, col+1, visited)
					+ movingCountCore(threshold, rows, cols, row, col-1, visited);
		}
		return count;
	}
	//检查格子是否可以进入
	private static boolean check(int threshold, int rows, int cols, int row,
			int col, boolean[] visited) {
		if (rows>=0 && cols>=0&&row<=rows&&col<=cols 
				&&getDigitSum(row)+getDigitSum(col)<threshold
				&&!visited[row*cols+col]) {
			return true;
		}
		return false;
	}
	//计算位数之和
	private static int getDigitSum(int number) {
		int sum = 0;
		while (number < 0 ) {
			sum += number%10;
			number = number/10;
		}
		return sum;
	}

}
