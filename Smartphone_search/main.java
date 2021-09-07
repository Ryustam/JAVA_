package Smartphone_search;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		phoneSearch phone[] = new phoneSearch[20];
		
		phone[0]=new phoneSearch("갤럭시 7","삼성","320000","SKT",600,"화이트");
		phone[1]=new phoneSearch("갤럭시 7","삼성","300000","LG U+",600,"블루");
		phone[2]=new phoneSearch("갤럭시 7","삼성","310000","KT",600,"블랙");
		phone[3]=new phoneSearch("갤럭시 8","삼성","400000","SKT",500,"블루");
		phone[4]=new phoneSearch("갤럭시 8","삼성","410000","SKT",600,"화이트");
		phone[5]=new phoneSearch("갤럭시 8","삼성","420000","SKT",500,"블루");
		phone[6]=new phoneSearch("G7","LG","250000","LG U+",650,"화이트");
		phone[7]=new phoneSearch("G7","LG","240000","KT",650,"블루");
		phone[8]=new phoneSearch("G8","LG","300000","LG U+",600,"실버");
		phone[9]=new phoneSearch("G8","LG","310000","SKT",600,"골드");
		phone[10]=new phoneSearch("아이폰12 Pro","Apple","1350000","SKT",600,"실버");
		phone[11]=new phoneSearch("아이폰12","Apple","950000","SKT",600,"레드");
		
		userFace s1 = new userFace();
		s1.mainOut(phone);
		
	}

	

}
