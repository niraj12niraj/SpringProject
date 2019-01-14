package com.my.spring.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.my.spring.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>  {
	Optional<User>findUserByName(String userName);

}
