package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String str;
		System.out.println("단어를 입력하세요.");
		str=sc.next();
		
		try {
			File file= new File("C:\\Users\\응슌\\Desktop\\JAVA\\sample.txt");
			//파일 객체 생성
			FileReader fileReader = new FileReader(file);
			//파일 입력스트림 생성하고 파일 연결
			BufferedReader bufReader = new BufferedReader(fileReader);
			
			String line = "";
	
			
			StringTokenizer check;
			int count =0;
			while((line = bufReader.readLine()) != null) {
				System.out.println(line);
				check = new StringTokenizer(line," ");
				while(check.hasMoreTokens()) {
					if(check.nextToken().equals(str)==true) {
						count++;
					}
				}
				
			} // 파일에서 읽어들인값이 -1이 아닌동안 진행하여 출력
			System.out.printf("%s: %d개",str,count);
			bufReader.close();
			//fileReader객체 해제
		}catch(FileNotFoundException e) {
			//파일이 발견되지 않을경우 실행되는 예외
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
