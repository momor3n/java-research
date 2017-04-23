package com.demo.repo;

import com.demo.model.UserTransaction;
import org.springframework.data.repository.CrudRepository;

public interface UserTransactionRepository extends CrudRepository<UserTransaction, Long>{

}
