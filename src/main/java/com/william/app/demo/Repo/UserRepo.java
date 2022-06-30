package com.william.app.demo.Repo;

import com.william.app.demo.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
