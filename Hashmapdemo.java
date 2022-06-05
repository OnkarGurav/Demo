package collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.*;
public class Hashmapdemo {

	
	public static void main(String[] args) {
		HashMap m=new HashMap();
		m.put("chiranjeev", 1000);
		m.put("durga", 200);
		m.put("kiran", 500);
		m.put("nagarjun", 500);
		System.out.println(m);
		System.out.println(m.put("durga",700)); 
		System.out.println(m);   //durga replace with new valu 700
		Set s=m.keySet();
		System.out.println("Set of keys : "+s);
		Collection c=m.values();
		System.out.println("set of values : "+c);
		Set s1=m.entrySet();
		System.out.println(s1);
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+"..."+m1.getValue());
			if (m1.getKey().equals("nagarjun")) {
				m1.setValue(800);
			}
		}
		System.out.println(m);//
	}
}
