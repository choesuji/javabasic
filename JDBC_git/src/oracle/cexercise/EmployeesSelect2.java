package oracle.cexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeesSelect2 {


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
			//*************** [1] 드라이버를 메모리 로딩 ***************/
			Class.forName(driver);


			//[2] SQL
			//월급이 10000이상 받는 사원의 정보에서 사원명, 월급, 부서번호, 전화번호를 추출
			String sql 	= "	SELECT FIRST_NAME || ' '|| LAST_NAME full_name "
					+ ", SALARY , DEPARTMENT_ID , PHONE_NUMBER "
					+"	FROM EMPLOYEES " 
					+"	WHERE SALARY >= 10000";


			// [3] 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);


			// [4] 전송객체 얻어오기
			//Statement ps = con.createStatement();         
			ps = con.prepareStatement(sql);
			// *** sql문에서 ?가 없을 시 그냥 안쓰면 됨.. 


			// [5] 전송  //출력하고자 하는거 입력
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				System.out.print(rs.getString("full_name")    + "\t");
				System.out.print(rs.getInt("SALARY")   		  + "\t");
				System.out.print(rs.getInt("DEPARTMENT_ID")   + "\t");
				System.out.print(rs.getString("PHONE_NUMBER") + "\n");
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
