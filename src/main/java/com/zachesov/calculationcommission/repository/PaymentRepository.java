package com.zachesov.calculationcommission.repository;

import com.zachesov.calculationcommission.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

    List<Payment> getByUserId(Integer userId);

}
