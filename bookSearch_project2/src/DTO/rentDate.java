package DTO;

public class rentDate {
	private String name;
	private String bookName;
	private int ID;
	private String rentDay;
	private String returnDay;
	
	public rentDate(String name,int ID,String bookName, String rentDay, String returnDay) {
		this.name=name;
		this.ID=ID;
		this.bookName=bookName;
		this.rentDay=rentDay;
		this.returnDay=returnDay;
	}
	
	public String getbookName() {
		return this.bookName;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public String getRentDay() {
		return this.rentDay;
	}
	public String getReturnDay() {
		return this.returnDay;
	}
}

