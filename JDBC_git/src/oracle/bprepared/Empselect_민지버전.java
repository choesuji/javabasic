package oracle.bprepared;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Empselect_민지버전 {
	 // [0] 필요한 변수 선언
	   static String driver = "oracle.jdbc.driver.OracleDriver";

	   static String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	   // 방식이 thin, java 두가지가 있어서 뭔지 지정해줘야함
	   // thin(방식):@(ip or localhost):(port번호)
	   // static String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"

	   static String user = "scott"; // 계정
	   static String pass = "tiger"; // 비번
	         
	         
	   public static void main(String[] args) {
	      
	      try {
	         /*************** [1] 드라이버를 메모리 로딩 ***************/
	         Class.forName(driver);
	         
	         /*************** [2]    SQL 문장 ***************/
	         String sql    = "SELECT * FROM emp";
	         System.out.println("[SQL] : " + sql);
	         
	         // [3] 연결 객체 얻어오기
	         Connection con = DriverManager.getConnection(url, user, pass);
	         
	         
	         // [4] 전송객체 얻어오기
	         //Statement ps = con.createStatement();         
	         PreparedStatement ps = con.prepareStatement(sql);
	         // *** sql문에서 ?가 없을 시 그냥 안쓰면 됨.. 
	         
	         // [5] 전송
	         /*   
	          *       int       executeUpdate() : INSERT, UPDATE, DELETE, DDL
	          *       ResultSet    executeQuery()   : SELECT
	          * 
	          *       INSERT, UPDATE, DELETE를 실행하면 DB CONSOLE에서 나오는 결과는 'N개 명령을 실행 완료했다!' 이런 지문
	          *       SELECT를 실행하면 DB CONSOLE에서 나오는 결과가 TABLE 형태
	          * 
	          *       => 따라서 무슨 QUERY를 실행하냐에 따라서 쓰는 함수가 다르다! 
	          * 
	          */
	         
	         ResultSet rs = ps.executeQuery();   // *** sql을 미리 위에서 저장했기 때문에 여기서는 저장 ㄴㄴ
	         
	         // 출력 하고자 하는 table의 row 수를 모르기 때문에 for문이 아닌 while문을 사용
	         while(rs.next()) {
	            System.out.print(rs.getInt("EMPNO")    + "\t");
	            System.out.print(rs.getString("ENAME")   + "\t");
	            System.out.print(rs.getString("JOB")   + "\n");
	         }
	         
	         // [6] 닫기
	         ps.close();
	         con.close();
	         
	      } catch (ClassNotFoundException e) {
	         System.out.println("드라이버 로딩 실패");
	         e.printStackTrace();
	      } catch (SQLException e) {
	         System.out.println("연결실패 " + e.getMessage());
	      } // end of try catch : 예외 발생 처리를 위해 try-catch문 사용
	      
	      
	   } // end of main()

	} // end of EmpInsert

	
	
		 

