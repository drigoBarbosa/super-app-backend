package com.drigobarbosa.superapp.financial.controller;

import com.drigobarbosa.superapp.financial.domain.entity.Transaction;
import com.drigobarbosa.superapp.financial.dto.transaction.request.CreateTransactionRequest;
import com.drigobarbosa.superapp.financial.dto.transaction.response.CreateTransactionResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @PostMapping
    public CreateTransactionResponse createTransaction(@RequestBody CreateTransactionRequest request) {
        CreateTransactionResponse response = new CreateTransactionResponse();
        return response;
    }
}
