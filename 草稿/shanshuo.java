package �ݸ�;
//��Ҫ���߳�ʵ�����ֲ�ͣ����˸�������������ֻ����һ�Σ�����������ָ�㣬��������
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
public class shanshuo extends JFrame {
private JLabel jl = new JLabel("��һ��");
private Container container =getContentPane();
private static Thread t;
int time=0;
public shanshuo(){
JMenuBar menuBar = new JMenuBar();
setJMenuBar(menuBar);
JMenu[] menu = new JMenu[]{new JMenu("��Ϸ"),new JMenu("����")};
JMenuItem[] menuItem = new JMenuItem[]{new JMenuItem("����Ϸ"),new JMenuItem("���¿�ʼ"),
new JMenuItem("��¼"),new JMenuItem("�˳�"),new JMenuItem("��������")};
for(int i = 0;i<2;i++){
menuBar.add(menu[i]);
}
for(int i=0;i<4;i++){
menu[0].add(menuItem[i]);
}
menu[1].add(menuItem[4]);
menuItem[3].addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
});
container.setLayout(null);

t = new Thread(new Runnable() {
public void run() {
while (time<=100) {
time++;

if(time%2==0){
container.add(jl);
jl.setBounds(200,200,80,80);
}
try {
Thread.sleep(1000);

} catch (Exception e) {
e.printStackTrace();
}
if(time==100){
time=1;
}
}

}
});
t.start();
//container.setBounds(0,0,500,500);
container.setBackground(Color.BLUE);
this.setTitle("̹�˴�ս");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setBounds(100,20,700,600);
this.setVisible(true);
}
public static void main(String[] args) {
new shanshuo();
}
}