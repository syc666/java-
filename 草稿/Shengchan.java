package �ݸ�;
//���Ѽ��ӳ٣���������������������ͣ�����ѵ��������������������������ܹ���������ʮ��λ�ã�Ȼ��ȫ��������
public class Shengchan {
   public static void main(String[] args){
	   Stack st=new Stack();
	   Product pd=new Product(st);
	   Consum cs=new Consum(st);
	   Thread tr=new Thread(pd);
       tr.start();
       
       Thread tr2=new Thread(cs);
       tr2.start();
	   
	  
   }
}



class Stack{
	private String[] stacklist=new String[30];
	private int cnt=0;
	 String[] ch={"a","b","c","d","e","f"};
	 
	public  synchronized void push(){
		while(cnt==6){
			try{
			this.wait();
			}catch(Exception e){
				
			}
		}
		this.notify();
		stacklist[cnt]=ch[cnt];
		System.out.println("����һ��"+stacklist[cnt]);
		cnt++;
	}
	synchronized void pop(){	
		while(cnt==0){
			try{
			this.wait();
			}catch(Exception e){
				
			}
		}
		this.notify();
		
		cnt--;
		System.out.println("����һ��"+stacklist[cnt]);
		
	}
}

class Product implements Runnable{
	private Stack st;
	Product(Stack st){
		this.st=st;
	}
	public void run(){
	
		for(int i=0;i<20;i++){
		
		   st.push();
		}
	}
	
}
class Consum implements Runnable{
	private Stack st;
	Consum(Stack st){
		this.st=st;
	}
	public void run(){
	    
		for(int i=0;i<20;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		st.pop();
		}
	}
}