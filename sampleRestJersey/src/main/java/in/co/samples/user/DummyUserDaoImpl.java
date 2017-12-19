package in.co.samples.user;

import java.util.ArrayList;
import java.util.List;

public class DummyUserDaoImpl implements UserDao {

	private List<User> userList;
	
	public DummyUserDaoImpl() {
		userList = new ArrayList<User>();
	}
	
	@Override
	public List<User> getAllUsers() {
		Contact contact1 = new Contact("pradeep.cg@tcs.com", "9895476312");
		User user1 = new User(1, "Pradeep", "IT", contact1);
		Contact contact2 = new Contact("", "");
		User user2 = new User(2, "Arun", "Automobile", contact2);
		Contact contact3 = new Contact("tojy@idea.com", "9895476312");
		User user3 = new User(3, "Tojy", "Telecom", contact3);
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
		return userList;
	}

	@Override
	public void saveUser(User user) {
		userList.add(user);
	}

}
