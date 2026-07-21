package com.drigobarbosa.superapp.financial.dto.transaction.request;

import com.drigobarbosa.superapp.financial.domain.entity.Account;
import com.drigobarbosa.superapp.financial.domain.entity.Category;
import com.drigobarbosa.superapp.financial.domain.entity.Subcategory;
import com.drigobarbosa.superapp.financial.domain.enums.TransactionMethod;
import com.drigobarbosa.superapp.financial.domain.enums.TransactionType;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CreateTransactionRequest(
        String description,

        @NotNull
        BigDecimal amount,

        @NotNull
        LocalDate transactionDate,

        @NotNull
        Account account,

        @NotNull
        Long categoryId,

        Long subcategoryId,

        @NotNull
        TransactionType type,

        @NotNull
        TransactionMethod method
) { }
