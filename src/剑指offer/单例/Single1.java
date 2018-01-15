package 剑指offer.单例;

/**
 * 饿汉单例模式
 * @author 冯思伟
 *
 */
public class Single1 {
	 private static Single1 s=new Single1();        
     private Single1(){
        System.out.println("进入了饿汉单例单例的构造方法");
     }  
     public static Single1 getInstance(){
    	 System.out.println("进入了饿汉单例单例的返回方法");
         return s;
     }
}
