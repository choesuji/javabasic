package mysql.bprepared;

import java.sql.*;


public class EmpUpdate {

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
			// 사번 5555 사원의 업무를 IT로 추가하고 부서번호를 30으로 지정하기 
			String sql = "UPDATE  emp " 
					     +" ,SET ename = ?  "
					     +"  ,job= ? "    //습관적으로 공백 많이주고 띄우기
						 +"  ,sal= ? "
						 + " WHERE empno = ? "; 		
			
			// 7844 사원의 정보를 이름, 업무, 급여 수정하기 
			
			
			
			////습관적으로 공백 많이주고 띄우기
			System.out.println("[SQL] " + sql);  // 어떻게 출력되는지 확인하는 			
			
			//[3] 연결객체 얻어오기
			Connection con = DriverManager.getConnection(url,user,pass);
			
			//[4] 전송객체 얻어오기
			/*
			 * Statement : 완벽한 SQL문장
			 * PreparedStatement : 미완성한 SQL 문장
			 * CallableStatement : PL-SQL 함수 (function/procedure) 호출
			 */
			
			//미완성 채우기 
//			ps.setString(1, irum);
//			ps.setString(2, upmu);
//			ps.setInt(3, sal);
//			ps.setInt(4, sabun);
			
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
