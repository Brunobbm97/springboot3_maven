package com.educaweb.course_maven.repositories;

import com.educaweb.course_maven.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
