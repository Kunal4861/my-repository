package interfacestudy;

public class MystudyInterface implements Studyinterface// implements interface
{

	public static void main(String[] args) 
	{
		  MystudyInterface m = new  MystudyInterface();
		  m.test1();
		  m.test2();
		  m.test3();
		 System.out.println(a);// variable from interface
						 	
	
	
	}
		  
		  
	

	@Override
	public void test1() {
	System.out.println("hi I am from interface");	
		
	}

	@Override
	public void test2() {
		System.out.println("hi I am from interface");
		
	}
public void test3() {
	System.out.println("hi I am from class MystudyInterface");// we can create class  own methods
}
}
