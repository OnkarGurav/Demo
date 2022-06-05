package collection;

import java.util.*;
public class Arraylistdemo  {
    public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add('a');
		l.add(10);
		l.add(2, "onkar");
		l.add(null);
		l.add("onkar");
		System.out.println(l);
		l.remove(2);
		l.add(2, "neha");
		l.add("abc");
		System.out.println(l);
		l.ensureCapacity(5);
		System.out.println(l.size());
		l.trimToSize();
		
		ArrayList salary= new ArrayList();
	   Vector v=new Vector();
		salary.addAll(v);
		salary.add(1024);
		salary.add(6589);
		salary.add(4589);
		salary.add(6697);
		salary.add(3156);
		
		
		Collections.sort(salary);
		System.out.println(salary);
	//	System.out.println(salary.size());
		System.out.println("2nd highest salary : "+salary.get(salary.size()-2));
	
	}
}

	

