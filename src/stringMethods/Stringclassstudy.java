package stringMethods;

public class Stringclassstudy {

	public static void main(String[] args) {
		String name= "Avnish";   //constant pool area
		String K   = "Avnish";//
		String name1=new String ("Avnish");// non constant pool area
		String name2= new String ("Avnish");
		String name3= new String ("AvnisH");
		String name4= new String ("AVNISH");
		//1. length method
		int Stringlength=name.length();// //stored in  Reference variable  for feature use
		System.out.println("lenght of string is "+ Stringlength);// we can modify this value in future
		System.out.println("lenght of string is "+name.length());// if we use direct object i.e. name.length(); in printing statement then we can't modify in future
		System.out.println("============");

		//2. toUpperCase method
		String CapitalvalueofK = K.toUpperCase();//stored in  Reference variable  for feature use
		System.out.println(CapitalvalueofK);
		System.out.println("============");



		//3. toLowerCase method
		System.out.println(CapitalvalueofK.toLowerCase());//CapitalvalueofK = K.toUpperCase(); is used as reference

		System.out.println("============");




		//4.use of equals method. 
		//it compare memory location
		// memory location is same then it show true otherwise false.
		System.out.println(name==K);// having same memory location having memory in constant pool area 
		System.out.println(name1==name2);//having different memory location having memory in non constant pool area 
		boolean result = name.equals(K);// created local variable to store data for further use
		System.out.println(result);
		boolean result1 = name.equals(name2);
		System.out.println(result1);// it compare content when both method is in different memory location
		// also equals method is case sensitive but by using Ignorecase it will ignore case sensitivity
		boolean result3 = name.equalsIgnoreCase(name3);
		System.out.println(result3);
		System.out.println("============");


		// use of contains method
		// it check contains & sequence  i.e. in Avnish, 
		boolean result4 = name.contains("vn");// Reference variable
		System.out.println(name.contains("vn"));// we can directly print but it will not save data for further reference, so create reference variable
		System.out.println(result4); //Avnish contain Avni & Avni is in sequence thats why it shows true.
		boolean result5 = name.contains("Avni");
		System.out.println(result5);// this method is not case sensitive
		boolean result6 = name.contains("Ah");// Avnish contain Ah but not in sequence Hence false.
		System.out.println(result6);

		System.out.println("============");


		// use of isEmpty method()
		// If string is empty then it shows true otherwise false
		boolean result7 = name.isEmpty();
		System.out.println(result7);
		String W= null;// create null string
		//System.out.println(W.isEmpty());// shows Exception error, it is run time error
		String X= " ";
		System.out.println(X.length());//Length shows 1 because it shows space between " "	
		System.out.println(X.isEmpty());//Returns true if, and only if, length() is 0.
		System.out.println(X.isBlank());//Returns true if the string is empty or contains only white space codepoints,otherwise false
		System.out.println("============");


		//use of charAt() method
		String City= "Nagpur";
		char Result8 = City.charAt(3);//shows 3rd index that is p Ex. Nagpur, index0=N, Index1=a, Index2=g,Index3=p
		System.out.println("Answer is  "  +  Result8);
		System.out.println(City.charAt(4));

		//System.out.println(City.charAt(9));//String index out of range: 9

		System.out.println("============");

		// use of endsWith() method
		System.out.println(City.endsWith("ur"));// Nagpur ends with ur	
		System.out.println(City.endsWith("Nagpur"));// Nagpur ends with gpur	
		System.out.println(City.endsWith("Nag"));// Nagpur not ends with Nag
		// method is case sensitive
		System.out.println("============");


		// use of startsWith() method
		System.out.println(City.startsWith("Na"));// Nagpur starts with Na
		System.out.println(City.startsWith("Nagpur"));// Nagpur starts with Nagpur
		System.out.println(City.startsWith("pur"));// Nagpur not  starts with pur
		// method is case sensitive
		System.out.println("============");

		// use of substring() method
		String str= "Avnish is clever boy";
		System.out.println(str.substring(7));//Returns a string that is a substring of this string. The substring begins with the character at the specified index andextends to the end of this string. 
		System.out.println(str.substring(7, 14));// The substring begins at the specified beginIndex andextends to the character at index endIndex 
		// if you put 14 then it will stop at 13
		System.out.println("============");

		// use of concat() method
		// it is used to add string
		String a= "Avnish ";
		String b= "is";
		String c= "clever";
		String d= "boy";

		System.out.println(a.concat(c));
		System.out.println(a.concat(" is clever boy")) ;
		// Create reference variable to save this data
		String result9 = a.concat(b);
		System.out.println(result9);
		System.out.println("============");

		// study of IndexOf method
		System.out.println(c.indexOf('e'));// showing index number also it shows first interaction result i.e. in clever e is 2 times but it will show index for first e
		// to find last e index we need to use lastIndexOf method
		System.out.println(c.lastIndexOf('e'));
		System.out.println(a.indexOf('h',2));// showing index of h from 2 letter but count from beginning
		System.out.println("============"); 

		// study of replace method
		String Country= "Ruccia";
		System.out.println(Country.replace('c','s'));// replace char c by char s
		System.out.println(Country.replace("cci", "ssi"));// replace string from cci to ssi
		System.out.println("============"); 
	}

}
