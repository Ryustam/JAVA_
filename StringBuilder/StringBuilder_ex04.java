package StringBuilder;

public class StringBuilder_ex04 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(100);
		sb.append("자바");
		System.out.println(sb+":"+sb.capacity());
		sb.trimToSize();
		System.out.println(sb+":"+sb.capacity());
		//trimToSize 실제 문자열 크기에 맞게 맞춤
	}

}
