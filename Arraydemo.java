package collection;
import java.util.Arrays;
import java.util.Comparator;
public class Arraydemo {
/*
 * Arrays class methods 
 * public static void sort(premetive []p)
 * public static void sort(object []o)
 * public static void sort(object []o,comparator c)
 * 
 */
	
	
	public static void main(String[] args) {
		
		int []a= {10,50,60,8};
		System.out.println("Premetives Arrays before sorting");
		for(int a1:a) {
			System.out.print(a1+",");
		}
		Arrays.sort(a);
		System.out.println("\nArrays after sort ");
		for(int a1:a) {
			System.out.print(a1+",");
		}
		String []s= {"A","Z","R","K"};
		System.out.println("\nobject Arrays before sorting");
		for(String a1:s) {
			System.out.print(a1+",");
		}
		Arrays.sort(s);
		System.out.println("\n object Arrays after sort ");
		for(String a1:s) {
			System.out.print(a1+",");
		}

		Arrays.sort(s,new Mycomparatorx());
		System.out.println("\n object Arrays after customised sort ");
		for(String a1:s) {
			System.out.print(a1+",");
		}
	}
}
class Mycomparatorx implements Comparator{
	
	public int compare(Object obj1,Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		return -s1.compareTo(s2);
	}
}