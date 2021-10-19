package DTO;

public class memberVO {
	private String BookName;
	private String Author;
	private String Publisher;
	private String PublishingYear;
	private int Page;
	private String LibraryName;
	private int ID;
	private String StorePlace;
	private int CheckOutNum;
	private String isCheckOut;
	
	public memberVO(String BookName,
			 String Author,
			 String Publisher,
			 String PublishingYear,
			 int Page,
			 String LibraryName,
			 int ID,
			 String StorePlace,
			 int CheckOutNum,
			 String isCheckOut) {
		this.BookName=BookName;
		this.Author=Author;
		this.Publisher=Publisher;
		this.PublishingYear=PublishingYear;
		this.Page=Page;
		this.LibraryName=LibraryName;
		this.ID=ID;
		this.StorePlace=StorePlace;
		this.CheckOutNum=CheckOutNum;
		this.isCheckOut=isCheckOut;
	}
	
	public memberVO(String BookName,int ID) {
		this.BookName=BookName;
		this.ID=ID;
	}
	
	public memberVO(String BookName,int CheckOutNum,String isCheckOut) {
		this.BookName=BookName;
		this.CheckOutNum=CheckOutNum;
		this.isCheckOut=isCheckOut;
	}
	
	
	
	public String getBookName() {
		return this.BookName;
	}
	public String Author() {
		return this.Author;
	}
	public String getPublisher() {
		return this.Publisher;
	}
	public String getPublishingYear() {
		return this.PublishingYear;
	}
	public int getPage() {
		return this.Page;
	}
	public String getLibraryName() {
		return this.LibraryName;
	}
	public int getID() {
		return this.ID;
	}
	public String getStorePlace() {
		return this.StorePlace;
	}
	public int getCheckOutNum() {
		return this.CheckOutNum;
	}
	public int setCheckOutNum() {
		return this.CheckOutNum;
	}
	public String getisCheckOut() {
		return this.isCheckOut;
	}
	
	
	
}
