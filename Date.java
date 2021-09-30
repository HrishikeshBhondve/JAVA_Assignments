package day3;
public class Date {
	private int day;
	private int year;
	private String month;
	
	
	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getMonth() {
		return month;
	}


	public void setMonth(String month) {
		this.month = month;
	}


	void displayDate()
	{
		System.out.println("Today:\t"+getDay()+" "+getMonth()+" "+getYear());
	}
}
	