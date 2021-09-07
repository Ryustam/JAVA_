package StringBuilder;

public class StringBuilder_ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("푸른 산빛을");
		sb.ensureCapacity(50);
		printStringBuilder(sb);
		sb.append("깨치고 적은 길을 걸어서 참어 떨치고 갔습니다.");
		printStringBuilder(sb);
		sb.insert(10,"단풍나무 숲을 향해서 난");
		printStringBuilder(sb);
	}

	static void printStringBuilder(StringBuilder sb) {
		String str = sb.toString();
		int len = sb.length();
		int bufSize = sb.capacity();
		System.out.printf("%s(%d):%d \n", str,len,bufSize);
	}

}
