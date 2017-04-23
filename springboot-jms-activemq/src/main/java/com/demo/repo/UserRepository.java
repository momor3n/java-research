package com.demo.repo;

import com.demo.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long>{
    public User findByLoginId(String loginId);
}
