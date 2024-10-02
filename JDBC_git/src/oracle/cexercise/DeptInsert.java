package oracle.cexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 부서번호 : 90
 * 부서명 : it
 * 위치 : 신촌 	 
 */
public class DeptInsert {

	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@192.168.0.1:1521:xe";  //컴퓨터를 찾는 주소, localhost(내컴퓨터)=127.0.0.1 동일함
	static String user = "scott";
	static String pass = "tiger";

	public static void main(String[] args) {

		try {
			// [1] 드라이버를 메모리 로딩 
			Class.forName(driver);

			// [2] SQL 문장 (******) 
			int dno = 90;
			String dname = "IT";
			String addr = "신촌";	
			
			String sql = "INSERT INTO dept(deptno,dname,loc)  "  //SQL과 컬럼명 동일해야한다 AQL로 들어가기 때문에
					+ "VALUES (?,?,?)";

			System.out.println("[SQL] " + sql); 
			
			//[3] 연결객체 얻어오기
			Connection con = DriverManager.getConnection(url,user,pass);
			
			//[4] 전송객체 얻어오기
			PreparedStatement ps = con.prepareStatement (sql);  //(?,?,?)로 했기때문에 이거를 씀 (미완성)
			
			//미완성부분 채우기  -- 자바의 변수를 땡겨오는거라 자바의 변수 사용한다
			ps.setInt(1,dno); 
			ps.setString(2, dname);			
			ps.setString(3, addr );
			
			//[5] 전송  // 완벽한 전송객체 문장만 넣어줘야한다
			ps.executeUpdate();
			
			//[6] 닫기
			ps.close();
			con.close();
			
		
		}catch (Exception e ) {
			System.out.println("예외처리완료"+e.getMessage());
		}//end of try catch

	}//end of main

}// end of class
