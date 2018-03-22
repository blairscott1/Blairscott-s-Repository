package sw.study.service;

import sw.study.user.User;

public interface UserService {

	public void addUser(User user);

	public void deleteUser(int id);

	public void updateUser(User user);

	public User getUser(int id);

	public void addUsers();

}
