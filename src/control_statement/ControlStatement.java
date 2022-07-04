package control_statement;

public class ControlStatement {

	public static void main(String[] args) {
		Switch not= new Switch();
		not.Week();
		int grade=75;
		if (grade >=76) {
			System.out.println("you are pass with distinction");
		}
		
		else if (grade>=56) {
			System.out.println("you are pass with second class");
			 if (grade<=34) {
				System.out.println("you are failed");
				
			} else{System.out.println("you are pass ");}
		}
		else {System.out.println("you are pass ");}
	}

}
