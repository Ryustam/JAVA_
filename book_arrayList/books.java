package book_arrayList;

class books {
	private String sign;
	private String name;
	private String writer;
	private String provider;
	private String year;
	private String library;
	
	books(){}
	
	books(String sign,String name,String writer,String provider,String year, String library){
		this.sign=sign;
		this.name=name;
		this.writer=writer;
		this.provider=provider;
		this.year=year;
		this.library=library;
	}
	
	public String getName() {
		return this.name;
	}
	public String getWriter() {
		return this.writer;
	}
	public String getProvider() {
		return this.provider;
	}
	public String getLibrazy() {
		return this.library;
	}
	public String getYear() {
		return this.year;
	}
	public String getSign() {
		return this.sign;
	}
	public void setLibrary(String library) {
		this.library=library;
	}
	
	public void showInfo() {
		System.out.printf("청구기호: %s\n",sign);
		System.out.printf("제목: %s\n",name);
		System.out.printf("저자: %s\n",writer);
		System.out.printf("출판사: %s\n",provider);
		System.out.printf("출판년도: %s\n",year);
		System.out.printf("소장처: %s\n",library);
		System.out.println();
	}
}
