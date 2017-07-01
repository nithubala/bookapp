package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.model.User;

 
public interface UserRepository  extends JpaRepository<User, Integer> {
    @Query(value="select * from user where username=?1 and password=?2",nativeQuery=true)
    User loginUser(String username,String password);

}

