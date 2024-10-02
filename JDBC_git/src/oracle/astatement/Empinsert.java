package oracle.astatement;

import java.sql.*;


public class Empinsert {

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
			String sql = "INSERT INTO emp(empno, ename, sal)  "    //습관적으로 공백 많이주고 띄우기
						+ " VALUES(5556, '하길동', 10000) " ;       // (5555, '하길동', 10000) 순수한 글자여야 함
			System.out.println("[SQL] " + sql);  // 어떻게 출력되는지 확인하는 			
			
			//[3] 연결객체 얻어오기
			Connection con = DriverManager.getConnection(url,user,pass);
			
			//[4] 전송객체 얻어오기
			Statement ps = con.createStatement();
			
			//[5] 전송
			ps.executeUpdate(sql);
			
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
