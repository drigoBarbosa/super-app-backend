package com.drigobarbosa.superapp.financial.dto.account.request;

import com.drigobarbosa.superapp.financial.domain.enums.AccountType;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record CreateAccountRequest(
        @NotNull
        String name,
        @NotNull
        AccountType type,
        @NotNull
        BigDecimal balance,
        boolean active
) { }
