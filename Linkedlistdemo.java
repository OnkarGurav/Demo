package collection;
import java.util.*;
public class Linkedlistdemo {
	
	
public static void main(String[] args) {
	
	LinkedList l=new LinkedList();
	l.add("durga");
	l.add(10);
	l.add(null);
	l.add(1,"class" );
	System.out.println(l);
	l.set(0, "Prowings");
	System.out.println(l);
	l.removeLast();
	System.out.println(l);
	

}
	
}
