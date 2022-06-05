package collection;
import java.util.*;
public class Listiteratordemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("onkar");
		l.add("neha");
		l.add("dhoni");
		l.add("kholi");
		l.add("scahin");
		System.out.println(l);
		
		ListIterator ltr=l.listIterator();
		System.out.println(ltr.getClass().getName());
		while(ltr.hasNext()) {
			String s=(String)ltr.next();
			if(s.equals("neha")) {
				ltr.remove();
			}
			else if(s.equals("onkar")) {
				ltr.set("jadeja");
			}
			else if(s.equals("scahin")) {
				ltr.add("dravid");
			}
				
		}
		System.out.println(l);
	}
	
}
