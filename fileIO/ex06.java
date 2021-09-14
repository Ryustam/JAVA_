package fileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		File file = new File("./text_line.txt");
		String str ="";
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			Scanner sc = new Scanner(System.in);
			
			while(str.equals("quit")!=true) {
				str = sc.nextLine();
				writer.write(str+"\n");
			}
			writer.close();
		}catch (IOException e) {
			e.printStackTrace();
		}


	}

}
