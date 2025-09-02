package com.educaweb.course_maven.repositories;

import com.educaweb.course_maven.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
