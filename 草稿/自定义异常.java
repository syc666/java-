package �ݸ�;

public class �Զ����쳣 {
   
	public static void main(String args[]){
		�Զ����쳣  zi=new �Զ����쳣();
		zi.test2();
		
	}
	class drunkException extends Exception{
		drunkException(String msg){
			super(msg);
		}
	}
	public void test1() throws drunkException{
		throw new drunkException("�����쳣");
	}
	public void test2(){
		try{
			test1();
		}catch(Exception e){
			
			e.printStackTrace();
			
			System.out.println("����catch��");
			throw new RuntimeException("�������쳣");
			
		}
}

	
}
