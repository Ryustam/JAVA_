package car_manage;


class Bike1 extends Vehicle1{
		private String name;
		private String provider;
		private int price;
		
		Bike1(){
			
		}
		
		Bike1(String ID,String name, String provider, int price){
			super(ID,name,provider,price);
		}	

		public void showInfo() {
			super.showInfo();
		}
		
}
