package g_sigleton;

public class UserA {

	DBConnect db;

	public UserA () {
		//db = new DBConnect();
		db = DBConnect.getInstance();
	}

	public void use () {
		System.out.println("A작업");
	}
}
