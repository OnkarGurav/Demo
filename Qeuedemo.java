package collection;
import java.util.*;
public class Qeuedemo {

	
	public static void main(String[] args) {
		
		Queue <Integer> q=new PriorityQueue<>();
		for(int i=0;i<11;i++) {
			
			System.out.println(q.add(i));
		}
		System.out.println(q.add(12));
	
	}
}
