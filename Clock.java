public abstract class Clock {
	private String name;
	private int year;
	private String country;

	public Clock(String name, int year, String country) {
		this.name = name;
		this.year = year;
		this.country = country;

	}

	//getter
	public String getName(){
		return name;

	}

	public int getYear() {
		return year;

	}

	public String getCountry(){
		return country;

	}

	//setter
	public void setName(String name) {
		this.name = name;
	}

	public void setYear(int year){
		this.year = year;

	}

	public void setCountry(String country){
		this.country = country;

	}

	public abstract String description();

	public String html() {
		StringBuffer sb = new StringBuffer();
		sb.append("<HTML>\n\t<h2>");
		sb.append(name);
		sb.append("</h2>\n\t<h3>");
		sb.append("Year Made: ");
		sb.append( year);
		sb.append("</h3>\n\t<h3>");
		sb.append("Made in: ");
		sb.append(country);
		sb.append("</h3>\n\t<p>");
		sb.append(description());
		sb.append("</p>\n</HTML>");
		return sb.toString();

	}
/*
<HTML>
	<h2>The Ching Dynasty Clock</h2>
	<h3>Year made: 1782</h3>
	<h3>Made in England</h3>
	<p>The clock is powered by clockwork spring</p>
</HTML>


*/
}