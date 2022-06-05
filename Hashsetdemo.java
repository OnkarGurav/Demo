package collection;
import java.util.*;

class Student{
	String name;
	int id;
	
	Student(String name,int id){
		this.id=id;
		this.name=name;
	}
	public String  toString() {
		return ("Name : "+name+" id "+id);
	}
}
public class Hashsetdemo {
	/*duplicate not allowed
	 * Insertion order not preserved
	 * 
	 */

	public static void main(String[] args) {
		Student s1=new Student("onkar",10);
		Student s2=new Student("shubham",11);
		Student s3=new Student("sanket",12);	
		Student s4=new Student("kiran",13);
		
		
		HashSet h=new HashSet();
		h.add(s1);
		h.add(s2);
		h.add(s3);
		h.add(s4);
		System.out.println(h.add("B"));		
		h.add("A");
		h.add("C");
		h.add("null");
		h.add("null");
		System.out.println(h.remove("z"));
		h.add(10);
		System.out.println(h.add("B"));  // Duplicate
		System.out.println(h);            // Insertion order not follow
		Iterator itr=h.iterator();
		while(itr.hasNext()) {
			//Object o=(Object)itr.next();
			System.out.println(itr.next());
//			if(o.equals("A")) {
//			h.remove(o);
//			}
		}
		for(int i=0;i<h.size();i++) {
			h.add(i);
		}
		System.out.println(h);
	}
}
