package com.wesleyscorrea.springcomviacep.repositories;

import com.wesleyscorrea.springcomviacep.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
