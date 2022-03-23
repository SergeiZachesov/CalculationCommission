package com.zachesov.calculationcommission.contrloller;

import com.zachesov.calculationcommission.model.Payment;
import com.zachesov.calculationcommission.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    PaymentService service;

    @PostMapping("")
    public Integer calculationCommission(@RequestBody Payment payment) {
        return service.calculationCommission(payment);
    }
}
