package �ݸ�;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Fileread {
    public static void main(String args[]) throws IOException{
    	RandomAccessFile rf=new RandomAccessFile("d:/����/����.txt","rw");
    	for(int i=0;i<6;i++)
    	System.out.println("�ַ���"+rf.readLine());
    	
    }
}

