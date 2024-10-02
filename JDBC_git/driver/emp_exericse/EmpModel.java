package emp_exericse;

import java.sql.SQLException;
import java.util.ArrayList;

public interface EmpModel {
	// insert() :  입력한 값 받아서 데이타베이스에 추가
	public void insert( EmpVO r ) throws SQLException;
	
	// modify() : 화면 입력값 받아서 수정
	public void modify( EmpVO r ) throws SQLException;
	
	// selectByEmpno() :  입력받은 사번을 받아서 해당 레코드 검색
	public EmpVO selectByEmpno( int empno ) throws SQLException;
	
	// delete() : 사원번호 값을 받아 해당 레코드 삭제
	public int delete( int empno ) throws SQLException;
	
	// selectAll() :  전체 레코드 검색
	public ArrayList selectAll() throws SQLException;
}
