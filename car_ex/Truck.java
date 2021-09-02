package car_ex;

class Truck extends Car{
	private int load;
	private int max_load;
	
	public Truck(String name, String provider, int price, int load, int max_load) {
		super(name, provider, price);
		this.load=load;
		this.max_load=max_load;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.printf("현재적재량:%d\n",this.load);
		System.out.printf("최대적재가능:%d\n\n",this.max_load);
	}
	
	public void inspectLoad() {
		System.out.println(super.getName());
		System.out.printf("최대 적재량은 %dkg 현재 %dkg 적재했습니다.\n",this.max_load,this.load);
		if(this.load<=this.max_load) {
			System.out.printf("남은 적재량은 %dkg입니다.\n\n", this.max_load-this.load);
		} else {
			System.out.println("적재가능량을 초과했습니다.");
			System.out.println("적재물품을 빼십시오.\n");
		}
	}
	
}
