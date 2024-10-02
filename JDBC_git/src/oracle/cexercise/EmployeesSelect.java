package oracle.cexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeesSelect {


	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	// 방식이 thin, java 두가지가 있어서 뭔지 지정해줘야함
	// thin(방식):@(ip or localhost):(port번호)
	// static String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"
	static String user = "hr"; // 계정
	static String pass = "hr"; // 비번

	public static void main(String[] args) {

		Connection con = null;  //초기화 습관화
		PreparedStatement ps = null;   

		try
		{
			/*************** [1] 드라이버를 메모리 로딩 ***************/
			Class.forName(driver);


			//[2] SQL
			//사원의 이름, 부서명, 업무명 출력
			String sql 	= "	SELECT e.FIRST_NAME ,j.JOB_TITLE, d.DEPARTMENT_NAME  "
						+ " FROM EMPLOYEES e, DEPARTMENTS d, JOBS j  "
						+ " WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID  "
						+ " AND e.JOB_ID=j.JOB_ID ";
			

			// [3] 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);


			// [4] 전송객체 얻어오기
			//Statement ps = con.createStatement();         
			ps = con.prepareStatement(sql);
			// *** sql문에서 ?가 없을 시 그냥 안쓰면 됨.. 


			// [5] 전송  //출력하고자 하는거 입력  --건드리는부분
			ResultSet rs = ps.executeQuery();

			while(rs.next()) { // 건드리는 부분
				System.out.print(rs.getString("FIRST_NAME")+         "\t");
				System.out.print(rs.getString("JOB_TITLE")+          "\t"); 
				System.out.print(rs.getString("DEPARTMENT_NAME")+    "\n");
			} // end of while
			
				} catch(Exception ex) { //예외처리시 확인하는거 
			System.out.println("예외 :" + ex.getMessage());
					}finally {	      
			
						// [6] 닫기		
						try {
							ps.close();
							con.close();
						}catch(Exception ex) {}
						} //end of finally


	} // end of main

} // end of class
