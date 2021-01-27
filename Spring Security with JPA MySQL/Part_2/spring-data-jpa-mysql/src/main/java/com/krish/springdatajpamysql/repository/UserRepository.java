package com.krish.springdatajpamysql.repository;


import com.krish.springdatajpamysql.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
