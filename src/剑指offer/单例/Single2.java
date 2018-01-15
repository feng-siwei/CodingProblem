package 剑指offer.单例;

/**
 * 懒汉单例模式
 * @author 冯思伟
 *
 */
public class Single2 {
     private Single2(){
    	 System.out.println("进入了懒汉单例单例的构造方法");
     }  
     public static Single2 getInstance(){
    	 System.out.println("进入了懒汉单例单例的返回方法");
         return Nested.s;
     }
     private static class Nested{
    	 private static final Single2 s = new Single2();
     }
     
}
