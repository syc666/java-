package �ݸ�;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Japplet extends JApplet{

	  public void init(){
		  Container ct=getContentPane();
		  JButton jb1=new JButton("ȷ��");
		  JButton jb2=new JButton("ȡ��");
		  ct.add(jb1,BorderLayout.WEST);
		  ct.add(jb2,BorderLayout.EAST);
	  }
  
}
