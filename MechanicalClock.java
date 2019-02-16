public class MechanicalClock extends Clock {

	private boolean isClockworkSpring;

	public MechanicalClock(String name, int year,
							String country, boolean c){
		super(name,year,country);
		isClockworkSpring = c;

	}

	public boolean isClockworkSpring(){
		return isClockworkSpring;

	}

	public void setClockworkSpring(boolean c){
		isClockworkSpring = c;
	}

	public String description(){
		if(isClockworkSpring)
			return "The clock is powered by clockwork spring";
		return "The clock is powered by weight";

	}

}