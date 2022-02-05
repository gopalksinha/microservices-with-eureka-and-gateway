package com.ms.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.payment.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
