package fruit;

import java.util.Scanner;

import fruit.FruitBuyer;
import fruit.FruitSeller;

public class FruitMain {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		FruitSeller seller = new FruitSeller(20,0);
		FruitBuyer buyer = new FruitBuyer(30000,0);
		
		System.out.println("---판매전---");
		seller.showSaleResult();
		buyer.showBuyResult();
		System.out.println("사과1개의 가격:1000원");
		System.out.println("얼마치 사과를 구해하시겠습니까?");
		num=sc.nextInt();
		
		buyer.buyApple(seller, num);
		//System.out.printf("판매자에게 %d원치 사과를 구매했다!\n",num);
		
		System.out.println("---판매후---");
		seller.showSaleResult();
		buyer.showBuyResult();
	}

}
