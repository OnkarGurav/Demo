package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Treesetdemo2 {

	 public static void main(String[] args) {
			TreeSet t=new TreeSet(new Mycomparatory());
			t.add("onkar");
			t.add("shubham");
			t.add("kiran");
			t.add("sanket");
			t.add("prathmesh");
			System.out.println(t);
			
		}
}
class Mycomparatory implements Comparator{
	
	public  int compare(Object obj1,Object obj2) {
		
		String s1=obj1.toString();
		String s2=(String)obj2;
		
		return -s1.compareTo(s2);
	}
}

