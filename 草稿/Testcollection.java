package ²İ¸å;

import java.util.ArrayList;
import java.util.List;


class A1 {
	 static List testlist=new ArrayList();
	 
}
class B{
	int number;
	String name;
	public B(int number,String name){
		this.number=number;
		this.name=name;
	}
}
class C{
	int id=99;
}
class D{
  static	List testlist2=new ArrayList();
}
public class Testcollection {
    public static void main(String args[]){
    	B b=new B(1,"sun");
		A1.testlist.add(b);
		B b1=(B)A1.testlist.get(0);
		System.out.println(b1.name);
		C c=new C();
		A1.testlist.add(c);
		C c1=(C)A1.testlist.get(1);
		System.out.println(c1.id);
		
		D.testlist2.addAll(A1.testlist);
		C c2=(C)D.testlist2.get(1);
		System.out.println(c2.id);
		System.out.println( D.testlist2.contains(c2));
		
		D.testlist2.clear();
//	    System.out.println( D.testlist2.contains(c2));
//	    System.out.println( D.testlist2.contains(A1.testlist));
	    System.out.println( D.testlist2.equals(c));
	    
	    System.out.println( c.equals(c2));
    }
}
