package in.co.samples.user;

import java.util.List;

public interface UserDao {

	List<User> getAllUsers();
	void saveUser(User user);
}
