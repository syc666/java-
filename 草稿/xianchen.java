package ²Ý¸å;

import java.text.SimpleDateFormat;

public class xianchen {
    public static void main(String[] args){
    	A2 a2=new A2();
    	Thread tr=new Thread(a2);
    	tr.start();
    	while(true){
    		System.out.println("hello world");
    	}
      
    }
}
//class A2 extends Thread{
//	public void run(){
//		while(true){
//		System.out.println("aaa");
//		}
//	}
//}
class A2 implements Runnable{
	public void run(){
		while(true){
		
		}
	}
}