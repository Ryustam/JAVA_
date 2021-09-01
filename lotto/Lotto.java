package lotto;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	
	private boolean buy;
	private final int price=1000;
	private int games;
	private int arr[][];
	private String code = "구매안함";
	private Random rand = new Random();
	private Scanner sc = new Scanner(System.in);
	
	
	Lotto() {
		arr=new int[11][7];
		
	}
	
	public int[][] getArr() {
		return this.arr;
	}
	
	
	public void buyLotto(int num) {
		
		this.games=num;
		
		int temp;
		int numCount=1;
		int i,j;
		
		for(i=1;i<=num;i++) {
			while(true) {
				temp=rand.nextInt(45)+1;
				
				for(j=1;j<numCount;j++) {
					if(arr[i][j]==temp) {
						break;
					}
				}	
				if(numCount==j) {
					arr[i][numCount]=temp;
					numCount++;
				}
				if(numCount>=7) {
					break;
				}
				
			}
			numCount=1;
		}
	}
	
	public void showLottoInfo() {
		int i,j;
		for(i=1;i<=this.games;i++){
			System.out.printf("%d회차 번호: ",i);
			for(j=1;j<=6;j++) {
				System.out.printf("%d ",arr[i][j]);
			}
			System.out.println("");
		}
	}

	public int userOut() {
		int num=0;
		while(true) {
			System.out.println("얼마치의 로또를 구매하시겠습니까?(최대 10000원)");
			num=sc.nextInt();
			if(num>10000) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}else {
				break;
			}
		}
		this.code="구매완료";
		return num/1000;
	}
	
	public void arrange(int arr[][]) {
		int i,j,k;
		int temp;
		for(k=1;k<=this.games;k++) {
			for (i=1;i<6;i++) {
				for(j=i+1;j<=6;j++) {
					if(arr[k][i]>arr[k][j]) {
						temp=arr[k][j];
						arr[k][j]=arr[k][i];
						arr[k][i]=temp;
					}	
				}
			}
		}
	}
	
	public void start() {
		
		
		this.buyLotto(this.userOut());
		this.arrange(this.getArr());
		this.showLottoInfo();
	}
}
