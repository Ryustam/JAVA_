package fileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ex04 {

	public static void main(String[] args) {
		File file = new File("./text.txt");
		//./ -현재위치
		//./text.txt<-프로젝트 현재 위치에서 text.txt 파일 생성
		//프로젝트 현재 위치에서 text.txt 파일을 이용해서
		//파일 객체를 생성한다.
		
		//파일 객체 생성
		
		String str = "Hello World";
		
		try {
			BufferedWriter writer = new BufferedWriter (new FileWriter(file));
			writer.write(str);
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
