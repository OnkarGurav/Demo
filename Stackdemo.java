package collection;
import java.util.*;
public class Stackdemo {
    public static void main(String[] args) {
		Stack s=new Stack();
		s.push("onkar");
		s.push("pravin");
		s.push("shubham");
		s.push("onkar");
		s.push("pravin");
		s.push("shubham");
		s.push("onkar");
		s.push("pravin");
		s.push("shubham");
		s.push("shubham");
		
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println("size of stack :"+s.size());
		System.out.println(s.remove("sanket"));
		System.out.println(s.search("pravin")+"--"+s.search("onkar"));
		System.out.println("this element is not available : " +s.search("dhoni"));
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println("after pop 1 element new peek element : " +s.peek());
		System.out.println("size of stack : "+s.size());
		System.out.println(s.empty());
		
	}
}
