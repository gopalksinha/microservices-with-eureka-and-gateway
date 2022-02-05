package com.ms.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.order.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>  {

}
