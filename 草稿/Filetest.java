package ²Ý¸å;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Filetest {
  @SuppressWarnings({ "unused", "resource" })
public static void main(String args[]) {
	//  Scanner console=new Scanner(System.in);
//	 
//	  String con2=console.nextLine();
//	   RandomAccessFile raf=new RandomAccessFile(con2,"rw");
//	   for(int i=0;i<5;i++){
//			  int con=console.nextInt();
//			  raf.writeInt(con);
//	   }
//	   String s;
//	   System.out.println(raf.readLine());
//	  while((s=raf.readLine())!=null){
//		  System.out.println(s);
//	  }
	  try{
//	  RandomAccessFile raf2=new RandomAccessFile("d:\\1.txt","rw");
//	  raf2.writeBytes("hheeee554eeee \n");
//	  raf2.close();
//	  RandomAccessFile raf3=new RandomAccessFile("d:\\1.txt","rw");
//	  System.out.println(raf3.readLine());
//	  raf3.close();
	    File f1=new File("d:","jintian");
	    System.out.println(f1.mkdir());
	    
	    File f2=new File("d:\\jintian","4.txt");
	    f2.mkdirs();
	    System.out.println(f2.exists());
	    
	    RandomAccessFile raf1=new RandomAccessFile("d:/jintian/1.txt","rw");
	    raf1.writeBytes("hello\n");
	    raf1.writeBytes("hh");
	   
	    
	    RandomAccessFile raf2=new RandomAccessFile("d:/jintian/1.txt","rw");
	    String s;
	    while((s=raf1.readLine())!=null){
	    	System.out.println(s);
	    }
	    
	    
	    
	    
	  }
	  catch(Exception e){
		  e.printStackTrace();
	  }
  }
}
