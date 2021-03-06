package com.springboot.authapiproject.repositories;

import com.springboot.authapiproject.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<User, UUID> {

    User findByLogin(String login);
}
