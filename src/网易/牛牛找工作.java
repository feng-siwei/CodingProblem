package 网易;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class 牛牛找工作 {

	/**
	 * 为了找到自己满意的工作，牛牛收集了每种工作的难度和报酬。
	 * 牛牛选工作的标准是在难度不超过自身能力值的情况下，牛牛选择报酬最高的工作。
	 * 在牛牛选定了自己的工作后，牛牛的小伙伴们来找牛牛帮忙选工作，
	 * 牛牛依然使用自己的标准来帮助小伙伴们。牛牛的小伙伴太多了，
	 * 于是他只好把这个任务交给了你。 
		输入描述:
		每个输入包含一个测试用例。
		每个测试用例的第一行包含两个正整数，分别表示工作的数量N(N<=100000)和小伙伴的数量M(M<=100000)。
		接下来的N行每行包含两个正整数，分别表示该项工作的难度Di(Di<=1000000000)和报酬Pi(Pi<=1000000000)。
		接下来的一行包含M个正整数，分别表示M个小伙伴的能力值Ai(Ai<=1000000000)。
		保证不存在两项工作的报酬相同。
		
		
		输出描述:
		对于每个小伙伴，在单独的一行输出一个正整数表示他能得到的最高报酬。一个工作可以被多个人选择。
		
		输入例子1:
		3 3 
		1 100 
		10 1000 
		1000000000 1001 
		9 10 1000000000
		
		输出例子1:
		100 
		1000 
		1001
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            
            
            Map<Integer, Integer>workMap = new TreeMap<>();
            Map<Integer, Integer>maxPiMap = new TreeMap<>();
            int[] aiArray = new int[m];
            int maxPi = 0;
            for (int i = 0; i < n ; i++) {
            	int di = in.nextInt();
            	int pi = in.nextInt();
            	if (workMap.get(di)==null||workMap.get(di)<pi) {
            		workMap.put(di, pi);
				}
			}
//           workMap中的pi重小到大排序 
            int value = 0; 
            for (Map.Entry<Integer, Integer> work : workMap.entrySet()) {
				if (work.getValue()<value) {
					work.setValue(value);
				}
				value = work.getValue();
			}
            
            for (int i = 0; i < m; i++) {
				int ai = in.nextInt();
				aiArray[i] = ai;
				maxPiMap.put(ai, 0);
			}
            Set<Integer> diSet = workMap.keySet();
            Iterator<Integer> diIter = diSet.iterator();
            int di = 0;
//            if (diIter.hasNext()) {
////            	di = diIter.next();
//            	maxPi = workMap.get(di);
//			}          
            Set<Integer> aiSet = maxPiMap.keySet();
            Iterator<Integer> aiIter = aiSet.iterator();
            int ai = 0;
            if (aiIter.hasNext()) {
            	ai = aiIter.next();
			} 
            //给maxPiMap赋上对应的值
            while (diIter.hasNext()) {
            	di = diIter.next();
				while (aiIter.hasNext()&&ai<di) {
					maxPiMap.put(ai, maxPi);
					ai = aiIter.next();
				}
				maxPi = workMap.get(di);
				
			}
            //结尾处理
            while (aiIter.hasNext()) {
				maxPiMap.put(ai, maxPi);
				ai = aiIter.next();
			}
            maxPiMap.put(ai, maxPi);
            
            for (int i = 0; i < aiArray.length; i++) {
				System.out.println(maxPiMap.get(aiArray[i]));
			}
        }    

	}

}
