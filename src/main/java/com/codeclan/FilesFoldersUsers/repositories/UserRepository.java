package com.codeclan.FilesFoldersUsers.repositories;

import com.codeclan.FilesFoldersUsers.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {




}
