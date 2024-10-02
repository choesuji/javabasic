package mysql.bprepared;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Empselect_내버전 {

	// 0. 필요한 변수 선언
	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@192.168.0.47:1521:xe";  //컴퓨터를 찾는 주소, localhost(내컴퓨터)=127.0.0.1 동일함
	static String user = "scott";
	static String pass = "tiger";
	private static Statement ps;
	
	public static void main(String[] args) {
		
		try {
			// [1] 드라이버를 메모리 로딩 
			Class.forName(driver);
			//string 에 글자있는애들을 찾아서 로딩시켜줌
			
			// [2] SQL 문장 (******) 
			// 업무가 IT인 직원을 삭제하기 
			String sql = "SELECT * FROM emp";  // 디비버에 날림
					         
								
			System.out.println("[SQL] " + sql);  // 어떻게 출력되는지 확인하는 			
			
			//[3] 연결객체 얻어오기
			Connection con = DriverManager.getConnection(url,user,pass);
			
			//[4] 전송객체 얻어오기
			//Statement ps = con.createStatement();
			PreparedStatement rs = con.prepareStatement(sql);
			
			
			//[5] 전송
//			ResultSet rs = ps.executeQuery(sql);   //ResultSet 변수의타입=자료형
//			while(rs.next()) {
//				System.out.print(rs.getInt("EMPNO")     + "\t");
//				System.out.print(rs.getString("ENAME")  + "\t");
//				System.out.println(rs.getString("JOB"));
//			}
			
			/* int		    executeUpdate () : INSERT, UPDATE, DELETE, DDL
			 * ResultSet	executeQuery () : SELECT
			 */
			
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
