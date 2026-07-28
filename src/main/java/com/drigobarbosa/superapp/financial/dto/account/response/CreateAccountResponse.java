package com.drigobarbosa.superapp.financial.dto.account.response;

import com.drigobarbosa.superapp.financial.domain.enums.AccountType;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.math.BigDecimal;
import java.util.UUID;

@Builder
public record CreateAccountResponse (
        UUID id,
        String name,
        AccountType type,
        BigDecimal balance,
        boolean active
) {};
