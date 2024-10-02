package oracle.cexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class TempInsert {

	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	// 방식이 thin, java 두가지가 있어서 뭔지 지정해줘야함
	// thin(방식):@(ip or localhost):(port번호)
	// static String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"
	static String user = "scott"; // 계정
	static String pass = "tiger"; // 비번


	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("너의 이름은?");
		String username = input.nextLine();


		try
		{
			/*************** [1] 드라이버를 메모리 로딩 ***************/
			Class.forName(driver);


			//[2] SQL
			String sql 	= " INSERT INTO temp (no, name, indate) "
					+ " VALUES(seq_temp_no.nextval, ? , sysdate)";  // input으로 입력받게된다면 여기 ? 로 바꿔주기

			// [3] 연결 객체 얻어오기
			Connection con = DriverManager.getConnection(url, user, pass);


			// [4] 전송객체 얻어오기
			//Statement ps = con.createStatement();         
			PreparedStatement ps = con.prepareStatement(sql);
			// *** sql문에서 ?가 없을 시 그냥 안쓰면 됨.. 
			ps.setString(1, username);

			// [5] 전송  //출력하고자 하는거 입력
			int result = ps.executeUpdate();
			System.out.println(result + "행을 입력");

			//[6]닫기
			ps.close();
			con.close();

		}catch(Exception ex) {
			System.out.println("예외 :" + ex.getMessage());
		} // end of catch


	}// end of main

}// end of class
