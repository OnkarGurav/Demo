package collection;
import java.util.*;
public class Treesetdemo {
     // jvm internalli call compareTo() wich is present in comparable interface of java.lang
	// compareTO () insert element by defualt natural soring order 
	
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet();
		t.add("A");
		t.add("B");
		t.add("a");
		t.add("Z");
		t.add("L");
		
	//	t.add(new Integer(10)); //CCE
	//	t.add(null);
		
		System.out.println(t);
	}
}
