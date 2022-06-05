package collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Iteratordemo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		 for(int i=0; i<10; i++) {
			 l.add(i);
		 }
		 System.out.println(l);
		 Iterator itr=l.iterator();
		 System.out.println(itr.getClass().getName());
		 while(itr.hasNext()) {
			 Integer i=(Integer)itr.next();			
			 if(i%2==0) {
				 System.out.print(" "+i);
			 }
			 else {
				 itr.remove();
				 }
			 }
		 System.out.println("\n"+l);
		 
		 CopyOnWriteArrayList c=new CopyOnWriteArrayList();
		 for(int i=0; i<=10;i++) {
			 c.add(i);
		 }
		 System.out.println(c);
		 Iterator itr1=c.iterator();
		// System.out.println(itr.getClass().getName());
		 while(itr1.hasNext()) {
			 Integer i1=(Integer)itr1.next();			
			 if(i1%2==0) {
				 System.out.print(" "+i1);
			 }
			
			 }
		 System.out.println("\n"+c);
		 
	}
}
