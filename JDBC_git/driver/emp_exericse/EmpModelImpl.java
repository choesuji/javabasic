package emp_exericse;

import java.sql.*;
import java.util.*;

public class EmpModelImpl implements EmpModel{
	
	/*---------------------------------------------
	 * 생성자 함수 
	 	1. DB 연동
	 		- 드라이버 등록
	*/
	public EmpModelImpl() throws Exception{
	
	}



	
	/*-------------------------------------------------------
	* insert() :  입력한 값 받아서 데이타베이스에 추가
		0. 연결객체 얻어오기
		1. sql문 만들기 ( insert 구문 )
		2. PreparedStatement 객체 생성 
		3. PreparedStatement에 인자 지정
		4. sql문 전송 ( executeUpdate() 이용 )
		5. PreparedStatement 닫기
		6. 연결 닫기
	*/
	public void insert( EmpVO r ) throws SQLException{	

	}


	/*-------------------------------------------------------
	* modify() : 화면 입력값 받아서 수정
		0. 연결객체 얻어오기
		1. sql문 만들기 ( update 구문 )
		2. PreparedStatement 객체 생성 ( 또는 Statement )
		3. PreparedStatement에 인자 지정
		4. sql문 전송 ( executeUpdate() 이용 )
		5. PreparedStatement 닫기
		6. 연결 닫기
	*/
	public void modify( EmpVO r ) throws SQLException{	

	}

	
	/*-------------------------------------------------------
	* selectByEmpno() :  입력받은 사번을 받아서 해당 레코드 검색
		0. 연결객체 얻어오기
		1. sql문 만들기 ( select 구문 )
		2. PreparedStatement 객체 얻기 ( Statement  가능 )
		4. sql문 전송 ( executeQuery() 이용 )
		5. 결과집합(ResultSet)에서 값을 읽어서 EmpVO에 저장
		6. ResultSet/ PreparedStatement 닫기
		7. 연결 닫기
		8. EmpVO 객체 리턴
	*/	
	public EmpVO selectByEmpno( int empno ) throws SQLException{
		EmpVO vo = new EmpVO();


		return vo;	
	}
	
	/*--------------------------------------------------------
	* delete() : 사원번호 값을 받아 해당 레코드 삭제
		0. 연결객체 얻어오기
		1. sql문 만들기 ( delete 구문 )
		2. PreparedStatement 객체 얻기
		3. sql문 전송 ( executeUpdate() 이용 )
		4. PreparedStatement 닫기
		5. 연결 닫기
	*/
	public int delete( int empno ) throws SQLException{
		int resultCnt = 0;		

		return resultCnt;
	}
	
	/*-------------------------------------------------------
	* selectAll() :  전체 레코드 검색
		0. 연결객체 얻어오기
		1. sql문 만들기 ( select 구문 )
		2. PreparedStatement 객체 얻기 ( Statement  가능 )
		4. sql문 전송 ( executeQuery() 이용 )
		5. 결과집합(ResultSet)에서 값을 읽어서 ArrayList에 저장
		6. ResultSet/ PreparedStatement 닫기
		7. 연결 닫기
		8. ArrayList 객체 리턴
	*/	
	public ArrayList selectAll() throws SQLException{
		ArrayList list = new ArrayList();
		
		return list;
	}

}