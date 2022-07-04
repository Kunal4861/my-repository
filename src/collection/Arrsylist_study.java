package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import Loop.Whileloop;

public class Arrsylist_study {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();// this is called generic array list because we can select any type of data
		// ArrayList<String> as= new ArrayList<String>();//specific array list because
		// we can enter only specific data type

		al.add("kunal");  // 0 index// it store current value in current index
		al.add(9456);     // 1
		al.add("avnish"); // 2
		al.add(125.25);   // 3
		al.add(null);     // 4
		al.add(0);        // 5
		al.add("avnish"); // 6
		al.add(007);      // 7

		System.out.println(al);// to print entire values in sequence
		System.out.println(al.get(2));// to print specific value select its index value
		System.out.println(al.get(3));

		// by default arraylist is 10 index after that it will extend with formula
		// (10*3/2)+1=15
		// if index value extend to 16 then it become (16*3/2)+1=25 and after  25 it move to 26 then
		// (26*3/2)+1=40 and so on.
        al.add(4, "diksha");
        System.out.println(al);// add new element diksha by selecting index 4, because of this index sequence change
        
        al.remove(2);
        System.out.println(al);// removed element by selecting index 2, also it changes sequence
        
        
        System.out.println(al.size());// provide current  size of list i.e. 8
        // Length use in string and size use in collection
        // max index= length-1 , max index = size-1
        
        al.contains("diksha");
        System.out.println(al.contains("diksha"));
        
        //using for loop for display each element separately
        for (int i = 0;i<=al.size()-1;i++) {
        	System.out.println(al.get(i));
        }
        // moving through list using courser
        //using while loop on iterator to check elements 
        // create iterator object
         Iterator it = al.iterator();
        while(it.hasNext()) {
        System.out.println(it.next());// use to print next value
	}   
        
        // using list iterator
         ListIterator ltl = al.listIterator();
         
        while(ltl.hasNext()) 
        {
        	System.out.println(ltl.next());
        }
        
        for(Object k:al) {
        	System.out.println(k);
        }
	}
}


