package collection;
import java.util.*;

public class Test1{
	public static void main(String[] args) {
		TreeSet<Integer> t2=new TreeSet(new MyComparator());
	
		t2.add(10);
		t2.add(0);
		t2.add(15);
		t2.add(5);
		t2.add(20);
		t2.add(20);
		System.out.println(t2);
	}
}
 class MyComparator implements Comparator {
      
      	public int compare(Object obj1,Object obj2) {
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		if(i1<i2)
			return 1;
		else if(i1>i2)
			return -1;
		else
			return 0;
	}
	
}
