package com.sb1.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb1.main.entity.Users;

public interface UserRepo extends JpaRepository<Users, Integer>{

}
