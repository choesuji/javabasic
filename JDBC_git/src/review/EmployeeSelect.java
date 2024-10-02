package review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/*
 * 부서번호를 입력받아서 해당 부서의 사원들의 full name과 연봉(salary+comm)
 * 그리고 해당부서의 부서명을 출력
 * 
 */
public class EmployeeSelect {

	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	// 방식이 thin, java 두가지가 있어서 뭔지 지정해줘야함
	// thin(방식):@(ip or localhost):(port번호)
	// static String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"
	static String user = "hr"; // 계정
	static String pass = "hr"; // 비번

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("부서번호 입력하슈");
		int buseo = input.nextInt(); 


		Connection con = null;  //초기화 습관화
		PreparedStatement ps = null; 

		try
		{
			//*************** [1] 드라이버를 메모리 로딩 ***************/
			Class.forName(driver);

			//[2] SQL
			String sql =" SELECT  e.FIRST_NAME || ' '|| e.LAST_NAME full_name "
					+ " ,100*(e.COMMISSION_PCT+1) sal_sum "
					+ " ,d.DEPARTMENT_NAME "
					+ " FROM EMPLOYEES e INNER JOIN DEPARTMENTS "
					+ " ON e.DEPARTMENT_ID = d.DEPARTMENT_ID ";


			// [3] 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);			

			// [4] 전송객체 얻어오기
			//Statement ps = con.createStatement();         
			ps = con.prepareStatement(sql);
			// *** sql문에서 ?가 없을 시 그냥 안쓰면 됨.. 
			ps.setInt(1, buseo);


			// [5] 전송  //출력하고자 하는거 입력
			int result = ps.executeUpdate();
			System.out.println(result + "행을 입력");


			// [6] 닫기		
			ps.close();
			con.close();


		} catch(Exception ex) { //예외처리시 확인하는거 
			System.out.println("예외 :" + ex.getMessage());		      
		} // end of catch

		
	} // end of main

}//end of class




