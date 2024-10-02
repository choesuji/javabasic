package g_sigleton;

public class UserC {

	DBConnect db;

	public UserC () {
		//db = new DBConnect();
		db = DBConnect.getInstance();
	}

	public void use () {
		System.out.println("C작업");
	}
}
