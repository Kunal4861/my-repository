package constructor;

public class Counstructor_Example {
int c ;
int d;
static int x= 8;
static int y= 12;
int w= 24;
int q= 32;


	public static void main(String[] args) {
		Sum(13,17);
		Addition();
		Counstructor_Example C= new Counstructor_Example();
		C.Addition1();
		System.out.println("value of w is "   + C.w );
		System.out.println("value of x is "   + x );
		
		
	}
public static void Sum(int c,int d) {
	int a=15;
	int b= 30;
	int sum= a+b;
	
	System.out.println("sum of two numbers"  +  sum);
	System.out.println("add of  numbers"  +  sum);
	int demo= a+b+c+d;
	System.out.println(demo);
			
			
}
public static void Addition(){
	int addition= x+y;
	System.out.println(addition);
	
}
public void Addition1() {
	int add= w+q;
	int add1=x+y;
	System.out.println(add+add1);
}


}
