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
		
		System.out.println("---�Ǹ���---");
		seller.showSaleResult();
		buyer.showBuyResult();
		System.out.println("���1���� ����:1000��");
		System.out.println("��ġ ����� �����Ͻðڽ��ϱ�?");
		num=sc.nextInt();
		
		buyer.buyApple(seller, num);
		//System.out.printf("�Ǹ��ڿ��� %d��ġ ����� �����ߴ�!\n",num);
		
		System.out.println("---�Ǹ���---");
		seller.showSaleResult();
		buyer.showBuyResult();
	}

}
