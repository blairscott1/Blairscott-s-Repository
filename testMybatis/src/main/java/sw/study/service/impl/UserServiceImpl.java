package sw.study.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sw.study.service.UserService;
import sw.study.user.User;
import sw.study.user.UserMapper;

@Service("userservice")
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public User getUser(int id) {
		return userMapper.getUser(id);
	}

	@Override
	public void addUser(User user) {
		userMapper.addUser(user);
	}

	@Override
	public void deleteUser(int id) {
		userMapper.deleteUser(id);
	}

	@Override
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	@Override
	public void addUsers() {
		
	}
}