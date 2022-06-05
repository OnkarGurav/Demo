package collection;
import java.util.*;
public class Sortedsetdemo {

	public static void main(String[] args) {
		TreeSet<Integer> s = new TreeSet<Integer>();
	//	s.add(null);
		s.add(100);
		s.add(101);
		s.add(102);
		s.add(103);
		s.add(104);
		s.add(105);
		
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet(102));
		System.out.println(s.tailSet(103));
		System.out.println(s.subSet(101, 105));
		System.out.println(s.comparator());
		
		StringBuffer sb1=new StringBuffer("abc");
		StringBuffer sb2=new StringBuffer("xyz");
		
		TreeSet s1 = new TreeSet();
//		s1.add("a");
//		s1.add("A");
//		s1.add("B");
	//	s1.add(105);
	
		s1.add(sb1);
		s1.add(sb2);
		System.out.println(s1);
		System.out.println(s1.comparator());
				
		
	}
}
