package com.codeclan.FilesFoldersUsers;

import com.codeclan.FilesFoldersUsers.models.Folder;
import com.codeclan.FilesFoldersUsers.models.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesFoldersUsersApplicationTests {

	@Autowired
	User user;

	@Autowired
	Folder folder;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canAddFolderToUser() {
		User user = new User("Jane");
		Folder folder = new Folder("Accounts", user);
		user.addFolderToUser(folder);
		assertEquals(1, user.getFolderCount());

	}
}
