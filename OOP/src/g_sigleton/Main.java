package g_sigleton;

public class Main {

	public static void main(String[] args) {

		UserA a = new UserA();
		a.use();

		UserB b = new UserB();
		b.use();

		UserC c = new UserC();
		c.use();
		

	}

}
