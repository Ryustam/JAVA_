package Smartphone_search;

import java.util.StringTokenizer;

class priceCalc {
	
	private int start_price;
	private int end_price;
	
	priceCalc(int start_price,int end_price){
		this.start_price=start_price;
		this.end_price=end_price;	
	}
	
	public void Calc(phoneSearch phone) {
		if(phone == null) {
			return;
		}
		
		StringTokenizer price_stok = new StringTokenizer(phone.getPrice());
		int value =Integer.parseInt(price_stok.nextToken());
		
		if(value>=start_price && value<=end_price) {
			phone.showInfo();
		}
	}
	
	
}
