package �ݸ�;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Jframe {
  public static void main(String[] args){
	  new testjframe();
	  
  }
}
class testjframe extends JFrame implements ActionListener{
	testjframe(){
    Container c=getContentPane();
    JButton jb1=new JButton("ȷ��");
    JButton jb2=new JButton("ȡ��");
    jb2.addActionListener(this);
    c.add(jb1,BorderLayout.WEST);
    c.add(jb2,BorderLayout.EAST);
    setSize(180,280);
    setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dispose();
		System.exit(0);
	}
	
}