package com.drigobarbosa.superapp.financial.service;

import com.drigobarbosa.superapp.financial.domain.entity.Transaction;
import com.drigobarbosa.superapp.financial.dto.transaction.request.CreateTransactionRequest;
import com.drigobarbosa.superapp.financial.dto.transaction.response.CreateTransactionResponse;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    public CreateTransactionResponse createTransaction(CreateTransactionRequest request) {
        Transaction transaction = new Transaction();

        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

}
