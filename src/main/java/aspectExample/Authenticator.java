package aspectExample;

public class Authenticator {

	public Boolean authenticate(User user) {
		System.out.println("Authenticating " + user.getName());
		return true;
	};
}
