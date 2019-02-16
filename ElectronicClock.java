public class ElectronicClock extends Clock {
	private boolean isACPowered; //if not powered by Battery

	public ElectronicClock(String name, int year, String country,
							boolean isACPowered){
		super(name, year, country);
		this.isACPowered = isACPowered;

	}

	public boolean isACPowered(){
		return isACPowered;

	}

	public void setACPowered (boolean b){
		isACPowered = b;
	}

	public String description(){
		if(isACPowered)
			return "The clock uses AC";
		return "The clock uses batteries";

	}

}