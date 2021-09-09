package wrapper;

public class ex02 {

	public static void main(String[] args) {
		Integer obj1 = Integer.valueOf(2018);
		Integer obj2 = Integer.valueOf(38);
		Integer obj3 = Integer.valueOf(18);
		
		make_ID(obj1,obj2,obj3);
	}
	public static void make_ID(Object obj1,Object obj2,Object obj3) {
		System.out.print("학번생성:");
		String result =
				obj1.toString()+"0"
				+obj2.toString()+"0"
				+obj3.toString();
		System.out.println(result);
	}
}
