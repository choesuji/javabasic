package f_exception;

import java.io.FileInputStream;

public class Ex03_Throws {


	public static void main(String[] args) {
		try {
			readFile();
			System.out.println("파일처리 성공");
		} catch (Exception ex) {
			System.out.println("예외발생:" + ex.getMessage());
			// ex.printStackTrace();
		}
	}

	static void readFile() throws Exception { // 던지세요 : 메소드 + threws
		FileInputStream fis = null ;
		try {
			fis = new FileInputStream("happy.txt");
		}finally {
			fis. close ();
		}

	} //end 
}