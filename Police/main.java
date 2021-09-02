package Police;


//police is a Gun
//기능은 물려줘야될거 같은데
//is-a관계로 판별해보면 어색하다
//이런 관계는 상속을 해도 되긴하는데
//상속 대신 포함관계로 처리한다.

class Police {
	
	private String rank;
	private String name;
	
	Police(){
		this.rank="기본계급";
		this.name="기본이름";
	}
	
	Police(String rank, String name){
		this.rank=rank;
		this.name=name;
	}
	
	public String getRank() {
		return rank;
	}
	
	public String getName() {
		return name;
	}
	
	public void Introduce() {
		System.out.printf("계급:%s\n",rank);
		System.out.printf("이름:%s\n",name);
	}
	
	
}

class Gun extends Police{
	private int bullet;
	private int box_bullet;
	
	
	Gun(){
		super();
		this.bullet=0
		this.box_bullet=0;
	}
	
	Gun(String rank, String name, int bullet){
		super(rank,name);
		this.bullet=bullet;
		this.box_bullet=bullet;
	}
	
	public void Introduce() {
		super.Introduce();
		System.out.printf("남은총알:%d\n",bullet);
	}
	
	
	public void fire() {
		for(int i=0;i<=box_bullet;i++) {
			reload();
			this.bullet--;
			System.out.printf("<%s>%s가 총을 쐈습니다. 남은총알:%d\n",getRank(),getName(),bullet);
		}
	}
	
	public void reload() {
		if(bullet==0) {
			System.out.println("재장전이 필요합니다.");
			bullet += box_bullet;
			System.out.println("재장전 완료");
		}
	}
	
}


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gun s1 = new Gun("경찰","도도",6);
		Gun s2 = new Gun();
		s2.Introduce();
		s1.Introduce();
		s1.fire();
	}

}
