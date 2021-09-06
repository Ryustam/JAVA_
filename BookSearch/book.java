package BookSearch;

class Book {
	private String BookName;
	private String Author;
	private String Publisher;
	private String PublishingYear;
	private int Page;
	private String LibraryName;
	private int ID;
	private String StorePlace;
	private int CheckOutNum;
	private boolean isCheckOut;
	
	
	Book (String BookName,String Author,String Publisher,
			String PublishingYear,int Page,String LibraryName,int
			ID,String StorePlace,int CheckOutNum,boolean isCheckOut){
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
	
	public String getBookName() {
		return this.BookName;
	}
	
	public String getAuthor() {
		return this.Author;
	}
	
	public String getPublisher() {
		return this.Publisher;
	}
	
	public String getLibraryName() {
	
		return this.LibraryName;
	}
	
	public String getYear() {
		return this.PublishingYear;
	}
	
	
	
	public void showInfo() {
		System.out.printf("책이름:%s\n",this.BookName);
		System.out.printf("저자:%s\n",this.Author);
		System.out.printf("출판사:%s\n",this.Publisher);
		System.out.printf("출판년도:%s\n",this.PublishingYear);
		System.out.printf("페이지:%d\n",this.Page);
		System.out.printf("소장도서관:%s\n",this.LibraryName);
		System.out.printf("아이디:%s\n",this.ID);
		System.out.printf("소장처:%s\n",this.StorePlace);
		System.out.printf("대출횟수:%d\n",this.CheckOutNum);
		System.out.printf("대출여부:%b\n",this.isCheckOut);
		
	}
	
}
