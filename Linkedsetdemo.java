package collection;

import java.util.LinkedHashSet;

public class Linkedsetdemo {
	
	// DS = Linkedlist+Hashset
	// Insertion order preserved and duplicte not allowed

	public static void main(String[] args) {
		LinkedHashSet h=new LinkedHashSet();
		h.add("B");
		h.add("A");
		h.add("C");
		h.add("null");
		h.add(10);
		System.out.println(h.remove("D"));
		
			
		System.out.println(h.add("B"));  // Duplicate
		System.out.println(h);            // Insertion order Preserved
	}
}
