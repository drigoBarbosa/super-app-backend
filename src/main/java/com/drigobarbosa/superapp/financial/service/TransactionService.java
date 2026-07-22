package com.drigobarbosa.superapp.financial.service;

import com.drigobarbosa.superapp.financial.domain.entity.Transaction;
import com.drigobarbosa.superapp.financial.dto.transaction.request.CreateTransactionRequest;
import com.drigobarbosa.superapp.financial.dto.transaction.response.CreateTransactionResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service


public class TransactionService {

    public CreateTransactionResponse createTransaction(CreateTransactionRequest request) {
        Transaction transaction = new Transaction();

        try {

        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return null;
    }

}
