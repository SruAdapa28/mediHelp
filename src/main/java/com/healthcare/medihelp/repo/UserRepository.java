package com.healthcare.medihelp.repo;

import org.springframework.data.repository.CrudRepository;

import com.healthcare.medihelp.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
