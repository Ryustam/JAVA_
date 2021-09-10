package arrayList;

import java.util.ArrayList;

public class ex01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		int len = arrayList.size();
		int num=0;
		System.out.println("arrayList길이:"+len);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		len = arrayList.size();
		System.out.println("arrayList길이:"+len);
		
		num =arrayList.get(1);
		System.out.println("arrayList index 1번재값:"+num);
		
		arrayList.remove(1);//1번째 값 제거
		
		num =arrayList.get(1);
		System.out.println("arrayList index 1번재값:"+num);
		
	}

}
