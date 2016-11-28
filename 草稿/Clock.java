package ²Ý¸å;


import java.awt.Toolkit;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Clock {
   public static void main(String[] args){
	Timer t=new Timer();
	t.schedule(new Clockbeep(), 3000 ,3000);
   }
}
class Clockbeep extends TimerTask{
  Toolkit toolkit=Toolkit.getDefaultToolkit();
  public void run(){
	  System.out.println("Ê±¼äµ½"+new Date());
	  toolkit.beep();
  }

}