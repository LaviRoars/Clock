public class Test {

	public static void main(String args[]) {
		MechanicalClock mc1 = new MechanicalClock("The Ching Dynasty Clock", 1782, "England", true);
		MechanicalClock mc2 = new MechanicalClock("German Clock", 1760, "Germany", false);

		ElectronicClock ec1 = new ElectronicClock("AC Clock", 1900, "China", true);
		ElectronicClock ec2 = new ElectronicClock("Battery Clock", 1980, "Hong Kong", false);


		Clock clocks[] = new Clock[4];
		clocks[0] = mc1;
		clocks[1] = mc2;
		clocks[2] = ec1;
		clocks[3] = ec2;

		for(Clock c : clocks) {
			System.out.println( c.html() );
			System.out.println();
		}

	}

}