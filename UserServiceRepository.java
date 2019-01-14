package com.my.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.my.spring.entity.User;

@Repository
public interface UserServiceRepository extends CrudRepository<User, Integer>{

}
