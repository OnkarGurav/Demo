package collection;
import java.util.*;
public class Enumerationdemo {
     // to get one by one object from vector and collection
	
	public static void main(String[] args) {
		 Vector v=new Vector();
		 for(int i=0; i<10; i++) {
			 v.add(i);
		 }
		 System.out.println(v);
		 
		 Enumeration e=v.elements();
		 System.out.println(e.getClass().getName());
		 System.out.println("Even number one by one ");
		 while(e.hasMoreElements()) {
			 Integer i=(Integer)e.nextElement();			
			 if(i%2==0) {
				 System.out.print(" "+i);
			 }
		 }
		 System.out.println("\n"+(v));
	}
}
