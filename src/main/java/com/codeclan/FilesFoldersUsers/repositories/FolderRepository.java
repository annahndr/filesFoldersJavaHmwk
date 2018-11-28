package com.codeclan.FilesFoldersUsers.repositories;

import com.codeclan.FilesFoldersUsers.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
