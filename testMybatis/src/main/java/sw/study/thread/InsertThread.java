package sw.study.thread;

import java.util.UUID;

import sw.study.Main;
import sw.study.service.UserService;
import sw.study.user.User;

public class InsertThread implements Runnable {

	UserService userService;
	
	public InsertThread (UserService userService) {
		this.userService = userService;
	}

	public InsertThread(){
	}

	@Override
	public void run() {
		while (Main.currentId.get() <= 1000) {
			User userTemp = new User();
			int id = Main.currentId.incrementAndGet();
			userTemp.setId(id);
			userTemp.setVar00(UUID.randomUUID().toString());
			userTemp.setVar01(UUID.randomUUID().toString());
			userTemp.setVar02(UUID.randomUUID().toString());
			userTemp.setVar03(UUID.randomUUID().toString());
			userTemp.setVar04(UUID.randomUUID().toString());
			userTemp.setVar05(UUID.randomUUID().toString());
			userTemp.setVar06(UUID.randomUUID().toString());
			userTemp.setVar07(UUID.randomUUID().toString());
			userTemp.setVar08(UUID.randomUUID().toString());
			userTemp.setVar09(UUID.randomUUID().toString());
            userService.addUser(userTemp);
            System.out.println("插入ID:" + id);
		}
	}
}
