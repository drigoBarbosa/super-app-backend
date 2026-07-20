package com.drigobarbosa.superapp.financial.dto.transaction.request;

import com.drigobarbosa.superapp.financial.domain.entity.Account;
import com.drigobarbosa.superapp.financial.domain.entity.Category;
import com.drigobarbosa.superapp.financial.domain.entity.Subcategory;
import com.drigobarbosa.superapp.financial.domain.enums.TransactionMethod;
import com.drigobarbosa.superapp.financial.domain.enums.TransactionType;

import java.math.BigDecimal;

public record CreateTransactionRequest(
        String description,
        BigDecimal amount,
        Account account,
        Category category,
        Subcategory subcategory,
        TransactionType type,
        TransactionMethod method
) { }
