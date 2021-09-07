package Smartphone_search;

public class phoneSearch {
	private String name;
	private String company;
	private String price;
	private String provider;
	private int weight;
	private String color;
	
	phoneSearch(String name,String company,String price,String provider,int weight,String color){
		this.name=name;
		this.company=company;
		this.price=price;
		this.provider=provider;
		this.weight=weight;
		this.color=color;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getCompany() {
		return this.company;
	}
	public String getPrice() {
		return this.price;
	}
	

	public void showInfo() {
		System.out.printf("모델형:%s\n",this.name);
		System.out.printf("제조사:%s\n",this.company);
		System.out.printf("가격:%s\n",this.price);
		System.out.printf("통신사:%s\n",this.provider);
		System.out.printf("무게:%d\n",this.weight);
		System.out.printf("색상:%s\n\n",this.color);
	}
		
	
}
