package arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Double> arrayList=new ArrayList<Double>();
		
		arrayList.add(1.1);
		arrayList.add(2.2);
		arrayList.add(3.3);
		
		arrayList.ensureCapacity(500);
		
		for(int i=0 ;i<arrayList.size();i++) {
			System.out.print(arrayList.get(i)+" ");
		}
	}

}
