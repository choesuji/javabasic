package mysql.bprepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class EmpDelete {

	// 0. 필요한 변수 선언
	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";  //컴퓨터를 찾는 주소, localhost(내컴퓨터)=127.0.0.1 동일함
	static String user = "scott";
	static String pass = "tiger";

	public static void main(String[] args) {

		try {
			// [1] 드라이버를 메모리 로딩 
			Class.forName(driver);
			//string 에 글자있는애들을 찾아서 로딩시켜줌

			// [2] SQL 문장 (******) 
			// 사용자 입력값을 받는다고 가정
			int sabun   = 3334;
			String irum = "이길자";
			String upmu = "IT";
			int sal     = 10000;

			//업무가 IT인 사원의 정보를 삭제
			String sql = "DELETE FROM emp "
					+ " WHERE job = 'IT' ";

			//[3] 연결객체 얻어오기
			Connection con = DriverManager.getConnection(url,user,pass);

			//[4] 전송객체 얻어오기
			/*
			 * Statement : 완벽한 SQL문장
			 * PreparedStatement : 미완성한 SQL 문장
			 * CallableStatement : PL-SQL 함수 (function/procedure) 호출
			 */

			//Statement ps = con.createStatement();
			PreparedStatement ps = con.prepareStatement (sql);

			//미완성부분 채우기
//			ps.setInt(1,sabun);
//			ps.setString(2, irum);
//			ps.setInt(3, sal);
//			ps.setString(4, upmu);


			//[5] 전송  // 완벽한 전송객체 문장만 넣어줘야한다
			//ps.executeUpdate(sql);  //**************************
			ps.executeUpdate();      //******************* sql 전송안함 (미리 함)

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
