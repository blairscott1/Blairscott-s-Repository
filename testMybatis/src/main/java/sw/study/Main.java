package sw.study;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import sw.study.service.UserService;
import sw.study.thread.InsertThread;

/**
 * <p>标题：</p>
 * <p>功能：</p>
 * <p>
 * 其他说明：
 * </p>
 * <p>作者：冀小雷</p>
 * <p>审核：</p>
 * <p>重构：</p>
 * <p>创建日期：2018年3月16日上午9:54:15</p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
public class Main {
	public static AtomicInteger currentId = new AtomicInteger();
	public static void main(String[] args) {
		currentId.set(0);
		String[] locations = new String[] { "beans.xml" };
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(locations);) {
			context.refresh();
			context.start();

			UserService userservice = (UserService) context.getBean("userservice");

			ThreadPoolTaskExecutor poolTaskExecutor = (ThreadPoolTaskExecutor) context.getBean("taskExecutor");

			for (int i = 0; i < 10; i++) {
                InsertThread insertThread = new InsertThread(userservice);
                poolTaskExecutor.execute(insertThread);
            }

//			User user = userservice.getUser(1);
//			System.out.println(user);

//			User addUser = new User();
//			addUser.setId(3);
//			userservice.addUser(addUser);

//			userservice.deleteUser(2);

//			User updateUser = new User();
//			updateUser.setId(1);
//			updateUser.setVar00("100");
//			updateUser.setVar01("100");
//			updateUser.setVar02("100");
//			updateUser.setVar03("100");
//			updateUser.setVar04("100");
//			updateUser.setVar05("100");
//			updateUser.setVar06("100");
//			updateUser.setVar07("100");
//			updateUser.setVar08("100");
//			updateUser.setVar09("100");
//			userservice.updateUser(updateUser);
		}
	}
}