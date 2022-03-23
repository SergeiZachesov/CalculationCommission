package com.zachesov.calculationcommission.service;

import com.zachesov.calculationcommission.model.Payment;
import com.zachesov.calculationcommission.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository repository;

    @Transactional
    public Integer calculationCommission(Payment payment) {

        if (payment.getDate() == null) {
            payment.setDate(LocalDate.now());
        }

        repository.save(payment);

        List<Payment> payments = repository.getByUserId(payment.getUserId());
        int sumOfMount = payments.stream()
                .filter(p -> p.getDate().getMonthValue() == payment.getDate().getMonthValue())
                .mapToInt(Payment::getAmount)
                .sum();

        int commission = 0;
        if (sumOfMount > 0 && sumOfMount <= 10000) {
            commission = 1;
        } else if (sumOfMount > 10000 && sumOfMount <= 100000) {
            commission = 3;
        } else if (sumOfMount > 100000) {
            commission = 5;
        }
        return commission;
    }
}
