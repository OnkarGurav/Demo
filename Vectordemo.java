package collection;
import java.util.*;
public class Vectordemo {
  public static void main(String[] args) {
	
	  Vector v=new Vector();
	  System.out.println("defualt capacity : "+v.capacity());
	  for(int i=1; i<=v.capacity(); i++) {
		  v.add(i);
	  }
	 System.out.println(v);
	 v.add(11);
	 System.out.println(v);
	 System.out.println("New capacity : "+v.capacity());
	 
	 Vector v1=new Vector(6,5);
	 System.out.println("initial capacity : "+v1.capacity());
	  for(int i=1; i<=6; i++) {
		  v1.add(i);
	  }
	  System.out.println(v1);
	  v1.add(7);
	  System.out.println("new capacity : "+v1.capacity());
}
}
