package review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/* 
 * 사번/사원이름과 성/ 월급/ 보너스 입력받아서
 * HR 계정에 employees 테이블에 입력
 *
 */
public class EmployeesInsert {

	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	// 방식이 thin, java 두가지가 있어서 뭔지 지정해줘야함
	// thin(방식):@(ip or localhost):(port번호)
	// static String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"
	static String user = "hr"; // 계정
	static String pass = "hr"; // 비번

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("사번");
		int user_num = input.nextInt();
		input.nextLine();
		
		System.out.println("사원이름");
		String user_name = input.nextLine(); 
		
		System.out.println("성");
		String user_sung = input.nextLine(); 
		
		System.out.println("월급");
		int user_sal= input.nextInt(); 
		
		System.out.println("보너스");
		double user_comm = input.nextDouble(); 

		
		try {
			Class.forName(driver);
			
			String sql 	= " INSERT INTO employees (employee_id, first_name, last_name ,salary, email,hire_date, job_id) "
					+ " VALUES( ? , ?, ?, ?, ?,sysdate,'IT_PROG')";
			
			Connection con = DriverManager.getConnection(url, user, pass);
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1,user_num);
			ps.setString(2,user_name);
			ps.setString(3,user_sung);
			ps.setInt(4,user_sal);
			ps.setDouble(5,user_comm);
			
		
			int result = ps.executeUpdate();
			System.out.println(result + "행을 입력");
			
			ps.close();
			con.close();
			 
		}catch (Exception ex) {
			System.out.println("예외 :" + ex.getMessage());
		}
		}

}
