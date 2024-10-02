package h_info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class InfoModelImpl implements infoModel {			// db와 연결하는 걸 모델이라고 한다

	// 0. 필요한 변수 선언
	static String driver 	= "oracle.jdbc.driver.OracleDriver";
	static String url 		= "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	static String user 		= "eunbyeol";
	static String pass 		= "park";
	
	public InfoModelImpl() throws ClassNotFoundException {   //예외 발생 시 나를 호출한 곳으로 던짐
		//[1] 드라이버를 메모리 로딩
		Class.forName(driver);
	}
	
	
	// 전체검색을 한 결과를 리턴
	@Override
	public ArrayList <InfoVO> selectInfoAll() throws Exception {   // <infoVO> 빼도 된다
		
		Connection con = null;
		PreparedStatement ps = null;
		
		ArrayList <InfoVO> list = new ArrayList<InfoVO>();  // db에 있는 info_tab 테이블에 저장된 데이터들이 몇 줄 있는지 알 수 없으므로 arraylist 사용
		//<infoVO> 빼도됨

		//2. SQL 문장
		String sql = "SELECT * FROM info_tab ";  // 전체검색이므로 where절 없음
		
		try {
			// 3. 연결객체
			con = DriverManager.getConnection(url, user, pass);
			
			// 4.전송객체
			ps = con.prepareStatement(sql);
//			ps.setString(1, tel);  31행에 물음표없으므로 필요없는 행
			
			//[5] 전송
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {		// info_tab에 데이터가 여러개이므로 while문 사용			
				InfoVO vo = new InfoVO(); 	// 한사람에 대한 정보를 하나하나씩 인포vo에 담아서
				vo.setName(rs.getString("NAME"));
				vo.setId(rs.getString("JUMIN"));
				vo.setTel(rs.getString("TEL"));
				vo.setSex(rs.getString("GENDER"));
				vo.setAge(rs.getInt("AGE"));
				vo.setHome(rs.getString("HOME"));
				
				list.add(vo); // 위에 하나하나씩 담은 인포vo 덩어리를 list에 넣는다. 여기서list는 29행과 같이 변수명
			
			} //end of while
			
		} finally{
			
			ps.close();
			con.close();
			
		}// end of finally	
		
		return list;
		
	} // end of public ArrayList
	
	
	
	//// 전화번호를 얻어서 해당 고객정보를 지우기
	@Override
	public void deleteInfo(String tel) throws Exception {
		
		
		// 2. SQL 문장
		String sql = "DELETE FROM info_tab WHERE tel =? ";
		
		try {
		// 3. 연결객체
		Connection con= DriverManager.getConnection(url, user, pass);
					
		// 4.전송객체
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, tel);
		
		// 5. 전송
		//int executeUpdate() : INSERT, UPDATE, DELETE, DDL
		//ResultSet executeQuery() : SELECT
		 ps.executeUpdate();
//			SYSO
		
		 //[6] 닫기
		ps.close();
		con.close();
		
		} catch (Exception ex){
		 System.out.println("예외처리완료" + ex.getMessage());
		
		}
		
	}// end of catch
	
	// 전화번호를 입력 받아 해당 고객정보를 디비에서 검색하여 InfoVO 지정하여 리턴
	@Override
	public InfoVO selectINfoByTel(String tel) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		
		System.out.println(tel);
		
		InfoVO vo = new InfoVO();
		
		//2. SQL 문장
		String sql = "SELECT * FROM info_tab WHERE tel =? ";
		
		try {
			// 3. 연결객체
			con = DriverManager.getConnection(url, user, pass);
			
			// 4.전송객체
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			
			//[5] 전송
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				vo.setName(rs.getString("NAME"));      // vo.setNAME vo꺼 , (rs.)이건 데이터베이스꺼// 비어있는 vo에(27행에 new infovo()를 만들어줌) setNAME을 (rs.) 처럼 괄호안에 있는 거로 설정해준다.
				vo.setAge(rs.getInt("Age"));
				vo.setHome(rs.getString("Home"));
				vo.setId(rs.getString("jumin"));
				vo.setSex(rs.getString("GENDER"));
				vo.setTel(rs.getString("TEL"));
			}
			
		}finally {
			ps.close();
			con.close();
		}// end of finally
		
		return vo;
	}
	
	// 넘겨받은 InfoVO의 멤버 값들을 디비에 입력
	@Override
	public void modifyInfo(InfoVO vo) throws Exception{
		
		Connection con = null;  
		PreparedStatement ps = null;
		
		// 2. sql 문장
		String sql = "UPDATE info_tab	"
				+	" SET name=?, jumin=?, age=?, gender=?, home=?	"
				+	" WHERE tel=? ";      //pk인 tel을 조건으로 해준다.
		
		try {
		// 3. 연결 객체 얻어오기
		//Connection con = DriverManager.getConnection(url, user, pass);
//			->62행에 com.close를 하려면 Connection가 인식될 수 있게 같은 괄호안에 있어야 한다. 때문에 여기다 적지않고 23행에 빼주어서 오류를 해결
		con = DriverManager.getConnection(url, user, pass);
		
		//[4] 전송객체 얻어오기
		/*
		 * 		- Statement  		: 완벽한 SQL 문장
		 * 		- PreparedStatement : 미완성한 SQL 문장
		 * 		- CallableStatemetn : PL-SQL 함수 (function/proceudre) 호출			 * 
		 */
		//Statement ps = con.createStatement();
		ps = con.prepareStatement(sql);
		// 미완성부분을 채우기
		ps.setString(1, vo.getName());
		ps.setString(2, vo.getId());
		ps.setInt(3, vo.getAge());
		ps.setString(4, vo.getSex());
		ps.setString(5, vo.getHome());
		ps.setString(6, vo.getTel());
	
		
		// 5. 전송
//		 int executeUpdate() : INSERT, UPDATE, DELETE, DDL
//		 ResultSet executeQuery() : SELECT

		int result = ps.executeUpdate(); //40행에 con.prepareStatement(sql)에 sql이 들어갔으므로 여기에는 적지 않는다.
		System.out.println(result + "형 입력");
		
		} finally {
			
		// 6. 닫기       // finally는 무조건 수행함. 
		ps.close();
		con.close();
	
		} // end of finally
		
	} // end of main
	
	
	
	// 넘겨받은 InfoVO의 멤버 값들을 디비에 입력
	@Override
	public void insertInfo(InfoVO vo) throws Exception{
		
		Connection con = null;  
		PreparedStatement ps = null;
		
		// 2. sql 문장
		String sql = "Insert INTO" 
				+	 " info_tab( name, tel, jumin, gender, age, home, deptno)	"
				+	 " VALUES(?,?,?,?,?,?,10)	";	// DEPTNO는 10번으로 고정값 주기
		
		try {
		// 3. 연결 객체 얻어오기
		//Connection con = DriverManager.getConnection(url, user, pass);
//			->62행에 com.close를 하려면 Connection가 인식될 수 있게 같은 괄호안에 있어야 한다. 때문에 여기다 적지않고 23행에 빼주어서 오류를 해결
		con = DriverManager.getConnection(url, user, pass);
		
		//[4] 전송객체 얻어오기
		/*
		 * 		- Statement  		: 완벽한 SQL 문장
		 * 		- PreparedStatement : 미완성한 SQL 문장
		 * 		- CallableStatemetn : PL-SQL 함수 (function/proceudre) 호출			 * 
		 */
		//Statement ps = con.createStatement();
		ps = con.prepareStatement(sql);
		// 미완성부분을 채우기
		ps.setString(1, vo.getName());
		ps.setString(2, vo.getTel());
		ps.setString(3, vo.getId());
		ps.setString(4, vo.getSex());
		ps.setInt(5, vo.getAge());
		ps.setString(6, vo.getHome());
	
		
		// 5. 전송
//		 int executeUpdate() : INSERT, UPDATE, DELETE, DDL
//		 ResultSet executeQuery() : SELECT

		int result = ps.executeUpdate(); //40행에 con.prepareStatement(sql)에 sql이 들어갔으므로 여기에는 적지 않는다.
		System.out.println(result + "형 입력");
		
		} finally {
			
		// 6. 닫기       // finally는 무조건 수행함. 
		ps.close();
		con.close();
	
		} // end of finally
		
	} // end of main
	
}// end of class
