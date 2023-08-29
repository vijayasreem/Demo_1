package com.sales.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sales.demo.model.PaymentMethod;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {

    @Query("SELECT p FROM PaymentMethod p WHERE p.paymentType = ?1")
    PaymentMethod findByPaymentType(String paymentType);
    
    @Query("UPDATE PaymentMethod SET paymentStatus = 'Verified' WHERE paymentType = ?1")
    void updatePaymentStatus(String paymentType);
    
}