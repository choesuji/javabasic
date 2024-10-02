package oracle.cexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpCount {

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
		
		//[2] SQL 문장
		String sql = "SELECT count(*) as cnt FROM emp";
		
		
		//[3] 연결객체 얻어오기
		Connection con = DriverManager.getConnection(url, user, pass);
		
		//[4]		  
        PreparedStatement ps = con.prepareStatement(sql);
        
        
        //[5]
        ResultSet rs = ps.executeQuery();
        rs.next (); //*********값하나 얻어올때 한줄 내려서 적기
        int count = rs.getInt("CNT");
        System.out.println("도훈님 사원수 :" + count);
        
        //[6]
        ps.close();
        con.close();
		
		}catch(Exception ex) {
			System.out.println("[예외]" + ex.getMessage());
			ex.printStackTrace();
		}
	}

}
