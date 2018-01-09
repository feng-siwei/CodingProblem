package 网易;

import java.util.Scanner;

/*
 * 小Q和牛博士合唱一首歌曲,这首歌曲由n个音调组成,每个音调由一个正整数表示。
	对于每个音调要么由小Q演唱要么由牛博士演唱,对于一系列音调演唱的难度等于所有相邻音调变化幅度之和,
	例如一个音调序列是8, 8, 13, 12, 那么它的难度等于|8 - 8| + |13 - 8| + |12 - 13| = 6
	(其中||表示绝对值)。
	现在要对把这n个音调分配给小Q或牛博士,让他们演唱的难度之和最小,请你算算最小的难度和是多少。
	如样例所示: 小Q选择演唱{5, 6}难度为1, 牛博士选择演唱{1, 2, 1}难度为2,难度之和为3,
	这一个是最小难度和的方案了。 
	输入描述:
	输入包括两行,第一行一个正整数n(1 ≤ n ≤ 2000) 第二行n个整数v[i](1 ≤ v[i] ≤ 10^6), 表示每个音调。
	
	
	输出描述:
	输出一个整数,表示小Q和牛博士演唱最小的难度和是多少。
	
	输入例子1:
	5
	1 5 6 2 1
	
	输出例子1:
	3
 */
public class 合唱 {
	public static void main(String[] args) {
		/*
		 * 这是一个动态规划题
		 */
		Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int len = in.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; ++i) {
                arr[i] = in.nextInt();
            }
            if (len < 3) {
                System.out.println("0");
            } else {
                int[][] dp = new int[len][len];
                int[] acc = new int[len];
                dp[0][0] = 0 - Math.abs(arr[1] - arr[0]);
                for (int i = 1; i < len; ++i) {
                    acc[i] = acc[i - 1] + Math.abs(arr[i] - arr[i - 1]);
                    dp[i][i - 1] = acc[i - 1];
                    for (int j = 0; j < i - 1; ++j) {
                        dp[i][j] = dp[i - 1][j] + acc[i] - acc[i - 1];
                        dp[i][i - 1] = Math.min(dp[i][i - 1], dp[i - 1][j] + Math.abs(arr[i] - arr[j]));
                    }
                }
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < len - 1; ++j) {
                    min = Math.min(min, dp[len - 1][j]);
                }
                System.out.println(min);
            }
        }
	}
      
}
