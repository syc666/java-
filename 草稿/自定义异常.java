package 草稿;

public class 自定义异常 {
   
	public static void main(String args[]){
		自定义异常  zi=new 自定义异常();
		zi.test2();
		
	}
	class drunkException extends Exception{
		drunkException(String msg){
			super(msg);
		}
	}
	public void test1() throws drunkException{
		throw new drunkException("我是异常");
	}
	public void test2(){
		try{
			test1();
		}catch(Exception e){
			
			e.printStackTrace();
			
			System.out.println("进入catch块");
			throw new RuntimeException("我是新异常");
			
		}
}

	
}
