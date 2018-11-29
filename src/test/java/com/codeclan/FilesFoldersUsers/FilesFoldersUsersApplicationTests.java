package com.codeclan.FilesFoldersUsers;

import com.codeclan.FilesFoldersUsers.models.File;
import com.codeclan.FilesFoldersUsers.models.Folder;
import com.codeclan.FilesFoldersUsers.models.User;
import com.codeclan.FilesFoldersUsers.repositories.FileRepository;
import com.codeclan.FilesFoldersUsers.repositories.FolderRepository;
import com.codeclan.FilesFoldersUsers.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesFoldersUsersApplicationTests {

	@Autowired //bringing in the repo you can have all the functionality
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canAddUser(){
		User user = new User("Lisa");
		userRepository.save(user);
	}

	@Test
	public void canAddFolder() {
		User user = new User("Lisa");
		userRepository.save(user);

		Folder folder = new Folder("Things", user);
		userRepository.save(user);
	}


	@Test
	public void canAddFileandFolder() {
		User user = new User("Lisa");
		userRepository.save(user);

		Folder folder = new Folder("Things", user);
		userRepository.save(user);

		File file = new File("otherthings", ".txt", 56, folder);
		fileRepository.save(file);

	}



}
