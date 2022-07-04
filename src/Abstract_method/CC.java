package Abstract_method;

public class CC extends Sample_abstactstudy   // CC extends properties of class Sample_abstactstudy, 
                                            //it show option to add unimplemented method from class Sample_abstactstudy at CC
{                                           // once select unimplemented, it will show @override public void test1() {} which is abstract method from class Sample_abstactstudy
                                            // add printing statement with and create object and run the method
	                                       // CC also contain its own properties,create method sample2 for that
	                                       // if method is complete then compiler run if method is incomplete then it become abstract
	public static void main(String[] args) {
		CC X= new CC();
          X.test1();
          Sample2();
          
	}

	@Override
	public void test1() {
		System.out.println("hi I am incomplete method from class Sample_abstactstudy");
		
	}
   public static void Sample2() {
	   System.out.println("Hi I am property of CC class");
   }
}
