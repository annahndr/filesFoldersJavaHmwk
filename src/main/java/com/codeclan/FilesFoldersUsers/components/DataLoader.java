package com.codeclan.FilesFoldersUsers.components;

import com.codeclan.FilesFoldersUsers.models.File;
import com.codeclan.FilesFoldersUsers.models.Folder;
import com.codeclan.FilesFoldersUsers.models.User;
import com.codeclan.FilesFoldersUsers.repositories.FileRepository;
import com.codeclan.FilesFoldersUsers.repositories.FolderRepository;
import com.codeclan.FilesFoldersUsers.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;
    

    public void run(ApplicationArguments args) {
        User person1 = new User("Mina");
        userRepository.save(person1);

        User person2 = new User("Buster");
        userRepository.save(person2);


        Folder folder = new Folder("Accounts", person2);
        File file1 = new File("profit", ".xl", 20, folder);

        fileRepository.save(file1);

        folder.addFileToFolder(file1);

        folderRepository.save(folder);

    }

}
