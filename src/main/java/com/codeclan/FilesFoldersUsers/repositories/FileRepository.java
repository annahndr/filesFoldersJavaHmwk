package com.codeclan.FilesFoldersUsers.repositories;

import com.codeclan.FilesFoldersUsers.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
