package mysql.bprepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Empinsert2 {

	// 0. 필요한 변수 선언
	static String driver = "com.mysql.cj.jdbc.Driver";  //mysql연동시
	static String url = "jdbc:mysql://127.0.0.1:3306/basic";  //컴퓨터를 찾는 주소, localhost(내컴퓨터)=127.0.0.1 동일함
	static String user = "scott";
	static String pass = "tiger";

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("이름은?");
		String username = input.nextLine();

		System.out.println("사번은?");
		String usersabun = input.nextLine();

		System.out.println("업무는?");
		String userupmu = input.nextLine();

		System.out.println("월급은?");
		String usersal = input.nextLine();
		
		try {
			// [1] 드라이버를 메모리 로딩 
			Class.forName(driver);
			//string 에 글자있는애들을 찾아서 로딩시켜줌

			// [2] SQL 문장 (******) 
			// 사용자 입력값을 받는다고 가정
			int sabun   = 0;
			String irum = "";
			String upmu = "";
			int sal     = 0; 

			//습관적으로 공백 많이주고 띄우기
			String sql = "INSERT INTO emp (empno, ename, sal, job) "    
					+ " VALUES(	?, ?, ?, ? ) " ;


			// (5555, '하길동', 10000) 순수한 글자여야 함
			System.out.println("[SQL] " + sql);  // 어떻게 출력되는지 확인하는 			

			//[3] 연결객체 얻어오기
			Connection con = DriverManager.getConnection(url,user,pass);

			//[4] 전송객체 얻어오기
			PreparedStatement ps = con.prepareStatement (sql);

			ps.setInt(1,sabun);
			ps.setString(2, irum);
			ps.setInt(3,sal);
			ps.setString(4, upmu);				

			//[5] 전송  // 완벽한 전송객체 문장만 넣어줘야한다
			ps.executeUpdate();  

			//[6] 
			ps.close();
			con.close();



		} catch (ClassNotFoundException e) {
			System.out.println("드라이버로딩실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("연결실패" +e.getMessage());
			e.printStackTrace();


		} 

	}

}
