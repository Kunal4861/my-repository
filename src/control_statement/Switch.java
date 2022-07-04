package control_statement;

public class Switch {

	public static void main(String[] args) {
		Switch yes=new Switch();
		
		yes.Week();
		int month=14;
		switch(month) {
		case 1: System.out.println(" january");
		break;
		case 2: System.out.println(" feb");
		break;
		case 3: System.out.println(" march");
		break;
		case 4: System.out.println(" april");
		break;
		case 5: System.out.println(" may");
		break;
		case 6: System.out.println(" june");
		break;
		case 7: System.out.println(" julay");
		break;
		case 8: System.out.println(" aug");
		break;
		case 9: System.out.println(" september");
		break;
		case 10: System.out.println(" octomber");
		break;
		case 11: System.out.println(" november");
		break;
		case 12: System.out.println(" december");
		
		break;
		
		default: System.out.println("invalid month");
		break;
		
		
		}

	}
	public void Week() {
		String week= "holiday";
		switch(week) {
		case "monday": System.out.println("it is first day of week");
		break;
		case "tuesday": System.out.println("it is second day of week");
		break;
		case "wednesday": System.out.println("it is third day of week");
		break;
		case "thursday": System.out.println("it is fourth day of week");
		break;
		case "friday": System.out.println("it is fifth day of week");
		break;
		case "saturday": System.out.println("it is sisth day of week");
		break;
		case "sunday": System.out.println("it is seventh day of week");
		break;
		default: System.out.println("invalid day ");
		break;
		
		}
				
	}

}
