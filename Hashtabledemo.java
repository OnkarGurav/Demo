package collection;
import java.util.*;
public class Hashtabledemo {
          public static void main(String[] args) {
			Hashtable h=new Hashtable();   // take initial capacity 25
		h.put(new Temp(5),"A");
		h.put(new Temp(2), "B");
		h.put(new Temp(6), "C");
		h.put(new Temp(15), "D");
		h.put(new Temp(23), "E");
		h.put(new Temp(16), "F");
		h.put("durga", null);
		System.out.println(h);
		}
}
class Temp{
	
	int i;
	 Temp(int i) {
		this.i=i;
	}
	public int hashcodde() {
		return i;
	}
	public String tostring() {
		return i+"";
	}
}