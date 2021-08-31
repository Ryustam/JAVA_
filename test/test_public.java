package test;

//접근제어 지시지ㅏ가 public인 
public class test_public {

		private int num;
		//private 접근 제어 지시자를 사용해서
		//데이터를 외부로부터 숨김
		// 데이터 외부접근 차단이 정보은닉을 적용하는것
		public test_public() {
			//디폴트 생성자
			num =0;
		}
		
		//입력이 있는 생성자
		public test_public(int num) {
			this.num=num;
		}
		
		public void showNum() {
			System.out.printf("num:%d\n", num);
		}
		
}
