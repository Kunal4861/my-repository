package accesstest;

import accessModifier.Defaultuse;

public class Test {
	
	public static void main(String[] args) {
		Defaultuse du= new Defaultuse();//created object of another class
		du.test1();//calling public method, visible within project
		//du.test2();//calling default method, visible within same package
		//du.test3();// calling private method,visible within same class
		 
		//System.out.println(du.a);// calling default variable which is accessible within same package
				System.out.println(du.b);// calling public variable which is accessible within project
				//System.out.print(du.c);// calling private variable which is accessible within same class
		 
	}

}
