package 草稿;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Japplet extends JApplet{

	  public void init(){
		  Container ct=getContentPane();
		  JButton jb1=new JButton("确定");
		  JButton jb2=new JButton("取消");
		  ct.add(jb1,BorderLayout.WEST);
		  ct.add(jb2,BorderLayout.EAST);
	  }
  
}
