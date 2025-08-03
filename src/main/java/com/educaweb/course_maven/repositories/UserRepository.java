package com.educaweb.course_maven.repositories;

import com.educaweb.course_maven.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
