package com.drigobarbosa.superapp.financial.dto.transaction.request;

import com.drigobarbosa.superapp.financial.domain.enums.TransactionMethod;
import com.drigobarbosa.superapp.financial.domain.enums.TransactionType;

import java.math.BigDecimal;

public record CreateTransactionRequest(
        String description,
        BigDecimal amount,
        TransactionType type,
        TransactionMethod method
) { }
