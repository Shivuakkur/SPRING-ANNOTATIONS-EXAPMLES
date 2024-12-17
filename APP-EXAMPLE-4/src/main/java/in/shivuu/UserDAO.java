package in.shivuu;

public class UserDAO {
	public void init() {
		System.out.println("getting DB connection....");
	}
	public void getData() {
		System.out.println("getting data from DB....");
	}
	public void destroy() {
		System.out.println("closing DB connection.....");
	}

}
