package dto;

public class memberVO {
	private String BookName;
	private String Author;
	private String Publisher;
	private String PublishingYear;
	private int Page;
	private String LibraryName;
	private String ID;
	private String StorePlace;
	private int CheckOutNum;
	private boolean isCheckOut;
	
	public memberVO(String BookName,
			 String Author,
			 String Publisher,
			 String PublishingYear,
			 int Page,
			 String LibraryName,
			 String ID,
			 String StorePlace,
			 int CheckOutNum,
			 boolean isCheckOut) {
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
	

	public String getName() {
		return this.BookName;
	}
	
}
