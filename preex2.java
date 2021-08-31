import java.util.Scanner;


public class preex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i,count=0;
		String text;
		text=sc.next();
		
		String arr[] = text.split("");		
		
		//System.out.println(text.length());
		
		for(i=0;i<text.length()/2;i++) {
			if(arr[i].equals(arr[text.length()-(i+1)])) {
				count++;
			}
		}
		if(count == text.length()/2) {
			System.out.print(text);
			System.out.println("회문이 맞습니다.");
		}else {
			System.out.print(text);
			System.out.println("회문이 아닙니다.");
		}
		
		
	
	}

}
