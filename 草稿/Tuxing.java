package 草稿;


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class Tuxing extends JFrame {

	String str="我很牛";
	public Tuxing()
	{
		setSize(600,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addMouseListener(new EventHandler());
	}
	public static void main(String args[])
	{
		new Tuxing();
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawString(str,300,200);
	}
	class MyThread implements Runnable
	{
		public void run()
		{
			for(int i=0;i<9;i++)
			{
				str="我很牛";
				str=str+i;
				repaint();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	class EventHandler implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			new Thread(new MyThread()).start();
		}

//		@Override
//		public void mouseEntered(MouseEvent arg0) {
//			// TODO Auto-generated method stub
//			
//		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

	}
}
