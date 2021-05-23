package com.skmonjurul.springbootmysql.repository;

import com.skmonjurul.springbootmysql.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
