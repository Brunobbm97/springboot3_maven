package com.educaweb.course_maven.repositories;

import com.educaweb.course_maven.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
