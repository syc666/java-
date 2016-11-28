package ²Ý¸å;

import java.io.FileInputStream;
import java.io.IOException;

public class Fileinput {
  

public static void main(String args[]) throws IOException{
	  long start=System.currentTimeMillis();
	   Testfile2.readfile2("D:\\×ÀÃæ\\mima.txt");
	   long end=System.currentTimeMillis();
	  System.out.println(end-start);
   }
}

class Testfile{
	public static void readfile(String filename) throws IOException{
	int s;
	int i=0;
	@SuppressWarnings("resource")
	FileInputStream fs=new FileInputStream(filename);
	while((s=fs.read())!=-1){
	    if(i++%10==0)System.out.println();
	    if(s<=0xf)System.out.print("0");
		System.out.print(Integer.toHexString(s)+" ");
	}
	}
}

class Testfile2{
    @SuppressWarnings("resource")
	public static void readfile2(String filename) throws IOException{
    	FileInputStream fs=new FileInputStream(filename);
    	int s2=0;
    	byte[] by=new byte[20*1024];
    	while((s2=fs.read(by,0,by.length))!=-1){
    		for(int i=0;i<s2;i++){
    			if(s2<=0xf){
    				System.out.print("0");
    			}
    			System.out.print(s2+" ");
    		}
    	}
    }
}

class Testfile3{
	public static void copyfile(String filename,String filename2){
		
	}
}