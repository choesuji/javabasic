package g_sigleton;

public class UserB {

	DBConnect db;

	public UserB () {
		//db = new DBConnect();	
		db = DBConnect.getInstance();
	}

	public void use () {
		System.out.println("B작업");
	}
}
