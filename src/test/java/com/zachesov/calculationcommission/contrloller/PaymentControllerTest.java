package com.zachesov.calculationcommission.contrloller;

import com.zachesov.calculationcommission.model.Payment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class PaymentControllerTest {

    @Autowired
    PaymentController controller;

    @Test
    void calculationCommissionReturnZero() {
        Assertions.assertNotEquals(0,
                controller.calculationCommission(new Payment(null, 100000, 2000, LocalDate.now(), "Коммент")));
    }
}