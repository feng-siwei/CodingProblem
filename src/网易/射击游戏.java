package 网易;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * 小易正在玩一款新出的射击游戏,这个射击游戏在一个二维平面进行,小易在坐标原点(0,0),平面上有n只怪物,每个怪物有所在的坐标(x[i], y[i])。小易进行一次射击会把x轴和y轴上(包含坐标原点)的怪物一次性消灭。
	小易是这个游戏的VIP玩家,他拥有两项特权操作:
	1、让平面内的所有怪物同时向任意同一方向移动任意同一距离
	2、让平面内的所有怪物同时对于小易(0,0)旋转任意同一角度
	小易要进行一次射击。小易在进行射击前,可以使用这两项特权操作任意次。
	小易想知道在他射击的时候最多可以同时消灭多少只怪物,请你帮帮小易。

 */
public class 射击游戏 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
		   
        while (scan.hasNext()){  
   
            int n =scan.nextInt();  
   
            int[] x =new int[n];//横坐标  
   
           int[] y =new int[n];//纵坐标  
   
           for (int i = 0; i < n; i++)  
   
               x[i] = scan.nextInt();  
   
            for (int i = 0; i < n; i++)  
   
               y[i] = scan.nextInt();  
   
            if(n< 4)  
   
               System.out.println(n);//零个点、一个点或两个点，一定可以消除  
   
           else {  
   
               int max =3;  
   
               for (int i = 0; i < n; i++) {  
   
                   for (int j = i + 1; j < n; j++) {  
   
                       int xcount =2, ycount = 0, ymax= 0;  
   
                       Set<Integer> set= new HashSet<Integer>();//记录与确定x轴的两个点在同一直线上的点，避免在y轴上重复计数  
   
                       set.add(i);  
   
                       set.add(j);  
   
                       for (int k = 0; k < n; k++) {  
   
                           if (k == i || k == j)  
   
                               continue;  
   
                           if (((y[k] - y[i])*(x[i]-x[j])) == ((y[i]-y[j])* (x[k] -x[i])) ){  
   
                               set.add(k);  
   
                               xcount++;  
   
                           }  
   
                       }  
   
                       for (int k = 0; k < n; k++) {//另一条直线的点从0开始，只要不在x轴上就行  
   
                           if (set.contains(k))  
   
                               continue;  
   
                            else  
   
                               ycount=1;//y轴上的一个点  
   
                           for (int l = k + 1; l< n; l++) {  
   
                               if (set.contains(l))  
   
                                   continue;  
   
                               else if (((y[l]- y[k])*(y[i]-y[j])) == ((x[j]-x[i]) * (x[l] - x[k])))//y轴上的其他点  
   
                                   ycount++;  
   
                           }  
   
                           if (ycount > ymax)  
   
                               ymax = ycount;  
   
                       }  
   
                       if (xcount + ymax > max){  
   
                           max = xcount +ymax;  
   
                       }  
   
                   }  
   
               }  
   
               System.out.println(max);  
   
            }  
   
        }  
	}

}
