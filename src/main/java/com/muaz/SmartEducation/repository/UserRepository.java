package com.muaz.SmartEducation.repository;


import com.muaz.SmartEducation.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long>{
    List<User> findByName(String name);
}
