package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ex01 {

	public static void main(String[] args) {
		//키보드로 입력하면
		//표준 입력스트림 타고, 변수에 저장된다.
		
		//printf하면
		//표준 출력스트림 타고. 모니터에 출력된다.
		
		//스트림 (stream)
		//시냇물, 줄기, 흐르다
		//데이터가 이 통로로 흐른다.
		//스트림도 입력스트림, 출력스트림
		
		try {
			File file= new File("C:\\Users\\응슌\\Desktop\\JAVA\\sample.txt");
			//파일 객체 생성
			FileReader fileReader = new FileReader(file);
			//파일 입력스트림 생성하고 파일 연결
			int singleCh=0;
			while( (singleCh=fileReader.read())!= -1) {
				System.out.print((char)singleCh);
			} // 파일에서 읽어들인값이 -1이 아닌동안 진행하여 출력
			fileReader.close();
			//fileReader객체 해제
		}catch(FileNotFoundException e) {
			//파일이 발견되지 않을경우 실행되는 예외
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
