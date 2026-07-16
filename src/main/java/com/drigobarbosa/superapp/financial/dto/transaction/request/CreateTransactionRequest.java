package com.drigobarbosa.superapp.financial.dto.transaction.request;

import com.drigobarbosa.superapp.financial.domain.enums.PaymentMethod;
import com.drigobarbosa.superapp.financial.domain.enums.TransactionType;

public record CreateTransactionRequest(
        String description,
        TransactionType type,
        PaymentMethod method
) { }
