package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vectorstrudy {

	public static void main(String[] args) {
		Vector v= new Vector();
		v.add("nagpur");
		v.add("hello");
		v.add(false);
		v.add(3021);
		v.add(null);
		v.add(null);
		v.add("nagpur");
		v.add('K');

		System.out.println(v);
		
		System.out.println(v.capacity());
		 
		System.out.println(v.size());
		
		
		System.out.println(v.isEmpty());
		
		System.out.println(v.contains(0));
		
		v.add(3, 21);
		System.out.println(v);
		
		System.out.println(v.indexOf("nagpur"));
		
		System.out.println(v.get(3));
		v.remove(3);
		System.out.println(v);
		
		
		
		// moving through courser
		//for each loop
		
		
		for(Object k:v) {
		System.out.println(k);
		
		
	}
	
		Iterator j = v.iterator();//universal iterator
		
		while(j.hasNext()) {
			System.out.println(j.next());
			
			 ListIterator li = v.listIterator();
			 
			// listIterator--> Applicable for all classes implements list interface
			 
			 while(li.hasNext()) {
				 System.out.println(li.next());
				 
				 // enumeration
				 Enumeration en = v.elements();
				 while(en.hasMoreElements()) {
					 System.out.println(en.nextElement());
				 }
			 }
		}
		
		
	}
}



	
