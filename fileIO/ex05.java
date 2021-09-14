package fileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		File file = new File("./text_char.txt");
		char ch = 0;
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			Scanner sc = new Scanner(System.in);
			
			while(ch!='q') {
				ch=sc.nextLine().charAt(0);
				writer.write(ch+" ");	
			}
			writer.close();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
