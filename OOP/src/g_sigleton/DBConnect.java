package g_sigleton;

public class DBConnect {

	private DBConnect () {  //딴데서 못쓰게함 프라이빗
		System.out.println("실제 디비에 연결함");
	}

	private static DBConnect dbconn = null;

	public static DBConnect getInstance () {
		if(dbconn == null) dbconn = new DBConnect ();
		return dbconn;
	}


}
