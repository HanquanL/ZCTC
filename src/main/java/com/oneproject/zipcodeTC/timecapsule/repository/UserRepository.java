package com.oneproject.zipcodeTC.timecapsule.repository;


import com.oneproject.zipcodeTC.timecapsule.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
